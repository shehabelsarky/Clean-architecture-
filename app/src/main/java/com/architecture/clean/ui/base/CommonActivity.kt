package com.architecture.clean.ui.base

import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.architecture.clean.R
import com.architecture.clean.ui.utils.LoadingListener
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_common.*

abstract class CommonActivity : DaggerAppCompatActivity(), View.OnClickListener, LoadingListener {

    private lateinit var navFragment: NavHostFragment
    private lateinit var navController: NavController

    internal abstract var navGraphResourceId: Int

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