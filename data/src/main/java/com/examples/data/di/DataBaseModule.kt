package com.examples.data.di

import android.app.Application
import androidx.room.Room
import com.examples.data.source.db.AppDatabase
import com.examples.data.source.db.PopularPersonsDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class DataBaseModule {

    @Provides
    @Singleton
    fun provideRoomDatabase(application: Application): AppDatabase {
        return Room
                .databaseBuilder(application, AppDatabase::class.java, AppDatabase.DB_NAME)
                .fallbackToDestructiveMigration()
                .build()
    }

    @Provides
    fun provideUserDao(appDataBase: AppDatabase): PopularPersonsDao {
        return appDataBase.popularPersonsDao()
    }
}