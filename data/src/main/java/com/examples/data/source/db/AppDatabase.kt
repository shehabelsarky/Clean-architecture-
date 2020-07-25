package com.examples.data.source.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.examples.entities.popular_person.local.PopularPersons

@Database(entities = [PopularPersons::class], version = AppDatabase.VERSION, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    companion object {
        const val DB_NAME = "movies.db"
        const val VERSION = 5
    }
    abstract fun popularPersonsDao(): PopularPersonsDao
}