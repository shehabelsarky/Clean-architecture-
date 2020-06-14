package com.architecture.clean.ui.activity

import com.architecture.clean.R
import com.examples.core.base.activity.CommonActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity  : CommonActivity() {
    override var navGraphResourceId: Int = R.navigation.nav_graph
}
