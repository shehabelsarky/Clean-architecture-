package com.examples.data.restful

object Config {
    const val API_KEY = "aede46592fa18e618a51016ae6036c11"
    const val BASE_URL = "https://api.themoviedb.org/3/"
    const val BASE_IMAGE_URL="http://image.tmdb.org/t/p/w342"
    const val POPULAR_ACTORS = "person/popular"
    const val SEARCH_ACTORS = "search/person"
    const val POPULAR_PERSON = "person_id"
    const val POPULAR_ACTOR_IMAGES = "person/{$POPULAR_PERSON}/images"
    const val POPULAR_ACTOR_DETAILS = "person/{$POPULAR_PERSON}"
}