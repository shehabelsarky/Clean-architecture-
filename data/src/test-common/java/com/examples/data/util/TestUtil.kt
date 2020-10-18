package com.examples.data.util

import com.examples.entities.popular_person.local.PopularPersons

class TestUtil {
    companion object {
        val TEST_POPULAR_PERSONS_1 = PopularPersons(
            id = 1,
            name = "Shehab",
            overview = "Amazing person",
            tile = "5",
            popularity = 5f
        )

        val TEST_POPULAR_PERSONS_2 = PopularPersons(
            id = 1,
            name = "Elsarky",
            overview = "Amazing family",
            tile = "5",
            popularity = 5f
        )
    }
}