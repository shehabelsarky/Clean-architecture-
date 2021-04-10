package com.example.popularpersons.ui.fragment.cities

import android.view.View
import com.example.popularpersons.R
import com.examples.core.base.adapters.BaseRecyclerAdapter
import com.examples.entities.city.local.City
import kotlinx.android.synthetic.main.item_city.view.*

/**
 * Created by Shehab Elsarky
 */
class CitiesAdapter(
    val onItemClicked: (City) -> Unit,
    val onItemRemoved: (City, Int) -> Unit
) : BaseRecyclerAdapter<City>({ oldItem, newItem -> oldItem.cityName == newItem.cityName }) {

    override val itemLayoutRes = R.layout.item_city

    override fun bind(view: View, item: City, position: Int) {
        view.apply {
            tvCityName.text = item.cityName
            setOnClickListener { onItemClicked(item) }
            ivRemove.setOnClickListener {
                onItemRemoved(item, position)
            }
        }
    }

}