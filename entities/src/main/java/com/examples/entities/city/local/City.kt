package com.examples.entities.city.local

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Shehab Elsarky
 */

@Entity
data class City(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    var cityName: String = ""
)