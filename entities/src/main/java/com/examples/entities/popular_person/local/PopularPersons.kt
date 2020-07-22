package com.examples.entities.popular_person.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
import java.util.*

@Entity
data class PopularPersons(
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val name: String = "",
    val tile: String = "",
    val overview: String = "",
    val image: String = "",
    val popularity : Float = 0.0f,
    val date: Long = System.currentTimeMillis()
): Serializable