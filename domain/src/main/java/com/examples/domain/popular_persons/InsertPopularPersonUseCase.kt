package com.examples.domain.popular_persons

import com.examples.data.repository.AppRepository
import com.examples.domain.base.LocalUseCase
import com.examples.entities.popular_person.local.PopularPersons
import javax.inject.Inject

class InsertPopularPersonUseCase@Inject constructor(
    private val appRepository: AppRepository
) : LocalUseCase<PopularPersons,Unit>() {

    override suspend fun executeOnBackground(parameters: PopularPersons): Unit {
        return appRepository.insertPopularPerson(parameters)
    }
}