package com.examples.data.source.cloud

import com.examples.data.restful.FakeApiService
import com.examples.entities.popular_person.remote.PopularPersonsResponse

/**
 * The only difference between this and the real CloudRepository is the ApiService is
 * fake and it's not being injected so I can change it at runtime.
 * That way I can alter the FakeApiService for each individual test.
 */
open class FakeCloudRepository(private val apIs: FakeApiService) : BaseCloudRepository {

    override suspend fun searchPersons(page: Int, actorName: String): PopularPersonsResponse {
        return apIs.searchPersons(page,actorName)
    }

    override suspend fun getPopularPersons(page: Int): PopularPersonsResponse {
        return apIs.getPopularPersons(page)
    }
}
