package com.example.popularpersons.ui.fragment.home

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData
import com.examples.entities.popular_person.local.PopularPersons
import com.examples.entities.popular_person.parameters.PopularPersonsQuery
import com.examples.domain.popular_persons.PopularPersonsUseCase
import com.examples.domain.search_popular_persons.SearchPopularPersonsUseCase
import com.examples.core.base.view_model.BaseViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.ConflatedBroadcastChannel

@ExperimentalCoroutinesApi
class HomeViewModel @ViewModelInject constructor(
    private val popularPersonsUseCase: PopularPersonsUseCase,
    private val searchPopularPersonsUseCase: SearchPopularPersonsUseCase
) : BaseViewModel() {
    private val TAG = HomeViewModel::class.java.simpleName

    val popularPersonsChannel : ConflatedBroadcastChannel<List<PopularPersons>> by lazy {
        ConflatedBroadcastChannel<List<PopularPersons>>()
    }

    fun getPopularPersons(parameters: PopularPersonsQuery) {
        callApi(popularPersonsChannel){ statesCallBack ->
            popularPersonsUseCase.execute(parameters,statesCallBack)
        }
    }

    private val searchPopularPersonsData: MutableLiveData<List<PopularPersons>>
            by lazy { MutableLiveData<List<PopularPersons>>() }
    val searchPopularPersonsLiveData: LiveData<List<PopularPersons>> = searchPopularPersonsData

    fun searchPopularPersons(parameters: PopularPersonsQuery) {
        callApi(searchPopularPersonsData) { statesCallBack ->
            searchPopularPersonsUseCase.execute(parameters, statesCallBack)
        }
    }

    override fun onCleared() {
        super.onCleared()
        popularPersonsUseCase.unsubscribe()
    }
}