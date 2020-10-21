package com.examples.data.repository

import com.examples.data.restful.FakeApiService
import com.examples.data.source.cloud.FakeCloudRepository
import com.examples.data.source.cloud.BaseCloudRepository
import com.examples.data.source.db.AppDatabase
import com.examples.data.source.db.PopularPersonsDao
import com.examples.data.util.Constants.ACTOR_NAME
import com.examples.data.util.Constants.EMPTY_SEARCH_COUNT
import com.examples.data.util.Constants.NON_EXIST_NAME
import com.examples.data.util.Constants.PAGE
import com.examples.data.util.Constants.POPULAR_PERSONS_COUNT
import com.examples.data.util.Constants.SEARCH_COUNT
import com.examples.data.util.InstantExecutorExtension
import com.examples.data.util.MockJson
import com.examples.data.util.TestUtil
import com.examples.entities.popular_person.local.PopularPersons
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.ArgumentMatchers.any
import org.mockito.Mockito.*
import org.mockito.Mockito.`when` as mockitoWhen

@ExperimentalCoroutinesApi
@ExtendWith(InstantExecutorExtension::class)
class AppRepoImpAndroidTest {

    private val POPULAR_PERSON1 = PopularPersons(TestUtil.TEST_POPULAR_PERSONS_1)

    //system under test
    private lateinit var appRepo: AppRepoImp

    private lateinit var cloudRepository: BaseCloudRepository
    private lateinit var database: AppDatabase
    private lateinit var popularPersonsDao: PopularPersonsDao
    private lateinit var apiService: FakeApiService
    private lateinit var mockJson: MockJson


    @BeforeEach
    fun initEach() {
        database = mock(AppDatabase::class.java)
        popularPersonsDao = mock(PopularPersonsDao::class.java)
        mockJson = MockJson()
        apiService = FakeApiService(mockJson)
        cloudRepository = FakeCloudRepository(apiService)
        appRepo = AppRepoImp(cloudRepository, database)
    }


    /*
        insert popularPerson
        verify the correct method is called
        confirm new rows inserted
     */
    @Test
    fun insertPopularPerson_returnRow() = runBlocking {
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
    fun insertPopularPerson_returnFailure() = runBlocking {
        // Arrange
        val failedInsert = -1L
        mockitoWhen(
            popularPersonsDao
                .insertPopularPerson(POPULAR_PERSON1)
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
    fun selectPopularPersons_returnListOfPopularPersons() = runBlocking {
        //Arrange
        val popularPersonsList: MutableList<PopularPersons> = TestUtil.TEST_POPULAR_PERSONS_LIST
        mockitoWhen(
            popularPersonsDao
                .selectAllPopularPersons()
        )
            .thenReturn(popularPersonsList)

        // Act
        val returnedData = appRepo.selectPopularPerson()
        assertEquals(popularPersonsList, returnedData)
    }

    /*
       retrieve popularPersons
       return popularPersons emptyList
    */
    @Test
    fun selectPopularPersons_returnEmptyList() = runBlocking {
        //Arrange
        val popularPersonsList: MutableList<PopularPersons> = ArrayList()
        mockitoWhen(
            popularPersonsDao
                .selectAllPopularPersons()
        )
            .thenReturn(popularPersonsList)

        // Act
        val returnedData = appRepo.selectPopularPerson()
        assertEquals(popularPersonsList, returnedData)
    }


    /*
      delete table
      return success
   */
    @Test
    fun deletePopularPersons_returnSuccess() = runBlocking {
        //Arrange
        val deletedTable = 1
        mockitoWhen(
            popularPersonsDao
                .deletePopularPersonTable()
        )
            .thenReturn(deletedTable)

        // Act
        val returnedValue = appRepo.deletePopularPersonTable()
        assertEquals(deletedTable, returnedValue)
    }

    /*
    delete table
    return failure
    */
    @Test
    fun deletePopularPersons_returnFailure() = runBlocking {
        //Arrange
        val deletedTable = -1
        mockitoWhen(
            popularPersonsDao
                .deletePopularPersonTable()
        )
            .thenReturn(deletedTable)

        // Act
        val returnedValue = appRepo.deletePopularPersonTable()
        assertEquals(deletedTable, returnedValue)
    }
}


