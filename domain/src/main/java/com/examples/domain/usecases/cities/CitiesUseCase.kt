package com.examples.domain.usecases.cities

import com.examples.data.mapper.CloudErrorMapper
import com.examples.data.repository.AppRepository
import com.examples.domain.base.RemoteUseCase
import com.examples.domain.mappers.cities.CitiesMapper
import com.examples.entities.city.local.City
import com.examples.entities.city.remote.RemoteCity
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
) : RemoteUseCase<Unit, List<RemoteCity>, List<City>>(errorUtil) {

    @ExperimentalCoroutinesApi
    @FlowPreview
    override suspend fun convert(dto: List<RemoteCity>): List<City> {
        val cities = arrayListOf<City>()

        return flowOf(dto)
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

    override suspend fun executeOnBackground(parameters: Unit): List<RemoteCity> {
        return appRepository.getCities()
    }
}