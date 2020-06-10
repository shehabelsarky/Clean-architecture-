package com.architecture.clean.data.repository

import com.architecture.clean.data.source.cloud.BaseCloudRepository
import com.architecture.clean.domain.model.PopularActorDetails
import com.architecture.clean.domain.model.popular_person.remote.PopularPersonsResponse
import com.architecture.clean.domain.repository.AppRepository
import javax.inject.Inject

class AppRepoImp @Inject constructor(
    private val cloudRepository: BaseCloudRepository
) : AppRepository {
    override suspend fun popularPersonDetails(personId: String): PopularActorDetails {
        return cloudRepository.popularPersonDetails(personId)
    }

    override suspend fun searchPersons(page: Int, actorName: String): PopularPersonsResponse {
        return cloudRepository.searchPersons(page,actorName)
    }

    override suspend fun getPopularPersons(page: Int): PopularPersonsResponse {
        return cloudRepository.getPopularPersons(page)
    }
}