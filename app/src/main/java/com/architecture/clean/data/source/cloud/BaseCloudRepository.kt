package com.architecture.clean.data.source.cloud

import com.architecture.clean.core.Config
import com.architecture.clean.domain.model.FoodDto
import com.architecture.clean.domain.model.PopularActorDetails
import com.architecture.clean.domain.model.popular_person.remote.PopularPersonsResponse

interface BaseCloudRepository {
   suspend fun getPopularPersons(page: Int): PopularPersonsResponse
   suspend fun popularPersonDetails(personId: String): PopularActorDetails
   suspend fun searchPersons(
      page: Int,
      actorName: String
   ): PopularPersonsResponse
}