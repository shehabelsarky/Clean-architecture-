package com.examples.entities.popular_person.remote

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

import java.io.Serializable

class Profile : Serializable {

    @SerializedName("iso_639_1")
    @Expose
    var iso6391: Any? = null
    @SerializedName("width")
    @Expose
    var width: Int = 0
    @SerializedName("height")
    @Expose
    var height: Int = 0
    @SerializedName("vote_count")
    @Expose
    var voteCount: Int = 0
    @SerializedName("vote_average")
    @Expose
    var voteAverage: Float = 0.toFloat()
    @SerializedName("file_path")
    @Expose
    var filePath: String? = null
    @SerializedName("aspect_ratio")
    @Expose
    var aspectRatio: Float = 0.toFloat()

    companion object {
        private const val serialVersionUID = -1264620972366786161L
    }

}
