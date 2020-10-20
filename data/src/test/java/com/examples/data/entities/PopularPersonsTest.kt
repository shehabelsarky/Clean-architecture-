package com.examples.data.entities

import com.examples.entities.popular_person.local.PopularPersons
import org.junit.Assert.assertEquals
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PopularPersonsTest {

    /*
     *   Compare two equal Persons
     */
    @Test
    fun isPersonsEqual_identicalProperties_returnTrue() {
        // Arrange
        val popularPersons1 = PopularPersons(
            entityId = 1,
            id = 1,
            name = "Shehab Elsarky",
            overview = "Amazing person",
            popularity = 5f,
            tile = "5",
            image = ""
        )
        val popularPersons2 = PopularPersons(
            entityId = 1,
            id = 1,
            name = "Shehab Elsarky",
            overview = "Amazing person",
            popularity = 5f,
            tile = "5",
            image = ""
        )
        // Act
        // Assert
        assertEquals(popularPersons1, popularPersons2)
        println("The persons are equal!")
    }


    /*
    *   Compare two different Ids Persons
    */
    @Test
    fun isPersonsEqual_differentIds_returnFalse() {
        // Arrange
        val popularPersons1 = PopularPersons(
            entityId = 1,
            id = 1,
            name = "Shehab Elsarky",
            overview = "Amazing person",
            popularity = 5f,
            tile = "5",
            image = ""
        )
        val popularPersons2 = PopularPersons(
            entityId = 1,
            id = 2,
            name = "Shehab Elsarky",
            overview = "Amazing person",
            popularity = 5f,
            tile = "5",
            image = ""
        )
        // Act
        // Assert
        assertNotEquals(popularPersons1, popularPersons2)
        println("The persons are not equal!")
    }


    /*
    *   Compare two different names
    */
    @Test
    fun isPersonsEqual_differentName_returnFalse() {
        // Arrange
        val popularPersons1 = PopularPersons(
            entityId = 1,
            id = 1,
            name = "Shehab",
            overview = "Amazing person",
            popularity = 5f,
            tile = "5",
            image = ""
        )
        val popularPersons2 = PopularPersons(
            entityId = 1,
            id = 2,
            name = "Shehab Elsarky",
            overview = "Amazing person",
            popularity = 5f,
            tile = "5",
            image = ""
        )
        // Act
        // Assert
        assertNotEquals(popularPersons1, popularPersons2)
        println("The persons are not equal!")
    }


    /*
    *   Compare two different overview
    */
    @Test
    fun isPersonsEqual_differentOverview_returnFalse() {
        // Arrange
        val popularPersons1 = PopularPersons(
            entityId = 1,
            id = 1,
            name = "Shehab Elsarky",
            overview = "Amazing person",
            popularity = 5f,
            tile = "5",
            image = ""
        )
        val popularPersons2 = PopularPersons(
            entityId = 1,
            id = 2,
            name = "Shehab Elsarky",
            overview = "Amazing",
            popularity = 5f,
            tile = "5",
            image = ""
        )
        // Act
        // Assert
        assertNotEquals(popularPersons1, popularPersons2)
        println("The overviews are different!")
    }



    /*
    *   Compare two different popularity
    */
    @Test
    fun isPersonsEqual_differentPopularity_returnFalse() {
        // Arrange
        val popularPersons1 = PopularPersons(
            entityId = 1,
            id = 1,
            name = "Shehab Elsarky",
            overview = "Amazing person",
            popularity = 10f,
            tile = "5",
            image = ""
        )
        val popularPersons2 = PopularPersons(
            entityId = 1,
            id = 2,
            name = "Shehab Elsarky",
            overview = "Amazing person",
            popularity = 5f,
            tile = "5",
            image = ""
        )
        // Act
        // Assert
        assertNotEquals(popularPersons1, popularPersons2)
        println("The popularity is different!")
    }


    /*
    *   Compare two different tile
    */
    @Test
    fun isPersonsEqual_differentTile_returnTrue() {
        // Arrange
        val popularPersons1 = PopularPersons(
            entityId = 1,
            id = 1,
            name = "Shehab Elsarky",
            overview = "Amazing person",
            popularity = 5f,
            tile = "5",
            image = ""
        )
        val popularPersons2 = PopularPersons(
            entityId = 1,
            id = 2,
            name = "Shehab Elsarky",
            overview = "Amazing person",
            popularity = 5f,
            tile = "10",
            image = ""
        )
        // Act
        // Assert
        assertEquals(popularPersons1, popularPersons2)
        println("The tile is different but they are the same person!")
    }
}