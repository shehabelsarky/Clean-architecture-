package com.architecture.clean.ui.fragment.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData
import com.architecture.clean.domain.model.popular_person.local.PopularPersons
import com.architecture.clean.domain.model.popular_person.parameters.PopularPersonsRequest
import com.architecture.clean.domain.usecase.popular_persons.PopularPersonsUseCase
import com.architecture.clean.domain.usecase.search_popular_persons.SearchPopularPersonsUseCase
import com.architecture.clean.ui.view_model.BaseViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.ConflatedBroadcastChannel
import javax.inject.Inject

@ExperimentalCoroutinesApi
class HomeViewModel @Inject constructor(
    private val popularPersonsUseCase: PopularPersonsUseCase,
    private val searchPopularPersonsUseCase: SearchPopularPersonsUseCase
) : BaseViewModel() {
    private val TAG = HomeViewModel::class.java.simpleName

    val popularPersonsChannel : ConflatedBroadcastChannel<List<PopularPersons>> by lazy {
        ConflatedBroadcastChannel<List<PopularPersons>>()
    }

    fun getPopularPersons(parameters: PopularPersonsRequest) {
        callApi(popularPersonsChannel){ statesCallBack ->
            popularPersonsUseCase.execute(parameters,statesCallBack)
        }
    }

    private val searchPopularPersonsData: MutableLiveData<List<PopularPersons>>
            by lazy { MutableLiveData<List<PopularPersons>>() }
    val searchPopularPersonsLiveData: LiveData<List<PopularPersons>> = searchPopularPersonsData

    fun searchPopularPersons(parameters: PopularPersonsRequest) {
        callApi(searchPopularPersonsData) { statesCallBack ->
            searchPopularPersonsUseCase.execute(parameters, statesCallBack)
        }
    }

    override fun onCleared() {
        super.onCleared()
        popularPersonsUseCase.unsubscribe()
    }
}