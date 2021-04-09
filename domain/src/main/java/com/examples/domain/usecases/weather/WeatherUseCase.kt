package com.examples.domain.usecases.weather

import com.examples.data.mapper.CloudErrorMapper
import com.examples.data.repository.AppRepository
import com.examples.domain.base.RemoteUseCase
import com.examples.domain.mappers.weather.WeatherMapper
import com.examples.entities.weather.local.Weather
import com.examples.entities.weather.response.RemoteWeatherResponse
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.*
import javax.inject.Inject

/**
 * Created by Shehab Elsarky
 */
@ExperimentalCoroutinesApi
@FlowPreview
class WeatherUseCase @Inject constructor(
    errorUtil: CloudErrorMapper,
    private val appRepository: AppRepository,
    private val mapper: WeatherMapper
) : RemoteUseCase<String, RemoteWeatherResponse, Weather>(errorUtil) {

    override suspend fun convert(dto: RemoteWeatherResponse): Weather {
        return flowOf(dto.response)
            .map {
                mapper.convert(dto.response)
            }.first()
    }

    override suspend fun executeOnBackground(parameters: String): RemoteWeatherResponse {
        return appRepository.getWeatherByCityName(parameters)
    }
}