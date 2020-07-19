package com.example.popularpersons.ui.fragment.home

import android.content.Context
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData
import androidx.work.WorkManager
import com.example.popularpersons.work_manager.data.PopularPersonsData
import com.example.popularpersons.work_manager.worker_request.WorkManagerHelper
import com.example.popularpersons.work_manager.worker_request.WorkerRequest
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

    val popularPersonsChannel: ConflatedBroadcastChannel<List<PopularPersons>> by lazy {
        ConflatedBroadcastChannel<List<PopularPersons>>()
    }

    fun getPopularPersons(parameters: PopularPersonsQuery) {
        callApi(popularPersonsChannel) { statesCallBack ->
            popularPersonsUseCase.execute(parameters, statesCallBack)
        }
    }

    fun getPopularPersons(parameters: PopularPersonsQuery, context: Context) {

        PopularPersonsData().apply {
            this.popularPersonsUseCase = this@HomeViewModel.popularPersonsUseCase
            this.parameters = parameters

        }.also {
            WorkManagerHelper.popularPersonData = it
            WorkManager
                .getInstance(context)
                .enqueue(
                    WorkerRequest().getPopularPersonsWMWorkRequest()
                )
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