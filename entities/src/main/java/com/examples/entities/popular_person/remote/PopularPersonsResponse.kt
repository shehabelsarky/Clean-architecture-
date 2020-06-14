package com.examples.entities.popular_person.remote

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

import java.io.Serializable

class PopularPersonsResponse : Serializable {

    @SerializedName("profiles")
    @Expose
    var profiles: List<Profile>? = null
    @SerializedName("page")
    @Expose
    var page: Int = 0
    @SerializedName("total_results")
    @Expose
    var totalResults: Int = 0
    @SerializedName("total_pages")
    @Expose
    var totalPages: Int = 0
    @SerializedName("results")
    @Expose
    var results: List<Result>? = null

    companion object {
        private const val serialVersionUID = 4522600775503096196L
    }

}
