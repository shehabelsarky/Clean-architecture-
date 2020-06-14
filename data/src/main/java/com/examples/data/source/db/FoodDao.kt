package com.examples.data.source.db

import androidx.room.*
import com.examples.entities.Food


@Dao
interface FoodDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFood(food: com.examples.entities.Food): Long

    @Delete
   suspend fun deleteFood(food: com.examples.entities.Food): Int

    @Query("SELECT * from Food")
   suspend fun selectAllFoods(): MutableList<com.examples.entities.Food>

}