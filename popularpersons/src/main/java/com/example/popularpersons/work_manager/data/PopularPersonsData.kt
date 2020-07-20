package com.example.popularpersons.work_manager.data

import com.examples.domain.popular_persons.PopularPersonsRemoteUseCase
import com.examples.entities.popular_person.parameters.PopularPersonsQuery
import java.io.Serializable

class PopularPersonsData : Serializable{
    var popularPersonsUseCase: PopularPersonsRemoteUseCase? = null
    var parameters: PopularPersonsQuery? = null
}