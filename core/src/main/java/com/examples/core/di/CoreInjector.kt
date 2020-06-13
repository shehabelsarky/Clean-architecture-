package com.examples.core.di

import android.app.Application
import com.examples.core.di.module.CoreModule

object CoreInjector {

    lateinit var coreComponent: CoreComponent

    fun initialise(application: Application) {
        coreComponent = DaggerCoreComponent.builder().coreModule(
            CoreModule(
                application
            )
        ).build()
    }
}