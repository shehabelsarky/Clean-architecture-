package com.architecture.clean.ui.fragment.home

import androidx.lifecycle.MutableLiveData
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.architecture.clean.domain.model.popular_person.local.PopularPersons
import com.architecture.clean.domain.model.popular_person.parameters.PopularPersonsRequest
import com.architecture.clean.domain.model.response.ErrorModel
import com.architecture.clean.domain.model.response.ErrorStatus
import com.architecture.clean.domain.usecase.popular_persons.GetPopularPersonsUseCase
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    private val getPopularPersonsUseCase: GetPopularPersonsUseCase
) : ViewModel() {
    private val TAG = HomeViewModel::class.java.simpleName
    private val popularPersonsData: MutableLiveData<ArrayList<PopularPersons>> by lazy { MutableLiveData<ArrayList<PopularPersons>>() }
    val error: MutableLiveData<ErrorModel> by lazy { MutableLiveData<ErrorModel>() }

    val popularPersonsLiveData: LiveData<ArrayList<PopularPersons>> = popularPersonsData
    fun getPopularPersons(parameters: PopularPersonsRequest) {
        getPopularPersonsUseCase.execute(parameters) {
            onComplete {
                Log.d(TAG, it.toString())
                popularPersonsData.value = it as ArrayList<PopularPersons>
            }

            onError { throwable ->
                when {
                    throwable.errorStatus == ErrorStatus.UNAUTHORIZED -> {

                    }
                    else -> error.value = throwable
                }

            }

            onCancel {

            }
        }
    }


    override fun onCleared() {
        super.onCleared()
        getPopularPersonsUseCase.unsubscribe()
    }
}