package com.examples.data.source.local

import com.examples.entities.city.remote.RemoteCity
import com.examples.entities.city.response.RemoteCitiesResponse
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import javax.inject.Inject

/**
 * Created by Shehab Elsarky
 */
const val CITY_LIST_FILENAME = "city_list.json"

class MockJson @Inject constructor() {

    /**
     * Reads input file and converts to json
     */
    fun getJson(fileName: String): String {
        val bytes = javaClass.classLoader!!.getResourceAsStream(fileName).readBytes()
        return String(bytes)
    }

    fun getCityList():List<RemoteCity> {
        val rawJson = getJson(CITY_LIST_FILENAME)
        return Gson().fromJson(
            rawJson,
            object : TypeToken<List<RemoteCity>>() {}.type
        )
    }
}