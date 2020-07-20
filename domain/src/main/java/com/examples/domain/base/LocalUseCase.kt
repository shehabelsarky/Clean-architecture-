package com.examples.domain.base

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

typealias CompleteBlock<F> = LocalUseCase.Request<F>.() -> Unit

/**
 * @type T represents object type
 * @type R represtents return value
 */
abstract class LocalUseCase<T, R> {
    private var parentJob: Job = Job()
    private var backgroundContext: CoroutineContext = Dispatchers.IO

    protected abstract suspend fun executeOnBackground(parameters: T): R

    fun execute(parameters: T, block: CompleteBlock<R>) {
        val response = Request<R>().apply { block() }
        unsubscribe()
        parentJob = Job()
        CoroutineScope(backgroundContext + parentJob).launch {
            try {
                val result = withContext(backgroundContext) {
                    executeOnBackground(parameters)
                }
                response(result)
            } catch (cancellationException: CancellationException) {
                response(cancellationException)
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
        private var onComplete: ((T) -> Unit)? = null
        private var onCancel: ((CancellationException) -> Unit)? = null

        fun onComplete(block: (T) -> Unit) {
            onComplete = block
        }

        fun onCancel(block: (CancellationException) -> Unit) {
            onCancel = block
        }

        operator fun invoke(result: T) {
            onComplete?.invoke(result)
        }

        operator fun invoke(error: CancellationException) {
            onCancel?.invoke(error)
        }
    }
}