package com.architecture.clean.ui.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.architecture.clean.domain.model.response.ErrorModel
import com.architecture.clean.domain.model.response.ErrorStatus
import com.architecture.clean.domain.usecase.base.CompletionBlock
import javax.inject.Inject

open class BaseViewModel @Inject constructor() : ViewModel() {
    private val isLoading: MutableLiveData<Boolean> by lazy { MutableLiveData<Boolean>() }
    val isLoadingLiveData: MutableLiveData<Boolean> by lazy { isLoading }

    private val error: MutableLiveData<ErrorModel> by lazy { MutableLiveData<ErrorModel>() }
    val errorLiveData: LiveData<ErrorModel> by lazy { error }

    private val cancellationMessage: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    val cancellationMsgLiveData: LiveData<String> by lazy { cancellationMessage }

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
}