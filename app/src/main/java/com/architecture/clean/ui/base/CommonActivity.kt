package com.architecture.clean.ui.base

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.architecture.clean.R
import kotlinx.android.synthetic.main.activity_common.*

abstract class CommonActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var navFragment: NavHostFragment
    protected lateinit var navController: NavController
    private lateinit var toolbarContainer: ConstraintLayout

    abstract fun setNavGraph(navController: NavController)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_common)
        setNavFragment()
        btnBack.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view){
            btnBack -> onBackPressed()
        }
    }

    fun setNavFragment(){
        navFragment =
            supportFragmentManager.findFragmentById(R.id.common_nav_fragment) as NavHostFragment
        navController = navFragment.navController
        setNavGraph(navController)
        tvtitle.text = navController.currentDestination?.label
    }


    override fun onBackPressed() {
        if (!navController.popBackStack()) {
            super.onBackPressed()
        }
    }

    open fun changeToolbarViability(show: Boolean) {
        when (show) {
            true -> {
                toolbarContainer.visibility = View.VISIBLE
            }
            false -> {
                toolbarContainer.visibility = View.GONE
            }
        }
    }
}