package com.examples.data.restful

import com.examples.entities.popular_person.remote.PopularPersonsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET(Config.POPULAR_ACTORS)
    suspend fun getPopularPersons(@Query("page") page: Int): PopularPersonsResponse

    @GET(Config.SEARCH_ACTORS)
    suspend fun searchPersons(
        @Query("page") page: Int,
        @Query("query") actorName: String
    ): PopularPersonsResponse

    suspend fun searchPersonsReturnsData(
        @Query("page") page: Int,
        @Query("query") actorName: String
    ): PopularPersonsResponse
}