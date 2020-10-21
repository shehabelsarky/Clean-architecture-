package com.examples.domain.usecases.popular_persons

import com.examples.data.repository.AppRepository
import com.examples.domain.base.LocalUseCase
import javax.inject.Inject

class DropPopularPersonsUseCase @Inject constructor(
    private val appRepository: AppRepository
) : LocalUseCase<Unit, Int>() {

    override suspend fun executeOnBackground(parameters: Unit): Int {
        return appRepository.deletePopularPersonTable()
    }
}