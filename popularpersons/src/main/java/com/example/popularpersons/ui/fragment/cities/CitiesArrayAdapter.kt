package com.example.popularpersons.ui.fragment.cities

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.popularpersons.R
import com.examples.entities.city.local.City

/**
 * Created by Shehab Elsarky
 */
class CitiesArrayAdapter(context: Context, services: List<City>) : ArrayAdapter<City>(
    context, R.layout.item_simple_spinner_dropdown_item, android.R.id.text1, services
) {

    override fun setDropDownViewResource(resource: Int) {
        super.setDropDownViewResource(R.layout.item_simple_spinner_dropdown_item)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val textView = super.getView(position, convertView, parent) as TextView
        textView.text = getItem(position)?.cityName?:""
        return textView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        val textView = super.getView(position, convertView, parent) as TextView
        textView.text = getItem(position)?.cityName?:""
        return textView
    }
}