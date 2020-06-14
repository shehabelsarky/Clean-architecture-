package com.examples.entities.popular_person.remote

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

import java.io.Serializable

class KnownFor : Serializable {

    @SerializedName("vote_average")
    @Expose
    var voteAverage: Float = 0.toFloat()
    @SerializedName("vote_count")
    @Expose
    var voteCount: Int = 0
    @SerializedName("id")
    @Expose
    var id: Int = 0
    @SerializedName("video")
    @Expose
    var isVideo: Boolean = false
    @SerializedName("media_type")
    @Expose
    var mediaType: String? = null
    @SerializedName("title")
    @Expose
    var title: String? = null
    @SerializedName("popularity")
    @Expose
    var popularity: Float = 0.toFloat()
    @SerializedName("poster_path")
    @Expose
    var posterPath: String? = null
    @SerializedName("original_language")
    @Expose
    var originalLanguage: String? = null
    @SerializedName("original_title")
    @Expose
    var originalTitle: String? = null
    @SerializedName("genre_ids")
    @Expose
    var genreIds: List<Int>? = null
    @SerializedName("backdrop_path")
    @Expose
    var backdropPath: String? = null
    @SerializedName("adult")
    @Expose
    var isAdult: Boolean = false
    @SerializedName("overview")
    @Expose
    var overview: String? = null
    @SerializedName("release_date")
    @Expose
    var releaseDate: String? = null

    companion object {
        private const val serialVersionUID = 1662983379185328151L
    }

}
