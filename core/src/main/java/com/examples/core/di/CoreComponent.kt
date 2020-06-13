package com.examples.core.di

import android.app.Application
import android.content.Context
import com.examples.core.di.module.CoreModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [CoreModule::class])
interface CoreComponent {

    fun getContext():Context

    fun getApplication(): Application
}