package com.examples.data.restful

import com.examples.data.util.Constants
import com.examples.data.util.MockJson
import com.examples.entities.popular_person.remote.PopularPersonsResponse
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.delay
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
open class FakeApiService
@Inject
constructor(
    private val mockJson: MockJson
): ApiService{

    var popularActorsJsonFileName: String = Constants.POPULAR_ACTORS_FILENAME
    var searchActorsJsonFileName: String = Constants.SEARCH_ACTORS_FILENAME
    var emptyListJsonFileName: String = Constants.EMPTY_SEARCH_LIST_FILENAME
    var networkDelay: Long = 0L

    override suspend fun getPopularPersons(page: Int): PopularPersonsResponse {
        val rawJson = mockJson.getJson(popularActorsJsonFileName)
        delay(networkDelay)
        return  Gson().fromJson(
            rawJson,
            object : TypeToken<PopularPersonsResponse>() {}.type
        )
    }


    override suspend fun searchPersons(page: Int, actorName: String): PopularPersonsResponse {
        val rawJson = mockJson.getJson(emptyListJsonFileName)
        delay(networkDelay)
        return  Gson().fromJson(
            rawJson,
            object : TypeToken<PopularPersonsResponse>() {}.type
        )
    }
}