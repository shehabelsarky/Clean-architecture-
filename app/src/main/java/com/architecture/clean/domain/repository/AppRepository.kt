package com.architecture.clean.domain.repository

import com.architecture.clean.domain.model.popular_person.remote.PopularPersonsResponse

interface AppRepository{
    suspend fun getPopularPersons(page: Int): PopularPersonsResponse
}