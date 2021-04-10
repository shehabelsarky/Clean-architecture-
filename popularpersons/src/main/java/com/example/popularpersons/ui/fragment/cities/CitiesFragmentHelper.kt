package com.example.popularpersons.ui.fragment.cities

import android.content.Context
import android.location.Address
import android.location.Geocoder
import com.examples.entities.city.local.City
import java.io.IOException
import java.util.*


/**
 * Created by Shehab Elsarky
 */

internal fun getCityFromLatLng(context: Context, lat: Double, lng: Double): String {
    return try {
        val geocoder = Geocoder(context, Locale.getDefault())
        val addresses: List<Address> = geocoder.getFromLocation(lat, lng, 1)
        if (addresses.isNotEmpty()) {
            addresses[0].locality
        } else {
            ""
        }
    } catch (e: IOException) {
        ""
    }
}

internal fun initCitiesAndCitiesDropdownLists(
    citiesList: ArrayList<City>,
    dropdownCitiesList: ArrayList<City>,
    citiesListData: ArrayList<City>
) {
    citiesList.clear()
    dropdownCitiesList.clear()
    citiesList.addAll(citiesListData)
    dropdownCitiesList.addAll(citiesListData)
}