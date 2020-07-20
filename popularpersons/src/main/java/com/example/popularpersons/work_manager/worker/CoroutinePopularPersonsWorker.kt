package com.example.popularpersons.work_manager.worker

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.appizona.yehiahd.fastsave.FastSave
import com.example.popularpersons.utils.WORK_MANAGER_STATE
import com.example.popularpersons.work_manager.data.PopularPersonsData
import com.example.popularpersons.work_manager.worker_request.WorkManagerHelper
import com.examples.data.types.WorkManagerWorkerResultType
import com.examples.domain.popular_persons.PopularPersonsRemoteUseCase
import com.examples.entities.popular_person.parameters.PopularPersonsQuery
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.withContext

class CoroutinePopularPersonsWorker(
    context: Context,
    params: WorkerParameters
) : CoroutineWorker(context, params) {

    var resultType = WorkManagerWorkerResultType.SUCCESS

    override suspend fun doWork(): Result = coroutineScope {

        val dataInput= WorkManagerHelper.popularPersonData

        if (dataInput == null)
            Result.failure()

        withContext(IO) {
            if (dataInput is PopularPersonsData) {

                getWorkResult(
                    executePopularPersonUseCase(
                        dataInput.parameters!!,
                        dataInput.popularPersonsUseCase!!
                    )
                )

            } else Result.failure()

        }
    }

    private fun executePopularPersonUseCase(parameters: PopularPersonsQuery,popularPersonsUseCase: PopularPersonsRemoteUseCase): WorkManagerWorkerResultType{
        popularPersonsUseCase.execute(parameters) {
            onComplete {
                resultType = WorkManagerWorkerResultType.SUCCESS
                FastSave.getInstance().saveString(WORK_MANAGER_STATE,"SUCCESS")
            }
            onError {
                resultType = WorkManagerWorkerResultType.RETRY
                FastSave.getInstance().saveString(WORK_MANAGER_STATE,"RETRY")
            }
            onCancel {
                resultType = WorkManagerWorkerResultType.FAILURE
                FastSave.getInstance().saveString(WORK_MANAGER_STATE,"FAILURE")
            }
        }
        return resultType
    }

    private fun getWorkResult(workManagerWorkerResultType: WorkManagerWorkerResultType): Result {

        return when (workManagerWorkerResultType) {
            WorkManagerWorkerResultType.SUCCESS -> {
                Result.success()
            }
            WorkManagerWorkerResultType.RETRY -> {
                Result.retry()
            }
            WorkManagerWorkerResultType.FAILURE -> {
                Result.failure()
            }
        }
    }
}