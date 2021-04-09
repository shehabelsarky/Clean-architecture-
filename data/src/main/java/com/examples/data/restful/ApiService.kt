package com.examples.data.restful


import com.examples.entities.popular_person.remote.PopularPersonsResponse
import com.examples.entities.weather.response.RemoteWeatherResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Created by Shehab Elsarky
 */
interface ApiService {

    @GET(Config.POPULAR_ACTORS)
    suspend fun getPopularPersons(@Query("page") page: Int): PopularPersonsResponse

    @GET(Config.POPULAR_ACTOR_DETAILS)
    suspend fun popularPersonDetails(
        @Path(
            value = Config.POPULAR_PERSON,
            encoded = true
        ) personId: String
    ): com.examples.entities.PopularActorDetails


    @GET(Config.SEARCH_ACTORS)
    suspend fun searchPersons(
        @Query("page") page: Int,
        @Query("query") actorName: String
    ): PopularPersonsResponse

    @GET(Config.WEATHER)
    suspend fun getWeatherByCityName(
        @Query("q") cityName: String
    ): RemoteWeatherResponse
}