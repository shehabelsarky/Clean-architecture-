package com.architecture.clean.core

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
/*import com.architecture.clean.di.component.DaggerCoreComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication*/
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {
   /* override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerCoreComponent
                .builder()
                .application(this)
                .build()
    }*/

    override fun onCreate() {
        super.onCreate()

    }
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}