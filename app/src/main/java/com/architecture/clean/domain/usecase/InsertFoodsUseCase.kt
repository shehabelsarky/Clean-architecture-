package com.architecture.clean.domain.usecase

import com.architecture.clean.data.mapper.CloudErrorMapper
import com.architecture.clean.domain.model.FoodDto
import com.architecture.clean.domain.repository.AppRepository
import com.architecture.clean.domain.usecase.base.UseCase
import javax.inject.Inject

class InsertFoodsUseCase @Inject constructor(
        errorUtil: CloudErrorMapper,
        private val appRepository: AppRepository
) : UseCase<Unit,Long,Unit>(errorUtil) {
    override suspend fun convert(dto: Long) {

    }

    var foodDto=FoodDto(arrayListOf())

    override suspend fun executeOnBackground(parameters: Unit): Long {
        return appRepository.saveFoods(foodDto)
    }
}