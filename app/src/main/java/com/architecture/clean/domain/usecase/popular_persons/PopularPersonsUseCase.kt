package com.architecture.clean.domain.usecase.popular_persons

import com.architecture.clean.data.mapper.CloudErrorMapper
import com.architecture.clean.domain.mappers.popular_persons.PopularPersonsMapper
import com.architecture.clean.domain.model.popular_person.local.PopularPersons
import com.architecture.clean.domain.model.popular_person.parameters.PopularPersonsRequest
import com.architecture.clean.domain.model.popular_person.remote.PopularPersonsResponse
import com.architecture.clean.domain.repository.AppRepository
import com.architecture.clean.domain.usecase.base.UseCase
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.*
import javax.inject.Inject

class PopularPersonsUseCase @Inject constructor(
    errorUtil: CloudErrorMapper,
    private val appRepository: AppRepository,
    private val mapper: PopularPersonsMapper
) : UseCase<PopularPersonsRequest, PopularPersonsResponse, List<PopularPersons>>(errorUtil) {

    @FlowPreview
    override suspend fun convert(dto: PopularPersonsResponse): List<PopularPersons> {
        val popularPersons = arrayListOf<PopularPersons>()

        return flowOf(dto.results)
            .map {
                it?.forEach { result ->
                    popularPersons.add(mapper.convert(result))
                }
                popularPersons
            }
            .flatMapConcat {
                it.asFlow()
            }
            .toList()
    }

    override suspend fun executeOnBackground(parameters: PopularPersonsRequest): PopularPersonsResponse {
        return appRepository.getPopularPersons(parameters.page)
    }
}