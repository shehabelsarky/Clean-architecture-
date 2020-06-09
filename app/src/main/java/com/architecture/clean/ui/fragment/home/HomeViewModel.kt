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
import kotlinx.coroutines.channels.ConflatedBroadcastChannel
import kotlinx.coroutines.launch
import javax.inject.Inject

@ExperimentalCoroutinesApi
class HomeViewModel @Inject constructor(
    private val popularPersonsUseCase: PopularPersonsUseCase,
    private val searchPopularPersonsUseCase: SearchPopularPersonsUseCase
) : BaseViewModel() {
    private val TAG = HomeViewModel::class.java.simpleName

    private val popularPersonsList = arrayListOf<PopularPersons>()

    val popularPersonsChannel = ConflatedBroadcastChannel<ArrayList<PopularPersons>>()
    fun getPopularPersons(parameters: PopularPersonsRequest) {

        popularPersonsUseCase.execute(parameters) {
            isLoading(::setLoading)
            onError(::setErrorReason)
            onCancel(::setCancellationReason)

            onComplete {
                Log.d(TAG, it.toString())
                viewModelScope.launch {
                    popularPersonsList.addAll(it as ArrayList<PopularPersons>)
                    popularPersonsChannel.offer(popularPersonsList)
                }
            }
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