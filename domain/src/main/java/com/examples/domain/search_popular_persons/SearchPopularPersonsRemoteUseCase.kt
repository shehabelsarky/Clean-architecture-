package com.examples.domain.search_popular_persons

import com.examples.data.mapper.CloudErrorMapper
import com.examples.entities.popular_person.local.PopularPersons
import com.examples.entities.popular_person.parameters.PopularPersonsQuery
import com.examples.entities.popular_person.remote.PopularPersonsResponse
import com.examples.data.repository.AppRepository
import com.examples.domain.base.RemoteUseCase
import com.examples.domain.mappers.popular_persons.PopularPersonsMapper
import javax.inject.Inject

class SearchPopularPersonsRemoteUseCase @Inject constructor(
    errorUtil: CloudErrorMapper,
    private val appRepository: AppRepository,
    private val mapper: PopularPersonsMapper
) : RemoteUseCase<PopularPersonsQuery, PopularPersonsResponse, List<PopularPersons>>(errorUtil) {
    override suspend fun convert(dto: PopularPersonsResponse): List<PopularPersons> {
        return dto.results?.map {
            mapper.convert(it)
        } ?: listOf()
    }

    override suspend fun executeOnBackground(parameters: PopularPersonsQuery): PopularPersonsResponse {
        return appRepository.searchPersons(parameters.page, parameters.personsName)
    }
}