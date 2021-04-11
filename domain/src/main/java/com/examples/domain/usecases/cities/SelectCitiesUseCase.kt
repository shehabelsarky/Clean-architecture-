package com.examples.domain.usecases.cities

import com.examples.data.repository.AppRepository
import com.examples.domain.base.LocalUseCase
import com.examples.entities.city.local.City
import javax.inject.Inject

/**
 * Created by Shehab Elsarky
 */
class SelectCitiesUseCase @Inject constructor(
    private val appRepository: AppRepository
) : LocalUseCase<Unit, MutableList<City>>() {

    override suspend fun executeOnBackground(parameters: Unit): MutableList<City> {
        return appRepository.selectAllCities()
    }
}