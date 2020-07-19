package com.architecture.clean.core

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import com.appizona.yehiahd.fastsave.FastSave
import com.examples.core.utils.NetworkingUtils
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
        NetworkingUtils.setNetworkingApplicationContext(this)
        FastSave.init(this)
    }
}