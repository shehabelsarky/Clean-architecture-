package com.example.details.ui.activity

import android.os.Bundle
import android.widget.Toast
import com.example.details.R
import com.examples.core.base.activity.CommonActivity
import com.examples.core.utils.NavigationConstants
import com.examples.entities.popular_person.local.PopularPersons
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailsActivity : CommonActivity() {
    override var navGraphResourceId: Int =
        R.navigation.details_nav_graph

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        intent?.let {
            val popularPersonData = it.getSerializableExtra(NavigationConstants.POPULAR_PERSONS_TO_DETAILS_DATA) as PopularPersons
            Toast.makeText(this,popularPersonData.name,Toast.LENGTH_SHORT).show()
        }
    }
}