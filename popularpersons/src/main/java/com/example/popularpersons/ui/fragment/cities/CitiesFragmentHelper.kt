package com.example.popularpersons.ui.fragment.cities

import android.content.Context
import android.location.Address
import android.location.Geocoder
import java.io.IOException
import java.util.*


/**
 * Created by Shehab Elsarky
 */

internal fun getCityFromLatLng(context: Context,lat: Double,lng: Double): String{
    return try {
        val gcd = Geocoder(context, Locale.getDefault())
        val addresses: List<Address> = gcd.getFromLocation(lat, lng, 1)
        if (addresses.isNotEmpty()) {
            addresses[0].locality
        } else {
            ""
        }
    }catch (e: IOException){
        ""
    }
}