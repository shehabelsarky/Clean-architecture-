package com.examples.data.util

import com.examples.entities.popular_person.local.PopularPersons
import java.util.*
import kotlin.collections.ArrayList

class TestUtil {
    companion object {
        val TEST_POPULAR_PERSONS_1 = PopularPersons(
            id = 1,
            name = "Shehab",
            overview = "Amazing person",
            tile = "Awesome title",
            popularity = 5f
        )

        val TEST_POPULAR_PERSONS_2 = PopularPersons(
            id = 1,
            name = "Elsarky",
            overview = "Amazing family",
            tile = "Awesome title",
            popularity = 5f
        )

        val TEST_POPULAR_PERSONS_LIST = Collections.unmodifiableList(
            ArrayList<PopularPersons>().apply {
                add(PopularPersons(TEST_POPULAR_PERSONS_1))
                add(PopularPersons(TEST_POPULAR_PERSONS_2))
            }
        )
    }
}