package com.architecture.clean.domain.usecase

import com.architecture.clean.data.mapper.CloudErrorMapper
import com.architecture.clean.domain.model.FoodBO
import com.architecture.clean.domain.model.FoodDto
import com.architecture.clean.domain.repository.AppRepository
import com.architecture.clean.domain.usecase.base.UseCase
import javax.inject.Inject

class GetHomeUseCase @Inject constructor(
        errorUtil: CloudErrorMapper,
        private val appRepository: AppRepository
) : UseCase<Unit,FoodDto, FoodBO>(errorUtil) {

    override suspend fun convert(dto: FoodDto): FoodBO {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun executeOnBackground(parameters: Unit): FoodDto {
        return appRepository.getHome(parameters)
    }
}