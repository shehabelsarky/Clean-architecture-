package com.examples.data.repository

import com.examples.data.source.cloud.BaseCloudRepository
import com.examples.data.source.cloud.FakeCloudRepository
import com.examples.data.source.db.AppDatabase
import com.examples.data.source.db.PopularPersonsDao
import com.examples.data.util.Constants.ACTOR_NAME
import com.examples.data.util.Constants.EMPTY_SEARCH_COUNT
import com.examples.data.util.Constants.NON_EXIST_NAME
import com.examples.data.util.Constants.PAGE
import com.examples.data.util.Constants.POPULAR_PERSONS_COUNT
import com.examples.data.util.Constants.SEARCH_COUNT
import com.examples.data.util.InstantExecutorExtension
import com.examples.data.util.TestUtil
import com.examples.entities.popular_person.local.PopularPersons
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.ArgumentMatchers.any
import org.mockito.Mockito.*
import org.mockito.Mockito.`when` as mockitoWhen

@ExperimentalCoroutinesApi
@ExtendWith(InstantExecutorExtension::class)
class AppRepoImpTest {

    private val POPULAR_PERSON1 = PopularPersons(TestUtil.TEST_POPULAR_PERSONS_1)

    //system under test
    private lateinit var appRepo: AppRepoImp

    private lateinit var cloudRepository: BaseCloudRepository
    private lateinit var database: AppDatabase
    private lateinit var popularPersonsDao: PopularPersonsDao

    @BeforeEach
    fun initEach() {
        cloudRepository = mock(FakeCloudRepository::class.java)
        database = mock(AppDatabase::class.java)
        popularPersonsDao = mock(PopularPersonsDao::class.java)
        appRepo = AppRepoImp(cloudRepository, database)
    }


    /*
      retrieve popular persons from remote API service
     */
    @Test
    fun getPopularPersonsFromRemoteWebservice_returnSuccess() = runBlockingTest{
        val retrievedData = appRepo.getPopularPersons(PAGE)
        assertNotNull(retrievedData)
        assertEquals(retrievedData.results!!.size, POPULAR_PERSONS_COUNT)
    }


    /*
     search popular person from remote API service
    */
    @Test
    fun searchPopularPersonsFromRemoteWebservice_returnSuccess() = runBlockingTest {
        val retrievedData = cloudRepository.searchPersons(PAGE, ACTOR_NAME)
        assertNotNull(retrievedData)
        assertEquals(retrievedData.results!!.size, SEARCH_COUNT)
    }


    /*
    search popular person from remote API service
    returns empty list
    */
    @Test
    fun searchPopularPersonsFromRemoteWebservice_returnEmptyList() = runBlockingTest {
        val retrievedData = cloudRepository.searchPersons(PAGE, NON_EXIST_NAME)
        assertNotNull(retrievedData)
        assertEquals(retrievedData.results!!.size, EMPTY_SEARCH_COUNT)
    }

    /*
        insert popularPerson
        verify the correct method is called
        confirm new rows inserted
     */
    @Test
    fun insertPopularPerson_returnRow() = runBlockingTest {
        // Arrange
        val insertedRow = 1L
        mockitoWhen(
            popularPersonsDao
                .insertPopularPerson(any(PopularPersons::class.java))
        )
            .thenReturn(insertedRow)

        // Act
        val returnedValue = appRepo.insertPopularPerson(POPULAR_PERSON1)

        // Assert
        verify(popularPersonsDao).insertPopularPerson(any(PopularPersons::class.java))
        verifyNoMoreInteractions(popularPersonsDao)

        System.out.println("Returned value: $returnedValue")
        assertEquals(1L, returnedValue)
    }


    /*
       insert popularPerson
       return failure
    */
    @Test
    fun insertPopularPerson_returnFailure() = runBlockingTest {
        // Arrange
        val failedInsert = -1L
        mockitoWhen(
            popularPersonsDao
                .insertPopularPerson(any(PopularPersons::class.java))
        )
            .thenReturn(failedInsert)

        // Act
        val returnedValue = appRepo.insertPopularPerson(POPULAR_PERSON1)

        // Assert
        verify(popularPersonsDao).insertPopularPerson(any(PopularPersons::class.java))
        verifyNoMoreInteractions(popularPersonsDao)

        System.out.println("Returned value: $returnedValue")
        assertEquals(-1L, returnedValue)
    }


    /*
     retrieve popularPersons
     return popularPersons list
    */
    @Test
    fun selectPopularPersons_returnListOfPopularPersons() = runBlockingTest {
        //Arrange
        val popularPersonsList: MutableList<PopularPersons> = TestUtil.TEST_POPULAR_PERSONS_LIST
        mockitoWhen(
            popularPersonsDao
                .selectAllPopularPersons()
        )
            .thenReturn(popularPersonsList)

        // Act
        val returnedData = appRepo.selectPopularPerson()
        assertEquals(popularPersonsList,returnedData)
    }

    /*
       retrieve popularPersons
       return popularPersons emptyList
    */
    @Test
    fun selectPopularPersons_returnEmptyList() = runBlockingTest {
        //Arrange
        val popularPersonsList: MutableList<PopularPersons> = ArrayList()
        mockitoWhen(
            popularPersonsDao
                .selectAllPopularPersons()
        )
            .thenReturn(popularPersonsList)

        // Act
        val returnedData = appRepo.selectPopularPerson()
        assertEquals(popularPersonsList,returnedData)
    }


    /*
      delete table
      return success
   */
    @Test
    fun deletePopularPersons_returnSuccess() = runBlockingTest {
        //Arrange
        val deletedTable = 1
        mockitoWhen(
            popularPersonsDao
                .deletePopularPersonTable()
        )
            .thenReturn(deletedTable)

        // Act
        val returnedValue = appRepo.deletePopularPersonTable()
        assertEquals(deletedTable,returnedValue)
    }

    /*
    delete table
    return failure
    */
    @Test
    fun deletePopularPersons_returnFailure() = runBlockingTest {
        //Arrange
        val deletedTable = -1
        mockitoWhen(
            popularPersonsDao
                .deletePopularPersonTable()
        )
            .thenReturn(deletedTable)

        // Act
        val returnedValue = appRepo.deletePopularPersonTable()
        assertEquals(deletedTable,returnedValue)
    }
}


