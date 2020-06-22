package com.examples.core.base.activity

import android.content.pm.PackageManager
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

abstract class PermissionsActivity : BaseActivity() {

    abstract var permissions: Array<String>

    val requestPermissions =
        registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { permissions ->
            // Do something if some permissions granted or denied
            val allGranted = permissions.entries.map {
                checkSelfPermission(it.key)
            }.map { it == PackageManager.PERMISSION_GRANTED }.find { !it } ?: true

            if (!allGranted) {
                Toast.makeText(this, "Permissions are not granted", Toast.LENGTH_SHORT).show()
            }
        }
}