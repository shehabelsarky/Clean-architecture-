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

abstract class BaseActivity : AppCompatActivity(), View.OnClickListener, LoadingListener {

    private lateinit var navFragment: NavHostFragment
    private lateinit var navController: NavController

    abstract var navGraphResourceId: Int
    protected lateinit var bundle: Bundle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_common)
        setNavFragment()
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
        if (::bundle.isInitialized)
            navController.setGraph(navGraphResourceId, bundle)
        else
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