package com.examples.domain.usecases.weather

import com.examples.data.mapper.CloudErrorMapper
import com.examples.data.repository.AppRepository
import com.examples.domain.base.RemoteUseCase
import com.examples.domain.mappers.weather.WeatherMapper
import com.examples.entities.weather.local.Weather
import com.examples.entities.weather.remote.RemoteWeather
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
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
) : RemoteUseCase<String, RemoteWeather, List<Weather>>(errorUtil) {

    override suspend fun convert(dto: RemoteWeather): List<Weather> {
        return mapper.convert(dto)
    }

    override suspend fun executeOnBackground(parameters: String): RemoteWeather {
        return appRepository.getWeatherByCityName(parameters)
    }
}