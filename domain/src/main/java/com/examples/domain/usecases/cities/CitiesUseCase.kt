package com.examples.domain.usecases.cities

import com.examples.data.mapper.CloudErrorMapper
import com.examples.data.repository.AppRepository
import com.examples.domain.base.RemoteUseCase
import com.examples.domain.mappers.cities.CitiesMapper
import com.examples.entities.city.local.City
import com.examples.entities.city.response.RemoteCitiesResponse
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.*
import javax.inject.Inject

/**
 * Created by Shehab Elsarky
 */
class CitiesUseCase @Inject constructor(
    errorUtil: CloudErrorMapper,
    private val appRepository: AppRepository,
    private val mapper: CitiesMapper
) : RemoteUseCase<Unit, RemoteCitiesResponse, List<City>>(errorUtil) {

    @ExperimentalCoroutinesApi
    @FlowPreview
    override suspend fun convert(dto: RemoteCitiesResponse): List<City> {
        val cities = arrayListOf<City>()

        return flowOf(dto.response)
            .map {
                it?.forEach { result ->
                    cities.add(mapper.convert(result))
                }
                cities
            }
            .flatMapConcat {
                it.asFlow()
            }
            .toList()
    }

    override suspend fun executeOnBackground(parameters: Unit): RemoteCitiesResponse {
        return appRepository.getCities()
    }
}