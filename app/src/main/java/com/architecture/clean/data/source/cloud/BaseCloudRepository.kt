package com.architecture.clean.data.source.cloud

import com.architecture.clean.domain.model.FoodDto
import com.architecture.clean.domain.model.popular_person.remote.PopularPersonsResponse

interface BaseCloudRepository {
   suspend fun getHome(void: Unit): FoodDto
   suspend fun getPopularPersons(page: Int,apiKey: String): PopularPersonsResponse
}