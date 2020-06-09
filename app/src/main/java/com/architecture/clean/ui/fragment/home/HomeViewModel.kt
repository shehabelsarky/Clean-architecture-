package com.architecture.clean.ui.fragment.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.architecture.clean.domain.model.popular_person.local.PopularPersons
import com.architecture.clean.domain.model.popular_person.parameters.PopularPersonsRequest
import com.architecture.clean.domain.usecase.popular_persons.GetPopularPersonsUseCase
import com.architecture.clean.ui.view_model.BaseViewModel
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    private val getPopularPersonsUseCase: GetPopularPersonsUseCase
) : BaseViewModel() {
    private val TAG = HomeViewModel::class.java.simpleName

    private val popularPersonsData: MutableLiveData<List<PopularPersons>>
            by lazy { MutableLiveData<List<PopularPersons>>() }

    val popularPersonsLiveData: LiveData<List<PopularPersons>> = popularPersonsData
    fun getPopularPersons(parameters: PopularPersonsRequest) {
        callApi(popularPersonsData) { statesCallBack ->
            getPopularPersonsUseCase.execute(parameters, statesCallBack)
        }
    }


    override fun onCleared() {
        super.onCleared()
        getPopularPersonsUseCase.unsubscribe()
    }
}