package com.example.popularpersons.ui.fragment.home

import com.examples.entities.popular_person.local.PopularPersons

class ViewModelHelper {

    companion object{
        fun getPopularPersonsList(): ArrayList<PopularPersons>{
            val popularPersons = arrayListOf<PopularPersons>()
            popularPersons.apply {
                add(PopularPersons(
                    0,
                    1,
                    "Shehab",
                    "Awesome Movie",
                    "Great",
                    "",
                    5f
                ))

                add(PopularPersons(
                    1,
                    2,
                    "Shehab2",
                    "Awesome Movie2",
                    "Great",
                    "",
                    5f
                ))

                add(PopularPersons(
                    2,
                    3,
                    "Shehab3",
                    "Awesome Movie3",
                    "Great",
                    "",
                    5f
                ))

                add(PopularPersons(
                    3,
                    4,
                    "Shehab4",
                    "Awesome Movie4",
                    "Great",
                    "",
                    5f
                ))
            }

            return popularPersons
        }
    }

}