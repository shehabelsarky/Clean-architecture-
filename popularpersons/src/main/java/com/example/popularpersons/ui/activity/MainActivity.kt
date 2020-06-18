package com.example.popularpersons.ui.activity

import com.example.popularpersons.R
import com.examples.core.base.activity.CommonActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity  : CommonActivity() {
    override var navGraphResourceId: Int = R.navigation.nav_graph
}
