package com.examples.data.source.cloud

import com.examples.data.restful.ApiService
import com.examples.entities.PopularActorDetails
import com.examples.entities.popular_person.remote.PopularPersonsResponse

class CloudRepository(private val apIs: ApiService) : BaseCloudRepository {
    override suspend fun popularPersonDetails(personId: String): com.examples.entities.PopularActorDetails {
        return apIs.popularPersonDetails(personId)
    }

    override suspend fun searchPersons(page: Int, actorName: String): PopularPersonsResponse {
        return apIs.searchPersons(page,actorName)
    }

    override suspend fun getPopularPersons(page: Int): PopularPersonsResponse {
        return apIs.getPopularPersons(page)
    }
}
