package com.architecture.clean.di

import android.app.Application
import com.examples.core.di.CoreInjector

object AppInjector {
    fun initialise(application: Application){
        initialiseCoreComponent(application)
    }

    private fun initialiseCoreComponent(application: Application) {
        CoreInjector.initialise(application)
    }
}