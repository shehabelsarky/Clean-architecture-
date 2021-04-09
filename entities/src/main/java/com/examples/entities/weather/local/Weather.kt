package com.examples.entities.weather.local

/**
 * Created by Shehab Elsarky
 */
data class Weather(
    var cityName: String = "",
    var main: String = "",
    var description : String = "",
    var minTemperature: String = "",
    var maxTemperature: String = ""
)