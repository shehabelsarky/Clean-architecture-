package com.architecture.clean.domain.repository

import com.architecture.clean.domain.model.Food
import com.architecture.clean.domain.model.FoodDto
import com.architecture.clean.domain.model.popular_person.remote.PopularPersonsResponse

interface AppRepository{
    suspend fun getHome(void: Unit): FoodDto
    suspend fun saveFoods(foodDto: FoodDto): Long
    suspend fun selectAllFoods() : MutableList<Food>
    suspend fun getPopularPersons(page: Int): PopularPersonsResponse
}