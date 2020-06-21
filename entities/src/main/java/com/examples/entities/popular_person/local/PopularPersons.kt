package com.examples.entities.popular_person.local

import java.io.Serializable

data class PopularPersons(
    val id : Int = 0,
    val name: String = "",
    val tile: String = "",
    val overview: String = "",
    val image: String = "",
    val popularity : Float = 0.0f
): Serializable