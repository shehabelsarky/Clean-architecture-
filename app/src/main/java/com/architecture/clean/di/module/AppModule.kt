package com.architecture.clean.di.module

import com.architecture.clean.data.repository.AppRepoImp
import com.architecture.clean.domain.repository.AppRepository
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