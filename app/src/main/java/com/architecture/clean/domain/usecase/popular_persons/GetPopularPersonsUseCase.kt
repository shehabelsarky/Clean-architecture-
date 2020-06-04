package com.architecture.clean.domain.usecase.popular_persons

import com.architecture.clean.data.mapper.CloudErrorMapper
import com.architecture.clean.domain.mappers.popular_persons.PopularPersonsMapper
import com.architecture.clean.domain.model.FoodBO
import com.architecture.clean.domain.model.popular_person.local.PopularPersons
import com.architecture.clean.domain.model.popular_person.parameters.PopularPersonsRequest
import com.architecture.clean.domain.model.popular_person.remote.PopularPersonsResponse
import com.architecture.clean.domain.repository.AppRepository
import com.architecture.clean.domain.usecase.base.UseCase
import javax.inject.Inject

class GetPopularPersonsUseCase @Inject constructor(
        errorUtil: CloudErrorMapper,
        private val appRepository: AppRepository
) : UseCase<PopularPersonsRequest, PopularPersonsResponse, List<PopularPersons>>(errorUtil) {

    override suspend fun convert(dto: PopularPersonsResponse): List<PopularPersons> {
       return dto.results?.map {
           PopularPersonsMapper.convert(it)
        }?: listOf()
    }

    override suspend fun executeOnBackground(parameters: PopularPersonsRequest): PopularPersonsResponse {
        return appRepository.getPopularPersons(parameters.page,parameters.apiKey)
    }
}