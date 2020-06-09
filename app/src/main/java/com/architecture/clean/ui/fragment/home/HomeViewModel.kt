package com.architecture.clean.ui.fragment.home

import androidx.lifecycle.MutableLiveData
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.architecture.clean.domain.model.popular_person.local.PopularPersons
import com.architecture.clean.domain.model.popular_person.parameters.PopularPersonsRequest
import com.architecture.clean.domain.usecase.popular_persons.PopularPersonsUseCase
import com.architecture.clean.domain.usecase.search_popular_persons.SearchPopularPersonsUseCase
import com.architecture.clean.ui.view_model.BaseViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.BroadcastChannel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import javax.inject.Inject

@ExperimentalCoroutinesApi
class HomeViewModel @Inject constructor(
    private val popularPersonsUseCase: PopularPersonsUseCase,
    private val searchPopularPersonsUseCase: SearchPopularPersonsUseCase
) : BaseViewModel() {
    private val TAG = HomeViewModel::class.java.simpleName

    private val popularPersonsList = arrayListOf<PopularPersons>()

    val popularPersonsChannel = BroadcastChannel<ArrayList<PopularPersons>>(20)
    fun getPopularPersons(parameters: PopularPersonsRequest) {

        popularPersonsUseCase.execute(parameters) {
            isLoading(::setLoading)
            onError(::setErrorReason)
            onCancel(::setCancellationReason)

            onComplete {
                Log.d(TAG, it.toString())
                viewModelScope.launch {
                    popularPersonsList.addAll(it as ArrayList<PopularPersons>)
                    popularPersonsChannel.send(popularPersonsList)
                }
            }
        }
    }

    private val searchPopularPersonsData: MutableLiveData<ArrayList<PopularPersons>>
            by lazy { MutableLiveData<ArrayList<PopularPersons>>() }
    val searchPopularPersonsLiveData: LiveData<ArrayList<PopularPersons>> = searchPopularPersonsData

    fun searchPopularPersons(parameters: PopularPersonsRequest) {

        searchPopularPersonsUseCase.execute(parameters) {
            isLoading(::setLoading)
            onError(::setErrorReason)
            onCancel(::setCancellationReason)

            onComplete {
                Log.d(TAG, it.toString())
                searchPopularPersonsData.value = it as ArrayList<PopularPersons>
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        popularPersonsUseCase.unsubscribe()
    }
}