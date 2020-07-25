package com.examples.domain.mappers.popular_persons

import com.examples.entities.popular_person.local.EntityHelper
import com.examples.entities.popular_person.local.PopularPersons
import com.examples.entities.popular_person.remote.Result
import javax.inject.Inject

class PopularPersonsMapper @Inject constructor() {

    fun convert(dtoItem: Result): PopularPersons {
        return PopularPersons(
            EntityHelper.id,
            dtoItem.id,
            dtoItem.name ?: "",
            dtoItem.knownFor!![0].title ?: "",
            dtoItem.knownFor!![0].overview ?: "",
            dtoItem.profilePath ?: "",
            dtoItem.popularity ?: 0.0f
        )
    }

}