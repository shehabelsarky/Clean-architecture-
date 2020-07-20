package com.examples.domain.popular_persons

import com.examples.data.mapper.CloudErrorMapper
import com.examples.entities.popular_person.local.PopularPersons
import com.examples.entities.popular_person.parameters.PopularPersonsQuery
import com.examples.entities.popular_person.remote.PopularPersonsResponse
import com.examples.data.repository.AppRepository
import com.examples.domain.base.RemoteUseCase
import com.examples.domain.mappers.popular_persons.PopularPersonsMapper
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.*
import javax.inject.Inject

class PopularPersonsRemoteUseCase @Inject constructor(
    errorUtil: CloudErrorMapper,
    private val appRepository: AppRepository,
    private val mapper: PopularPersonsMapper
) : RemoteUseCase<PopularPersonsQuery, PopularPersonsResponse, List<PopularPersons>>(errorUtil) {

    @ExperimentalCoroutinesApi
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
            .transform {
                val filteredPopularPersons = arrayListOf<PopularPersons>()
                filteredPopularPersons.addAll(it)
                emit(filteredPopularPersons)
            }
            .flatMapConcat {
                it.asFlow()
            }
            .toList()
    }

    override suspend fun executeOnBackground(parameters: PopularPersonsQuery): PopularPersonsResponse {
        return appRepository.getPopularPersons(parameters.page)
    }
}