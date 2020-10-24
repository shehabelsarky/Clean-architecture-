package com.examples.domain.usecases.popular_persons

import com.examples.data.repository.AppRepository
import com.examples.domain.base.LocalUseCase
import com.examples.entities.popular_person.local.PopularPersons
import javax.inject.Inject

open class InsertPopularPersonUseCase@Inject constructor(
    private val appRepository: AppRepository
) : LocalUseCase<PopularPersons,Long>() {

    override suspend fun executeOnBackground(parameters: PopularPersons): Long {
        return appRepository.insertPopularPerson(parameters)
    }
}