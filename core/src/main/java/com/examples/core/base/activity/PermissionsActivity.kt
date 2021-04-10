package com.examples.core.base.activity

import android.content.pm.PackageManager
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.lifecycle.MutableLiveData
import kotlin.properties.Delegates

abstract class PermissionsActivity : BaseActivity() {

    abstract var permissions: Array<String>
    var allGranted: Boolean by Delegates.notNull()
    var allPermissionsLiveData = MutableLiveData<Boolean>()

    val requestPermissions =
        registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { permissions ->
            // Do something if some permissions granted or denied
            allGranted = permissions.entries.map {
                checkSelfPermission(it.key)
            }.map { it == PackageManager.PERMISSION_GRANTED }.find { !it } ?: true

            if (!allGranted) {
                allPermissionsLiveData.postValue(false)
                Toast.makeText(this, "Permissions are not granted", Toast.LENGTH_SHORT).show()
            }
        }
}