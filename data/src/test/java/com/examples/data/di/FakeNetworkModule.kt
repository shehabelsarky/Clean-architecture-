package com.examples.data.di

import android.app.Application
import com.examples.data.restful.FakeApiService
import com.examples.data.source.cloud.BaseCloudRepository
import com.examples.data.source.cloud.FakeCloudRepository
import com.examples.data.util.JsonUtil
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.InternalCoroutinesApi
import javax.inject.Singleton

@ExperimentalCoroutinesApi
@InternalCoroutinesApi
@Module
@InstallIn(ApplicationComponent::class)
object FakeNetworkModule{

    @Singleton
    @Provides
    fun provideJsonUtil(application: Application): JsonUtil {
        return JsonUtil(application)
    }

    @Singleton
    @Provides
    fun provideCloudRepository(apIs: FakeApiService): BaseCloudRepository {
        return FakeCloudRepository(apIs)
    }
}














