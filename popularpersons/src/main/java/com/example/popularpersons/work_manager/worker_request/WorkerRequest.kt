package com.example.popularpersons.work_manager.worker_request

import androidx.work.*
import com.example.popularpersons.utils.POPULAR_PERSON_TAG
import com.example.popularpersons.utils.POPULAR_PERSON_WORKER_USE_CASE
import com.example.popularpersons.work_manager.data.PopularPersonsData
import com.example.popularpersons.work_manager.worker.CoroutinePopularPersonsWorker
import java.util.concurrent.TimeUnit


class WorkerRequest{
    private val constraints = Constraints.Builder()
        .setRequiredNetworkType(NetworkType.CONNECTED)
        .build()

    fun getPopularPersonsWMWorkRequest(): WorkRequest{
        return OneTimeWorkRequestBuilder<CoroutinePopularPersonsWorker>()
            .setConstraints(constraints)
            .setBackoffCriteria(
                BackoffPolicy.LINEAR,
                OneTimeWorkRequest.MIN_BACKOFF_MILLIS,
                TimeUnit.MILLISECONDS
            )
            .addTag(POPULAR_PERSON_TAG)
            .build()
    }
}