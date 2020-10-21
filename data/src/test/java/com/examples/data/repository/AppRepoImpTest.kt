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
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mockito.*

@ExperimentalCoroutinesApi
@ExtendWith(InstantExecutorExtension::class)
class AppRepoImpTest {

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
      retrieve popular persons from remote API service
     */
    @Test
    fun getPopularPersonsFromRemoteWebservice_returnSuccess() = runBlocking {
        val retrievedData =  appRepo.getPopularPersons(PAGE) 
        assertNotNull(retrievedData)
        assertEquals(retrievedData.results!!.size, POPULAR_PERSONS_COUNT)
    }


    /*
     search popular person from remote API service
    */
    @Test
    fun searchPopularPersonsFromRemoteWebservice_returnSuccess() = runBlocking {
        val retrievedData = cloudRepository.searchPersonsReturnsData(PAGE, ACTOR_NAME)
        assertNotNull(retrievedData)
        assertEquals(retrievedData.results!!.size, SEARCH_COUNT)
    }


    /*
    search popular person from remote API service
    returns empty list
    */
    @Test
    fun searchPopularPersonsFromRemoteWebservice_returnEmptyList() = runBlocking {
        val retrievedData = cloudRepository.searchPersons(PAGE, NON_EXIST_NAME)
        assertNotNull(retrievedData)
        assertEquals(retrievedData.results!!.size, EMPTY_SEARCH_COUNT)
    }

}


