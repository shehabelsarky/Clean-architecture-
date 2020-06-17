package com.examples.core.base.activity

import android.content.pm.PackageManager
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.examples.core.R
import com.examples.core.utils.LoadingListener
import kotlinx.android.synthetic.main.activity_common.*

abstract class CommonActivity : AppCompatActivity(), View.OnClickListener, LoadingListener {

    private lateinit var navFragment: NavHostFragment
    private lateinit var navController: NavController

    abstract var navGraphResourceId: Int

    companion object {
        private val permissions = arrayOf(
            android.Manifest.permission.WRITE_EXTERNAL_STORAGE,
            android.Manifest.permission.READ_EXTERNAL_STORAGE
        )
    }

    private val requestPermissions =
        registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { permissions ->
            // Do something if some permissions granted or denied
            val allGranted = permissions.entries.map {
                checkSelfPermission(it.key)
            }.map { it == PackageManager.PERMISSION_GRANTED }.find { !it } ?: true

            if (!allGranted) {
                Toast.makeText(
                    this,
                    "Permissions are not granted",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_common)
        setNavFragment()
        requestPermissions.launch(permissions)
        btnBack.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view) {
            btnBack -> onBackPressed()
        }
    }

    private fun setNavFragment() {
        navFragment =
            supportFragmentManager.findFragmentById(R.id.common_nav_fragment) as NavHostFragment
        navController = navFragment.navController
        navController.setGraph(navGraphResourceId)
        tvtitle.text = navController.currentDestination?.label
    }

    override fun onBackPressed() {
        if (!navController.popBackStack()) {
            super.onBackPressed()
        }
    }

    open fun changeBackButtonVisibility(isVisible: Boolean) {
        when (isVisible) {
            true ->
                btnBack.visibility = View.VISIBLE
            false ->
                btnBack.visibility = View.GONE
        }
    }

    override fun showLoading(show: Boolean) {
        progressBar.visibility = if (show) View.VISIBLE else View.GONE
    }
}