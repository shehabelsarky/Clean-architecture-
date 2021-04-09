package com.examples.domain.mappers.weather

import com.examples.entities.weather.local.Weather
import com.examples.entities.weather.remote.RemoteWeather
import javax.inject.Inject

/**
 * Created by Shehab Elsarky
 */
class WeatherMapper @Inject constructor() {

    fun convert(dtoItem: RemoteWeather?): Weather {
        return Weather(
            cityName = dtoItem?.name ?: "",
            main = if (dtoItem?.weather.isNullOrEmpty()) "" else dtoItem?.weather!![0].main ?: "",
            description = if (dtoItem?.weather.isNullOrEmpty()) "" else dtoItem?.weather!![0].description ?: "",
            minTemperature = dtoItem?.main?.tempMin?.toString()?:"",
            maxTemperature = dtoItem?.main?.tempMax?.toString()?:""
        )
    }
}