package com.examples.data.repository

import com.examples.entities.PopularActorDetails
import com.examples.entities.city.remote.RemoteCity
import com.examples.entities.popular_person.local.PopularPersons
import com.examples.entities.popular_person.remote.PopularPersonsResponse
import com.examples.entities.weather.remote.RemoteWeather

/**
 * Created by Shehab Elsarky
 */
interface AppRepository{
    suspend fun getPopularPersons(page: Int): PopularPersonsResponse
    suspend fun popularPersonDetails(personId: String): PopularActorDetails
    suspend fun searchPersons(
        page: Int,
        actorName: String
    ): PopularPersonsResponse

    suspend fun insertPopularPerson(popularPerson: PopularPersons)
    suspend fun selectPopularPerson(): MutableList<PopularPersons>
    suspend fun deletePopularPersonTable()


    suspend fun getWeatherByCityName(
        cityName: String
    ): RemoteWeather

    suspend fun getCities(): List<RemoteCity>
}