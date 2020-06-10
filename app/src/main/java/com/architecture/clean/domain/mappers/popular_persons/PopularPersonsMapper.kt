package com.architecture.clean.domain.mappers.popular_persons

import com.architecture.clean.domain.model.popular_person.local.PopularPersons
import com.architecture.clean.domain.model.popular_person.remote.Result
import javax.inject.Inject

class PopularPersonsMapper @Inject constructor(){

        fun convert(dtoItem: Result): PopularPersons {
            return PopularPersons(
                dtoItem.id,
                dtoItem.name ?: "",
                dtoItem.knownFor!![0].title ?: "",
                dtoItem.knownFor!![0].overview ?: "",
                dtoItem.profilePath ?: "",
                dtoItem.popularity ?: 0.0f
            )
        }

}