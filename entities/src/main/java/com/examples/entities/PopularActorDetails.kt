package com.examples.entities

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

import java.io.Serializable

class PopularActorDetails : Serializable {

    @SerializedName("birthday")
    @Expose
    var birthday: String? = null
    @SerializedName("known_for_department")
    @Expose
    var knownForDepartment: String? = null
    @SerializedName("deathday")
    @Expose
    var deathday: Any? = null
    @SerializedName("id")
    @Expose
    var id: Int = 0
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("also_known_as")
    @Expose
    var alsoKnownAs: List<String>? = null
    @SerializedName("gender")
    @Expose
    var gender: Int = 0
    @SerializedName("biography")
    @Expose
    var biography: String? = null
    @SerializedName("popularity")
    @Expose
    var popularity: Float = 0.toFloat()
    @SerializedName("place_of_birth")
    @Expose
    var placeOfBirth: String? = null
    @SerializedName("profile_path")
    @Expose
    var profilePath: String? = null
    @SerializedName("adult")
    @Expose
    var isAdult: Boolean = false
    @SerializedName("imdb_id")
    @Expose
    var imdbId: String? = null
    @SerializedName("homepage")
    @Expose
    var homepage: Any? = null

    companion object {
        private const val serialVersionUID = -7311587074876937425L
    }

}
