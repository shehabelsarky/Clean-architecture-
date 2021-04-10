package com.examples.domain.mappers.cities

import com.examples.entities.city.local.City
import com.examples.entities.city.remote.RemoteCity
import javax.inject.Inject

/**
 * Created by Shehab Elsarky
 */
class CitiesMapper @Inject constructor() {

    fun convert(dtoItem: RemoteCity): City {
        return City(
            cityName = dtoItem.name?:""
        )
    }
}