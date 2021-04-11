package com.examples.domain.usecases.cities

import com.examples.data.repository.AppRepository
import com.examples.domain.base.LocalUseCase
import com.examples.entities.city.local.City
import com.examples.entities.popular_person.local.PopularPersons
import javax.inject.Inject

/**
 * Created by Shehab Elsarky
 */
class InsertCityUseCase@Inject constructor(
    private val appRepository: AppRepository
) : LocalUseCase<City,Unit>() {

    override suspend fun executeOnBackground(parameters: City): Unit {
        return appRepository.insertCity(parameters)
    }
}