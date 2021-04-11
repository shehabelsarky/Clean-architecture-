package com.examples.data.source.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.examples.entities.city.local.City

/**
 * Created by Shehab Elsarky
 */
@Database(entities = [City::class], version = AppDatabase.VERSION, exportSchema = false)
abstract class AppCitiesDatabase : RoomDatabase() {
    companion object {
        const val DB_NAME = "city.db"
        const val VERSION = 1
    }
    abstract fun citiesDao(): CitiesDao
}