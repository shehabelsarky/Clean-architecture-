package com.architecture.clean.data.restful

import com.architecture.clean.core.Config
import com.architecture.clean.domain.model.popular_person.remote.PopularPersonsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET(Config.POPULAR_ACTORS)
    suspend fun getPopularPersons(@Query("page") page: Int): PopularPersonsResponse
}