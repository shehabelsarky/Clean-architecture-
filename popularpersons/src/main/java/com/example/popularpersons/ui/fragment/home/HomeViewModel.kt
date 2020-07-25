package com.example.popularpersons.ui.fragment.home

import android.content.Context
import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import androidx.work.WorkManager
import com.example.popularpersons.work_manager.data.PopularPersonsData
import com.example.popularpersons.work_manager.worker_request.WorkManagerHelper
import com.example.popularpersons.work_manager.worker_request.WorkerRequest
import com.examples.entities.popular_person.local.PopularPersons
import com.examples.entities.popular_person.parameters.PopularPersonsQuery
import com.examples.domain.popular_persons.PopularPersonsRemoteUseCase
import com.examples.domain.search_popular_persons.SearchPopularPersonsRemoteUseCase
import com.examples.core.base.view_model.BaseViewModel
import com.examples.domain.popular_persons.DropPopularPersonsUseCase
import com.examples.domain.popular_persons.InsertPopularPersonUseCase
import com.examples.domain.popular_persons.SelectPopularPersonsUseCase
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.ConflatedBroadcastChannel
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@ExperimentalCoroutinesApi
class HomeViewModel @ViewModelInject constructor(
    private val popularPersonsUseCase: PopularPersonsRemoteUseCase,
    private val searchPopularPersonsUseCase: SearchPopularPersonsRemoteUseCase,
    private val insertPopularPersonsUseCase: InsertPopularPersonUseCase,
    private val selectPopularPersonsUseCase: SelectPopularPersonsUseCase,
    private val dropPopularPersonsUseCase: DropPopularPersonsUseCase
) : BaseViewModel() {
    private val TAG = HomeViewModel::class.simpleName

    val popularPersonsChannel: ConflatedBroadcastChannel<List<PopularPersons>> by lazy {
        ConflatedBroadcastChannel<List<PopularPersons>>()
    }


    fun getPopularPersons(parameters: PopularPersonsQuery) {
        popularPersonsUseCase.execute(parameters) {
            onComplete {
                viewModelScope.launch {
                    popularPersonsChannel.offer(it)
                }
                it.map(::insertPopularPerson)
            }
            onError(::setErrorReason)
            onCancel(::setCancellationReason)
            isLoading(::setLoading)
        }
    }


    private fun insertPopularPerson(popularPerson: PopularPersons) {
        viewModelScope.launch {
            insertPopularPersonsUseCase.execute(popularPerson) {
                onComplete {
                    Log.d(TAG, "Inserting...Id= ${popularPerson.entityId} name= ${popularPerson.name}")
                }
                onCancel {
                    Log.d(TAG, "Insert exception occurred...")
                }
            }
        }
    }

    fun selectPopularPersons() {
        viewModelScope.launch {
            selectPopularPersonsUseCase.execute(Unit) {
                onComplete {
                    it.map {
                        Log.d(TAG, "Selected data...id:${it.id} name:${it.name}")
                    }
                    viewModelScope.launch {
                        popularPersonsChannel.offer(it)
                    }
                }
                onCancel {
                    Log.d(TAG, "Coroutine is cancelled")
                }
            }
        }
    }

    private fun dropPopularPersons(popularPerson: List<PopularPersons>) {
        viewModelScope.launch {
            dropPopularPersonsUseCase.execute(Unit) {
                onComplete {
                    Log.d(TAG, "Popular persons table is nuked")
                    // TODO() if you want to drop table then insert call insert method here
                }
                onCancel {
                    Log.d(TAG, "Coroutine is cancelled")
                }
            }
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