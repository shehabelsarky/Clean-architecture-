package com.examples.data.source.db

import androidx.room.*
import com.examples.entities.city.local.City

/**
 * Created by Shehab Elsarky
 */
@Dao
interface CitiesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCity(city: City)

    @Query("SELECT * from City ORDER BY id ASC")
    suspend fun selectAllCities(): MutableList<City>
}