package com.examples.data.source

import com.examples.data.restful.ApiService
import com.examples.data.restful.FakeApiService
import com.examples.data.source.cloud.BaseCloudRepository
import com.examples.data.source.cloud.FakeCloudRepository
import com.examples.data.util.Constants.ACTOR_NAME
import com.examples.data.util.Constants.EMPTY_SEARCH_COUNT
import com.examples.data.util.Constants.NON_EXIST_NAME
import com.examples.data.util.Constants.PAGE
import com.examples.data.util.Constants.POPULAR_PERSONS_COUNT
import com.examples.data.util.Constants.SEARCH_COUNT
import com.examples.data.util.InstantExecutorExtension
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mockito.*

@ExperimentalCoroutinesApi
@ExtendWith(InstantExecutorExtension::class)
class CloudRepositoryImpTest {

    //system under test
    private lateinit var cloudRepository: BaseCloudRepository
    private lateinit var apiService: ApiService

    @BeforeEach
    fun initEach() {
        cloudRepository = mock(FakeCloudRepository::class.java)
        apiService = mock(FakeApiService::class.java)
    }


    /*
      retrieve popular persons from remote API service
     */
    @Test
    fun getPopularPersonsFromRemoteWebservice_returnSuccess() = runBlockingTest {
        val retrievedData = cloudRepository.getPopularPersons(PAGE)
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
}