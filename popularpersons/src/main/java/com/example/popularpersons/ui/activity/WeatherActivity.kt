package com.example.popularpersons.ui.activity

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.popularpersons.R
import com.examples.core.base.activity.PermissionsActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * Created by Shehab Elsarky
 */
@AndroidEntryPoint
class WeatherActivity : PermissionsActivity() {

    override var permissions: Array<String> = arrayOf(
        android.Manifest.permission.ACCESS_FINE_LOCATION,
        android.Manifest.permission.ACCESS_COARSE_LOCATION
    )

    @Inject
    lateinit var permissionsState: MutableLiveData<Boolean>
    override var navGraphResourceId: Int = R.navigation.nav_graph

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestPermissions.launch(permissions)

       /* allPermissionsLiveData.observe(this, Observer {
            if (!it){
                permissionsState.postValue(false)
            }else
                permissionsState.postValue(true)
        })*/
    }
}
