package com.example.details.ui.activity

import android.os.Bundle
import androidx.core.os.bundleOf
import com.example.details.R
import com.example.details.ui.utils.DETAILS_DATA
import com.examples.core.base.activity.BaseActivity
import com.examples.core.utils.NavigationConstants
import com.examples.entities.popular_person.local.PopularPersons
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailsActivity : BaseActivity() {
    override var navGraphResourceId: Int =
        R.navigation.details_nav_graph

    override fun onCreate(savedInstanceState: Bundle?) {
        intent?.let {
            val popularPersonData = it.getSerializableExtra(NavigationConstants.POPULAR_PERSONS_TO_DETAILS_DATA) as PopularPersons
            bundle = bundleOf(DETAILS_DATA to popularPersonData)
        }
        super.onCreate(savedInstanceState)
    }
}