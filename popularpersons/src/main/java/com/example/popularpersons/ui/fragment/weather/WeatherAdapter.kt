package com.example.popularpersons.ui.fragment.weather

import android.view.View
import com.example.popularpersons.R
import com.examples.core.base.adapters.BaseRecyclerAdapter
import com.examples.entities.weather.local.Weather
import kotlinx.android.synthetic.main.item_weather.view.*

/**
 * Created by Shehab Elsarky
 */
class WeatherAdapter : BaseRecyclerAdapter<Weather>({ oldItem, newItem -> false }) {

    override val itemLayoutRes = R.layout.item_weather

    override fun bind(view: View, item: Weather, position: Int) {
        view.apply {
            tvCityName.text = item.cityName
            tvDescription.text = item.description
            tvWeatherMain.text = item.main
            tvMaxTemp.text = item.maxTemperature
            tvMinTemp.text = item.minTemperature
        }
    }
}