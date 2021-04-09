package com.examples.entities.weather.remote

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Sys {
    @SerializedName("type")
    @Expose
    var type: Int? = null

    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("country")
    @Expose
    var country: String? = null

    @SerializedName("sunrise")
    @Expose
    var sunrise: Int? = null

    @SerializedName("sunset")
    @Expose
    var sunset: Int? = null

}