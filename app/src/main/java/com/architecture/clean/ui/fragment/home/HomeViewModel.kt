package com.architecture.clean.ui.fragment.home

import androidx.lifecycle.MutableLiveData
import android.util.Log
import androidx.lifecycle.LiveData
import com.architecture.clean.domain.model.popular_person.local.PopularPersons
import com.architecture.clean.domain.model.popular_person.parameters.PopularPersonsRequest
import com.architecture.clean.domain.usecase.popular_persons.GetPopularPersonsUseCase
import com.architecture.clean.ui.view_model.BaseViewModel
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    private val getPopularPersonsUseCase: GetPopularPersonsUseCase
) : BaseViewModel() {
    private val TAG = HomeViewModel::class.java.simpleName

    private val popularPersonsData: MutableLiveData<ArrayList<PopularPersons>>
            by lazy { MutableLiveData<ArrayList<PopularPersons>>() }

    val popularPersonsLiveData: LiveData<ArrayList<PopularPersons>> = popularPersonsData
    fun getPopularPersons(parameters: PopularPersonsRequest) {
        getPopularPersonsUseCase.execute(parameters) {
            isLoading (::setLoading)
            onError (::setErrorReason)
            onCancel(::setCancellationReason)

            onComplete {
                Log.d(TAG, it.toString())
                popularPersonsData.value = it as ArrayList<PopularPersons>
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        getPopularPersonsUseCase.unsubscribe()
    }
}