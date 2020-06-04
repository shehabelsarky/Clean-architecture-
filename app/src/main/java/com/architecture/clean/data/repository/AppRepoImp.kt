package com.architecture.clean.data.repository

import com.architecture.clean.data.source.cloud.BaseCloudRepository
import com.architecture.clean.data.source.db.FoodDao
import com.architecture.clean.domain.model.Food
import com.architecture.clean.domain.model.FoodDto
import com.architecture.clean.domain.model.popular_person.remote.PopularPersonsResponse
import com.architecture.clean.domain.repository.AppRepository
import javax.inject.Inject

class AppRepoImp @Inject constructor(
    private val cloudRepository: BaseCloudRepository
) : AppRepository {
    override suspend fun getPopularPersons(page: Int): PopularPersonsResponse {
        return cloudRepository.getPopularPersons(page)
    }
}