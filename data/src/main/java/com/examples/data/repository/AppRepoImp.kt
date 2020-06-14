package com.examples.data.repository

import com.examples.data.source.cloud.BaseCloudRepository
import com.examples.entities.PopularActorDetails
import com.examples.entities.popular_person.remote.PopularPersonsResponse
import javax.inject.Inject

class AppRepoImp @Inject constructor(
    private val cloudRepository: BaseCloudRepository
) : AppRepository {
    override suspend fun popularPersonDetails(personId: String): com.examples.entities.PopularActorDetails {
        return cloudRepository.popularPersonDetails(personId)
    }

    override suspend fun searchPersons(page: Int, actorName: String): PopularPersonsResponse {
        return cloudRepository.searchPersons(page,actorName)
    }

    override suspend fun getPopularPersons(page: Int): PopularPersonsResponse {
        return cloudRepository.getPopularPersons(page)
    }
}