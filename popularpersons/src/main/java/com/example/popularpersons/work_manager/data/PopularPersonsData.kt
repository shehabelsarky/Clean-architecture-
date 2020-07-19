package com.example.popularpersons.work_manager.data

import com.examples.domain.popular_persons.PopularPersonsUseCase
import com.examples.entities.popular_person.parameters.PopularPersonsQuery
import com.google.gson.annotations.Expose
import java.io.Serializable

class PopularPersonsData : Serializable{
    @Expose
    var popularPersonsUseCase: PopularPersonsUseCase? = null
    @Expose
    var parameters: PopularPersonsQuery? = null
}