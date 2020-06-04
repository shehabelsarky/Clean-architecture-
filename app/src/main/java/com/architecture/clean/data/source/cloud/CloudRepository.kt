package com.architecture.clean.data.source.cloud

import com.architecture.clean.data.restful.ApiService
import com.architecture.clean.domain.model.FoodDto
import com.architecture.clean.domain.model.popular_person.remote.PopularPersonsResponse

class CloudRepository(private val apIs: ApiService) : BaseCloudRepository {
    override suspend fun getPopularPersons(page: Int,apiKey: String): PopularPersonsResponse {
        return apIs.getPopularPersons(apiKey,page).await()
    }

    override suspend fun getHome(void: Unit): FoodDto {
        return apIs.getHome().await()
    }

}
