package com.architecture.clean.data.restful

import com.architecture.clean.core.Config
import com.architecture.clean.core.Config.POPULAR_PERSON
import com.architecture.clean.core.Config.SEARCH_ACTORS
import com.architecture.clean.domain.model.PopularActorDetails
import com.architecture.clean.domain.model.popular_person.remote.PopularPersonsResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET(Config.POPULAR_ACTORS)
    suspend fun getPopularPersons(@Query("page") page: Int): PopularPersonsResponse

    @GET(Config.POPULAR_ACTOR_DETAILS)
    suspend fun popularPersonDetails(
        @Path(
            value = POPULAR_PERSON,
            encoded = true
        ) personId: String
    ): PopularActorDetails


    @GET(SEARCH_ACTORS)
    suspend fun searchPersons(
        @Query("page") page: Int,
        @Query("query") actorName: String
    ): PopularPersonsResponse
}