package com.examples.data.source.cloud

import com.examples.entities.popular_person.remote.PopularPersonsResponse
import com.examples.entities.weather.response.RemoteWeatherResponse

/**
 * Created by Shehab Elsarky
 */
interface BaseCloudRepository {
    suspend fun getPopularPersons(page: Int): PopularPersonsResponse
    suspend fun popularPersonDetails(personId: String): com.examples.entities.PopularActorDetails
    suspend fun searchPersons(
        page: Int,
        actorName: String
    ): PopularPersonsResponse


    suspend fun getWeatherByCityName(
        cityName: String
    ): RemoteWeatherResponse
}