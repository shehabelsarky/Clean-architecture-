package com.examples.data.restful

/**
 * Created by Shehab Elsarky
 */
object Config {
    const val API_KEY = "7a2a3b395dcd864324bcf7236a551ece"
    const val BASE_URL = "http://api.openweathermap.org/data/2.5/"
    const val WEATHER = "weather"
    const val BASE_IMAGE_URL="http://image.tmdb.org/t/p/w342"
    const val POPULAR_ACTORS = "person/popular"
    const val SEARCH_ACTORS = "search/person"
    const val POPULAR_PERSON = "person_id"
    const val POPULAR_ACTOR_IMAGES = "person/{$POPULAR_PERSON}/images"
    const val POPULAR_ACTOR_DETAILS = "person/{$POPULAR_PERSON}"
}