package com.architecture.clean.ui.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.architecture.clean.domain.model.response.ErrorModel
import java.util.concurrent.CancellationException
import javax.inject.Inject

open class BaseViewModel @Inject constructor() : ViewModel() {
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
}