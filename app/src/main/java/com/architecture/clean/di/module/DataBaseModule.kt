package com.architecture.clean.di.module

import android.app.Application
import androidx.room.Room
import com.architecture.clean.data.source.db.AppDatabase
import com.architecture.clean.data.source.db.FoodDao
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
    fun provideUserDao(appDataBase: AppDatabase): FoodDao {
        return appDataBase.foodDao()
    }
}