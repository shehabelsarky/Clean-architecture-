package com.examples.data.repository

import com.examples.data.source.cloud.BaseCloudRepository
import com.examples.data.source.db.AppDatabase
import com.examples.entities.PopularActorDetails
import com.examples.entities.popular_person.local.PopularPersons
import com.examples.entities.popular_person.remote.PopularPersonsResponse
import javax.inject.Inject

class AppRepoImp @Inject constructor(
    private val cloudRepository: BaseCloudRepository,
    private val database: AppDatabase

) : AppRepository {
    override suspend fun popularPersonDetails(personId: String): com.examples.entities.PopularActorDetails {
        return cloudRepository.popularPersonDetails(personId)
    }

    override suspend fun searchPersons(page: Int, actorName: String): PopularPersonsResponse {
        return cloudRepository.searchPersons(page,actorName)
    }

    override suspend fun getPopularPersons(page: Int): PopularPersonsResponse {
        return cloudRepository.getPopularPersons(page)
    }

    override suspend fun insertPopularPerson(popularPerson: PopularPersons) {
        return database.popularPersonsDao().insertPopularPerson(popularPerson)
    }

    override suspend fun selectPopularPerson(): MutableList<PopularPersons> {
        return database.popularPersonsDao().selectAllPopularPersons()
    }

    override suspend fun deletePopularPersonTable() {
        return database.popularPersonsDao().deletePopularPersonTable()

    }
}