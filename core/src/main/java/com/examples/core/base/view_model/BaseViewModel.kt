package com.examples.core.base.view_model

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.examples.entities.response.ErrorModel
import com.examples.entities.response.ErrorStatus
import com.examples.domain.base.CompletionBlock
import java.util.concurrent.CancellationException
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.ConflatedBroadcastChannel
import kotlinx.coroutines.launch

@ExperimentalCoroutinesApi
open class BaseViewModel @ViewModelInject constructor() : ViewModel() {
    private val isLoading: MutableLiveData<Boolean> by lazy { MutableLiveData<Boolean>() }
    val isLoadingLiveData: MutableLiveData<Boolean> by lazy { isLoading }

    private val error: MutableLiveData<ErrorModel> by lazy { MutableLiveData<ErrorModel>() }
    val errorLiveData: LiveData<ErrorModel> by lazy { error }

    private val cancellationMessage: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    val cancellationMsgLiveData: LiveData<String> by lazy { cancellationMessage }

    fun setLoading(isLoading: Boolean){
        this.isLoading.value = isLoading
    }

    fun setErrorReason(errorModel: ErrorModel){
        error.value = errorModel
    }

    fun setCancellationReason(cancellationException: CancellationException){
        cancellationMessage.value = cancellationException.message
    }

    fun <T> callApi(data: MutableLiveData<T> ,apiCall: (CompletionBlock<T>)->Unit) {
        apiCall.invoke {
            isLoading {
                isLoading.value = it
            }
            onComplete {
                data.value = it
            }
            onError { throwable ->
                when (throwable.errorStatus) {
                    ErrorStatus.UNAUTHORIZED -> {
                    }
                    else -> error.value = throwable
                }

            }
            onCancel {
                cancellationMessage.value = it.message
            }
        }
    }

    fun <T> callApi(data: ConflatedBroadcastChannel<T>, apiCall: (CompletionBlock<T>)->Unit) {
        apiCall.invoke {
            isLoading {
                isLoading.value = it
            }
            onComplete {
                viewModelScope.launch {
                    data.offer(it)
                }
            }
            onError { throwable ->
                when (throwable.errorStatus) {
                    ErrorStatus.UNAUTHORIZED -> {
                    }
                    else -> error.value = throwable
                }

            }
            onCancel {
                cancellationMessage.value = it.message
            }
        }
    }
}