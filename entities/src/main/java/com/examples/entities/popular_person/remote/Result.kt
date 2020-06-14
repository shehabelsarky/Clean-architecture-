package com.examples.entities.popular_person.remote

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

import java.io.Serializable

class Result : Serializable {

    @SerializedName("popularity")
    @Expose
    var popularity: Float = 0.toFloat()
    @SerializedName("id")
    @Expose
    var id: Int = 0
    @SerializedName("profile_path")
    @Expose
    var profilePath: String? = null
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("known_for")
    @Expose
    var knownFor: List<KnownFor>? = null
    @SerializedName("adult")
    @Expose
    var isAdult: Boolean = false

    companion object {
        private const val serialVersionUID = -3162855886569890092L
    }

}
