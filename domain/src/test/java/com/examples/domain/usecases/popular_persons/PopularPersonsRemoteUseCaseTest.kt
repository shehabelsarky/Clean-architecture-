package com.examples.domain.usecases.popular_persons

import com.examples.data.mapper.CloudErrorMapper
import com.examples.data.repository.AppRepoImp
import com.examples.data.repository.AppRepository
import com.examples.domain.mappers.popular_persons.PopularPersonsMapper
import com.examples.domain.util.InstantExecutorExtension
import com.examples.domain.util.MockJson
import com.examples.entities.popular_person.parameters.PopularPersonsQuery
import com.examples.entities.popular_person.remote.PopularPersonsResponse
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mockito
import org.mockito.Mockito.`when` as mockitoWhen


@FlowPreview
@ExperimentalCoroutinesApi
@ExtendWith(InstantExecutorExtension::class)
class PopularPersonsRemoteUseCaseTest {

    //System under test
    private lateinit var popularPersonsRemoteUseCase: PopularPersonsRemoteUseCase

    private lateinit var errorUtil: CloudErrorMapper
    private lateinit var appRepository: AppRepository
    private lateinit var mapper: PopularPersonsMapper
    private lateinit var mockJson: MockJson
    private val COUNT = 10

    @BeforeEach
    fun initEach() {
        errorUtil = Mockito.mock(CloudErrorMapper::class.java)
        appRepository = Mockito.mock(AppRepoImp::class.java)
        mapper = Mockito.mock(PopularPersonsMapper::class.java)
        mockJson = MockJson()
        popularPersonsRemoteUseCase = PopularPersonsRemoteUseCase(
            errorUtil,
            appRepository,
            mapper
        )
    }

    @Test
    fun convertDtoResponseToListOfPopularPersons_returnPopularPersonsList() = runBlocking {
        //Given
        val dto: PopularPersonsResponse = mockJson.getPopularPersons()

        //when
        val bo = popularPersonsRemoteUseCase.convert(dto)

        //then
        Assert.assertNotNull(dto)
        Assert.assertEquals(dto.results!![0].name!! ,bo[0].name)
        Assert.assertEquals(dto.results!![0].popularity ,bo[0].popularity)
        Assert.assertEquals(dto.results!![0].id ,bo[0].id)
        Assert.assertEquals(dto.results!![0].profilePath!! ,bo[0].image)
        Assert.assertEquals(dto.results!![0].knownFor!![0].overview!! ,bo[0].overview)
        Assert.assertEquals(dto.results!![0].knownFor!![0].title!! ,bo[0].tile)
    }


    @Test
    fun executeOnBackground_returnPopularPersonsResponseDto() = runBlocking {
        //Given
        val dto: PopularPersonsResponse = mockJson.getPopularPersons()
        val query = PopularPersonsQuery()
        query.page = 1
        //when
        mockitoWhen(popularPersonsRemoteUseCase.executeOnBackground(query))
            .thenReturn(dto)

        //then
        Assert.assertNotNull(dto)
        Assert.assertEquals(dto.results!!.size ,COUNT)

    }
}