package com.examples.domain.mappers.popular_persons

import com.examples.domain.util.InstantExecutorExtension
import com.examples.entities.popular_person.local.PopularPersons
import com.examples.entities.popular_person.remote.Result
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mockito.`when` as mockitoWhen

@ExtendWith(InstantExecutorExtension::class)
class PopularPersonsMapperTest {

    // System under test
    private lateinit var popularPersonsMapper: PopularPersonsMapper

    @BeforeEach
    fun initEach() {
        popularPersonsMapper = PopularPersonsMapper()
    }

    @Test
    fun resultObjectToPopularPersonsObject_returnPopularPerson(){
        //Arrange
        val resultDto = Result()
        resultDto.apply {
            popularity = 5f
            id = 2
            profilePath = null
            name = "Shehab Elsarky"
            knownFor = null
            isAdult = false
        }

        val popularPersonsBo = PopularPersons(
            entityId = 0,
            id = resultDto.id?: 0,
            name = resultDto.name?: "",
            overview = resultDto.knownFor!![0].overview ?: "",
            tile = resultDto.knownFor!![0].title ?: "",
            image = resultDto.profilePath ?: "",
            popularity = resultDto.popularity ?: 0.0f
        )

        mockitoWhen(popularPersonsMapper.convert(resultDto))
            .thenReturn(popularPersonsBo)

        //Act
        val returnedValue = popularPersonsMapper.convert(resultDto)

        //Assert
        assertNotNull(returnedValue)
        assertNotNull(returnedValue.name)
        assertNotNull(returnedValue.overview)
        assertNotNull(returnedValue.tile)
        assertNotNull(returnedValue.image)
        assertNotNull(returnedValue.popularity)

        assertEquals(resultDto.id,returnedValue.id)
        assertEquals(resultDto.name,returnedValue.name)
        assertEquals(resultDto.popularity,returnedValue.popularity)
    }

}