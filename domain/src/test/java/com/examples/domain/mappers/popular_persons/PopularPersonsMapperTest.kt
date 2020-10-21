package com.examples.domain.mappers.popular_persons

import com.examples.domain.util.InstantExecutorExtension
import com.examples.entities.popular_person.local.PopularPersons
import com.examples.entities.popular_person.remote.Result
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mockito.`when` as mockitoWhen

@ExtendWith(InstantExecutorExtension::class)
class PopularPersonsMapperTest {

    // System under test
    private lateinit var popularPersonsMapper: PopularPersonsMapper

    @BeforeEach
    fun init() {
        popularPersonsMapper = PopularPersonsMapper()
    }

    @Test
    fun resultObjectToPopularPersonsObject_returnPopularPerson() {
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
            id = resultDto.id ?: 0,
            name = resultDto.name ?: "",
            overview = resultDto.knownFor?.get(0)?.overview ?: "",
            tile = resultDto.knownFor?.get(0)?.title ?: "",
            image = resultDto.profilePath ?: "",
            popularity = resultDto.popularity ?: 0.0f
        )

        //Act
        val bo = popularPersonsMapper.convert(resultDto)

        //Assert
        assertNotNull(bo)
        assertEquals(popularPersonsBo.name,bo.name)
        assertEquals(popularPersonsBo.overview,bo.overview)
        assertEquals(popularPersonsBo.tile,bo.tile)
        assertEquals(popularPersonsBo.image,bo.image)
        assertEquals(popularPersonsBo.popularity,bo.popularity)

        assertEquals(resultDto.id, bo.id)
        assertEquals(resultDto.name, bo.name)
        assertEquals(resultDto.popularity, bo.popularity)
    }

}