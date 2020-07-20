package com.examples.domain.base

import com.examples.data.mapper.CloudErrorMapper
import com.examples.entities.response.ErrorModel
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

typealias CompletionBlock<T> = RemoteUseCase.Request<T>.() -> Unit

/**
 * @type in P paramater
 * @type R DTO result
 * @type FR(final result) mapped DTO to BO
 */
abstract class RemoteUseCase<P, R, FR>(val errorUtil: CloudErrorMapper) {

    private var parentJob: Job = Job()
    private var backgroundContext: CoroutineContext = Dispatchers.IO
    private var foregroundContext: CoroutineContext = Dispatchers.Main

    protected abstract suspend fun executeOnBackground(parameters: P): R
    protected abstract suspend fun convert(dto: R): FR

    fun execute(parameters: P, block: CompletionBlock<FR>) {
        val response = Request<FR>().apply { block() }
        unsubscribe()
        parentJob = Job()
        CoroutineScope(foregroundContext + parentJob).launch {
            response(true)
            try {
                val result = withContext(backgroundContext) {
                    executeOnBackground(parameters)
                }
                response(convert(result))
                response(false)
            } catch (cancellationException: CancellationException) {
                response(cancellationException)
                response(false)
            } catch (e: Exception) {
                val error = errorUtil.mapToDomainErrorException(e)
                response(error)
                response(false)
            }
        }
    }


    fun unsubscribe() {
        parentJob.apply {
            cancelChildren()
            cancel()
        }
    }


    class Request<T> {
        private var isLoading: ((Boolean) -> Unit)? = null
        private var onComplete: ((T) -> Unit)? = null
        private var onError: ((ErrorModel) -> Unit)? = null
        private var onCancel: ((CancellationException) -> Unit)? = null

        fun isLoading(isLoading: (Boolean) -> Unit) {
            this.isLoading = isLoading
        }

        fun onComplete(block: (T) -> Unit) {
            onComplete = block
        }

        fun onError(block: (ErrorModel) -> Unit) {
            onError = block
        }

        fun onCancel(block: (CancellationException) -> Unit) {
            onCancel = block
        }

        operator fun invoke(loading: Boolean) {
            isLoading?.invoke(loading)
        }

        operator fun invoke(result: T) {
            onComplete?.invoke(result)
        }

        operator fun invoke(error: ErrorModel) {
            onError?.invoke(error)
        }

        operator fun invoke(error: CancellationException) {
            onCancel?.invoke(error)
        }
    }
}