package com.example.popularpersons.ui.fragment.cities

import android.view.View
import com.example.popularpersons.R
import com.examples.core.base.adapters.BaseRecyclerAdapter
import com.examples.entities.city.local.City

/**
 * Created by Shehab Elsarky
 */
class CitiesAdapter(val onItemClicked: (City, Int) -> Unit) :
    BaseRecyclerAdapter<City>({ oldItem, newItem -> false }) {

    override val itemLayoutRes = R.layout.item_city

    override fun bind(view: View, item: City, position: Int) {

        view.setOnClickListener { onItemClicked(item, position) }
    }
}