package com.examples.entities.popular_person.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
data class PopularPersons(
    @PrimaryKey(autoGenerate = false)
    var entityId: Int = 0,
    var id: Int = 0,
    var name: String = "",
    var tile: String = "",
    var overview: String = "",
    var image: String = "",
    var popularity: Float = 0.0f
) : Serializable {

    //for testing purpose
    constructor(popularPersons: PopularPersons) : this() {
        popularPersons.apply {
            this@PopularPersons.entityId = 0
            this@PopularPersons.id = this.id
            this@PopularPersons.name = this.name
            this@PopularPersons.tile = this.tile
            this@PopularPersons.overview = this.overview
            this@PopularPersons.image = ""
            this@PopularPersons.popularity = this.popularity
        }
    }

    override fun toString(): String {
        return "PopularPersons{" +
                "id=" + id +
                ", title='" + tile + '\'' +
                ", overview='" + overview + '\'' +
                ", popularity='" + popularity + '\'' +
                '}'
    }

    override fun equals(other: Any?): Boolean {
        if (other == null)
            return false

        if (javaClass != other.javaClass) {
            return false
        }
        val popularPersons: PopularPersons = other as PopularPersons
        return popularPersons.id == id &&
                popularPersons.name == name &&
                popularPersons.overview == overview &&
                popularPersons.popularity == popularity
    }
}