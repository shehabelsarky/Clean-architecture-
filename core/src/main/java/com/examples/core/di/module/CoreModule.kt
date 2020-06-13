package com.examples.core.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CoreModule(private val application: Application) {

    @Singleton
    @Provides
    fun provideContext():Context = application

    @Singleton
    @Provides
    fun provideApplication():Application = application
}