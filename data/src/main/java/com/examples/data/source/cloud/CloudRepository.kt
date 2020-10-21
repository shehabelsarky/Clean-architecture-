package com.examples.data.source.cloud

import com.examples.data.restful.ApiService
import com.examples.entities.popular_person.remote.PopularPersonsResponse

class CloudRepository(private val apIs: ApiService) : BaseCloudRepository {

    override suspend fun searchPersons(page: Int, actorName: String): PopularPersonsResponse {
        return apIs.searchPersons(page,actorName)
    }

    override suspend fun searchPersonsReturnsData(
        page: Int,
        actorName: String
    ): PopularPersonsResponse {
        return apIs.searchPersonsReturnsData(page,actorName)
    }

    override suspend fun getPopularPersons(page: Int): PopularPersonsResponse {
        return apIs.getPopularPersons(page)
    }
}
