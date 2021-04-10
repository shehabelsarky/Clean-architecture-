package com.examples.domain.mappers.weather

import com.examples.entities.weather.local.Weather
import com.examples.entities.weather.remote.RemoteWeather
import javax.inject.Inject

/**
 * Created by Shehab Elsarky
 */
class WeatherMapper @Inject constructor() {

    fun convert(dtoItem: RemoteWeather?): List<Weather> {
        val weatherList = arrayListOf<Weather>()
        if (!dtoItem?.weather.isNullOrEmpty())
            for (i in dtoItem?.weather!!.indices)
                weatherList.add(
                    Weather(
                        cityName = dtoItem.name ?: "",
                        main = if (dtoItem.weather.isNullOrEmpty()) "" else dtoItem.weather!![i].main ?: "",
                        description = if (dtoItem.weather.isNullOrEmpty()) "" else dtoItem.weather!![i].description
                            ?: "",
                        minTemperature = dtoItem.main?.tempMin?.toString() ?: "",
                        maxTemperature = dtoItem.main?.tempMax?.toString() ?: ""
                    )
                )

        return weatherList
    }
}