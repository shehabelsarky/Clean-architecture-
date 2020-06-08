package com.architecture.clean.data.source.cloud

import com.architecture.clean.data.restful.ApiService
import com.architecture.clean.domain.model.PopularActorDetails
import com.architecture.clean.domain.model.popular_person.remote.PopularPersonsResponse

class CloudRepository(private val apIs: ApiService) : BaseCloudRepository {
    override suspend fun popularPersonDetails(personId: String): PopularActorDetails {
        return apIs.popularPersonDetails(personId)
    }

    override suspend fun searchPersons(page: Int, actorName: String): PopularPersonsResponse {
        return apIs.searchPersons(page,actorName)
    }

    override suspend fun getPopularPersons(page: Int): PopularPersonsResponse {
        return apIs.getPopularPersons(page)
    }
}
