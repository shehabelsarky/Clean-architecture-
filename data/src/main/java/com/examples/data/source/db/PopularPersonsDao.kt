package com.examples.data.source.db

import androidx.room.*
import com.examples.entities.popular_person.local.PopularPersons

@Dao
interface PopularPersonsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPopularPerson(popularPerson: PopularPersons)

    @Delete
    suspend fun deletePopularPerson(popularPerson: PopularPersons): Int

    @Query("DELETE FROM PopularPersons")
    suspend fun deletePopularPersonTable()

    @Query("SELECT * from PopularPersons ORDER BY entityId ASC")
    suspend fun selectAllPopularPersons(): MutableList<PopularPersons>
}