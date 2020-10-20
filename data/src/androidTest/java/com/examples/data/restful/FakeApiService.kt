package com.examples.data.restful

import com.examples.data.util.Constants
import com.examples.data.util.JsonUtil
import com.examples.entities.PopularActorDetails
import com.examples.entities.popular_person.remote.PopularPersonsResponse
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.delay
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FakeApiService
@Inject
constructor(
    private val jsonUtil: JsonUtil
): ApiService{

    var popularActorsJsonFileName: String = Constants.POPULAR_ACTORS_FILENAME
    var networkDelay: Long = 0L

    override suspend fun getPopularPersons(page: Int): PopularPersonsResponse {
        val rawJson = jsonUtil.readJSONFromAsset(popularActorsJsonFileName)
        val popularActors = Gson().fromJson<PopularPersonsResponse>(
            rawJson,
            object : TypeToken<PopularPersonsResponse>() {}.type
        )
        delay(networkDelay)
        return popularActors
    }


    override suspend fun searchPersons(page: Int, actorName: String): PopularPersonsResponse {
        val rawJson = jsonUtil.readJSONFromAsset(popularActorsJsonFileName)
        val popularActors = Gson().fromJson<PopularPersonsResponse>(
            rawJson,
            object : TypeToken<PopularPersonsResponse>() {}.type
        )
        delay(networkDelay)
        return popularActors
    }
}