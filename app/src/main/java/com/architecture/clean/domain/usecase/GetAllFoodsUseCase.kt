package com.architecture.clean.domain.usecase

import com.architecture.clean.data.mapper.CloudErrorMapper
import com.architecture.clean.domain.model.Food
import com.architecture.clean.domain.repository.AppRepository
import com.architecture.clean.domain.usecase.base.UseCase
import javax.inject.Inject

class GetAllFoodsUseCase @Inject constructor(
    errorUtil: CloudErrorMapper,
    private val appRepository: AppRepository
) : UseCase<Unit,MutableList<Food>,Unit>(errorUtil) {
    override suspend fun convert(dto: MutableList<Food>) {

    }

    override suspend fun executeOnBackground(parameters: Unit): MutableList<Food> {
        return appRepository.selectAllFoods()
    }

}