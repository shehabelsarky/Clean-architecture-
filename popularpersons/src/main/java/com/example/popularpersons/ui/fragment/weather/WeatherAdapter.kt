package com.example.popularpersons.ui.fragment.weather

import android.view.View
import com.example.popularpersons.R
import com.examples.core.base.adapters.BaseRecyclerAdapter
import com.examples.entities.weather.local.Weather

/**
 * Created by Shehab Elsarky
 */
class WeatherAdapter(val onItemClicked: (Weather, Int) -> Unit) :
    BaseRecyclerAdapter<Weather>({ oldItem, newItem -> false }) {

    override val itemLayoutRes = R.layout.item_weather

    override fun bind(view: View, item: Weather, position: Int) {

        view.setOnClickListener { onItemClicked(item, position) }
    }
}