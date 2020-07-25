package com.examples.entities.popular_person.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
data class PopularPersons(
    @PrimaryKey(autoGenerate = false)
    val entityId: Int = EntityHelper.id,
    val id: Int = 0,
    val name: String = "",
    val tile: String = "",
    val overview: String = "",
    val image: String = "",
    val popularity: Float = 0.0f
) : Serializable{

    init {
        EntityHelper.id = ++EntityHelper.id
    }
}