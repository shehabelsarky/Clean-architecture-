package com.example.popularpersons.work_manager.worker_request

import com.example.popularpersons.work_manager.data.PopularPersonsData
import com.examples.domain.popular_persons.PopularPersonsUseCase
import com.examples.entities.popular_person.parameters.PopularPersonsQuery
import com.google.gson.Gson

class WorkManagerDataHelper {
    companion object {

        fun serializePopularPersonPOJOToJson(popularPersonsData: PopularPersonsData): String {
            return Gson().toJson(popularPersonsData)
        }

        fun deserializePopularPersonPOJOFromJson(data: String?): PopularPersonsData? {
            return Gson().fromJson(data, PopularPersonsData::class.java)
        }
    }
}