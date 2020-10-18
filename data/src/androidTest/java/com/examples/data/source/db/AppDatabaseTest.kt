package com.examples.data.source.db

import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import org.junit.After
import org.junit.Before

abstract class AppDatabaseTest {

    // system under test
    private lateinit var appDatabase: AppDatabase

    fun getPopularPersonsDao(): PopularPersonsDao {
        return appDatabase.getPopularPersonsDao()
    }

    @Before
    fun init() {
        appDatabase = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            AppDatabase::class.java
        ).build()
    }

    @After
    fun finish() {
        appDatabase.close()
    }
}