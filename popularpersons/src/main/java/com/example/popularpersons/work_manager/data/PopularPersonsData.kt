package com.example.popularpersons.work_manager.data

import com.examples.domain.popular_persons.PopularPersonsUseCase
import com.examples.entities.popular_person.parameters.PopularPersonsQuery
import com.google.gson.annotations.Expose
import java.io.Serializable

class PopularPersonsData : Serializable{
    var popularPersonsUseCase: PopularPersonsUseCase? = null
    var parameters: PopularPersonsQuery? = null
}