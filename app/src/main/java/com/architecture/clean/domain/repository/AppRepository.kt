package com.architecture.clean.domain.repository

import com.architecture.clean.domain.model.PopularActorDetails
import com.architecture.clean.domain.model.popular_person.remote.PopularPersonsResponse

interface AppRepository{
    suspend fun getPopularPersons(page: Int): PopularPersonsResponse
    suspend fun popularPersonDetails(personId: String): PopularActorDetails
    suspend fun searchPersons(
        page: Int,
        actorName: String
    ): PopularPersonsResponse
}