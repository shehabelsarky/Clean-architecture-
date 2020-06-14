package com.architecture.clean.di.module

import com.examples.data.repository.AppRepoImp
import com.examples.data.repository.AppRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
abstract class AppModule {

    @Binds
    abstract fun bindAppRepository(
        appRepoImp: AppRepoImp
    ): AppRepository
}