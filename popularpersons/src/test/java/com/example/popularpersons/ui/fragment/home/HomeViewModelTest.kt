package com.example.popularpersons.ui.fragment.home

import com.example.popularpersons.util.CoroutinesTestExtension
import com.example.popularpersons.util.FlowHelper
import com.example.popularpersons.util.InstantExecutorExtension
import com.examples.data.mapper.CloudErrorMapper
import com.examples.data.repository.AppRepository
import com.examples.domain.base.CompletionBlock
import com.examples.domain.mappers.popular_persons.PopularPersonsMapper
import com.examples.domain.usecases.popular_persons.DropPopularPersonsUseCase
import com.examples.domain.usecases.popular_persons.InsertPopularPersonUseCase
import com.examples.domain.usecases.popular_persons.PopularPersonsRemoteUseCase
import com.examples.domain.usecases.popular_persons.SelectPopularPersonsUseCase
import com.examples.domain.usecases.search_popular_persons.SearchPopularPersonsRemoteUseCase
import com.examples.entities.popular_person.local.PopularPersons
import com.examples.entities.popular_person.parameters.PopularPersonsQuery
import com.nhaarman.mockitokotlin2.*
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.ConflatedBroadcastChannel
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.extension.RegisterExtension
import org.mockito.ArgumentCaptor
import org.mockito.Captor
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations

@FlowPreview
@InternalCoroutinesApi
@ExperimentalCoroutinesApi
@ExtendWith(InstantExecutorExtension::class)
class HomeViewModelTest {

    //system under test
    private lateinit var viewModel: HomeViewModel

    private lateinit var popularPersonsUseCase: PopularPersonsRemoteUseCase

    @Mock
    private lateinit var searchPopularPersonsUseCase: SearchPopularPersonsRemoteUseCase

    @Mock
    private lateinit var insertPopularPersonsUseCase: InsertPopularPersonUseCase

    @Mock
    private lateinit var selectPopularPersonsUseCase: SelectPopularPersonsUseCase

    @Mock
    private lateinit var dropPopularPersonsUseCase: DropPopularPersonsUseCase

    @Mock
    private lateinit var errorUtil: CloudErrorMapper

    @Mock
    private lateinit var appRepository: AppRepository

    @Mock
    private lateinit var mapper: PopularPersonsMapper

    @Captor
    private lateinit var argCaptor: ArgumentCaptor<(CompletionBlock<List<PopularPersons>>)>

    @JvmField
    @RegisterExtension
    val coroutinesTestExtension = CoroutinesTestExtension()

    @BeforeEach
    fun init() {
        MockitoAnnotations.initMocks(this)
        popularPersonsUseCase = PopularPersonsRemoteUseCase(
            errorUtil,
            appRepository,
            mapper
        )
        viewModel = HomeViewModel(
            popularPersonsUseCase,
            searchPopularPersonsUseCase,
            insertPopularPersonsUseCase,
            selectPopularPersonsUseCase,
            dropPopularPersonsUseCase
        )
    }

    @Test
    fun getRemotePopularPersons_returnSuccess() = runBlocking {
        // Given
        val popularPersons: List<PopularPersons> = ViewModelHelper.getPopularPersonsList()
        val popularPersonsChannel = ConflatedBroadcastChannel<List<PopularPersons>>()
        val returnedValue: ArrayList<PopularPersons> = arrayListOf()
        val completionBlock: CompletionBlock<List<PopularPersons>> = {}

        popularPersonsChannel.offer(popularPersons)

        val popularPersonsRemoteUseCase = spy(popularPersonsUseCase)

        // when
        doReturn(popularPersonsChannel).`when`(popularPersonsRemoteUseCase)
            .execute(
                PopularPersonsQuery().apply { page = 1 },
                completionBlock
            )

        // then
        viewModel.getPopularPersons(
            PopularPersonsQuery().apply { page = 1 }
        )

        returnedValue.addAll(popularPersonsChannel.value)

        //assert
        assertNotNull(returnedValue)
        assertEquals(popularPersons[0].id, returnedValue[0].id)
        assertEquals(popularPersons[0].name, returnedValue[0].name)
        assertEquals(popularPersons[0].overview, returnedValue[0].overview)
        assertEquals(popularPersons[0].popularity, returnedValue[0].popularity)
        assertEquals(popularPersons[0].image, returnedValue[0].image)
        assertEquals(popularPersons[0].entityId, returnedValue[0].entityId)

        assertEquals(popularPersons[1].id, returnedValue[1].id)
        assertEquals(popularPersons[1].name, returnedValue[1].name)
        assertEquals(popularPersons[1].overview, returnedValue[1].overview)
        assertEquals(popularPersons[1].popularity, returnedValue[1].popularity)
        assertEquals(popularPersons[1].image, returnedValue[1].image)
        assertEquals(popularPersons[1].entityId, returnedValue[1].entityId)


        assertEquals(popularPersons[2].id, returnedValue[2].id)
        assertEquals(popularPersons[2].name, returnedValue[2].name)
        assertEquals(popularPersons[2].overview, returnedValue[2].overview)
        assertEquals(popularPersons[2].popularity, returnedValue[2].popularity)
        assertEquals(popularPersons[2].image, returnedValue[2].image)
        assertEquals(popularPersons[2].entityId, returnedValue[2].entityId)
    }


    @Test
    fun getRemotePopularPersonsOnComplete_returnSuccess() = runBlocking {
        // Given
        val popularPersons: List<PopularPersons> = ViewModelHelper.getPopularPersonsList()
        val completion: CompletionBlock<List<PopularPersons>> = mock()
        val popularPersonsChannel = ConflatedBroadcastChannel<List<PopularPersons>>()
        val returnedValue: ArrayList<PopularPersons> = arrayListOf()

        val popularPersonsRemoteUseCase = spy(popularPersonsUseCase)

       /* val completionBlock: CompletionBlock<List<PopularPersons>> = {
            onComplete {
                returnedValue.addAll(popularPersonsChannel.value)
            }
        }*/

        val completionBlock: (CompletionBlock<List<PopularPersons>>)->Unit = {}


        popularPersonsChannel.offer(popularPersons)

        val viewModel = HomeViewModel(
            popularPersonsRemoteUseCase,
            searchPopularPersonsUseCase,
            insertPopularPersonsUseCase,
            selectPopularPersonsUseCase,
            dropPopularPersonsUseCase
        )


        val argCaptor = argumentCaptor<(CompletionBlock<List<PopularPersons>>)>().apply {

            doNothing().`when`(popularPersonsRemoteUseCase).execute(
                FlowHelper.any(PopularPersonsQuery::class.java),
                capture()
            )

            viewModel.getPopularPersons(PopularPersonsQuery().apply { page = 1 })

            verify(popularPersonsRemoteUseCase).execute(
                FlowHelper.any(PopularPersonsQuery::class.java),
                capture()
            )

           /* completionBlock.invoke {
                onComplete {
                    returnedValue.addAll(popularPersonsChannel.value)
                }
            }*/
            `when`(completionBlock.invoke {onComplete {  }}).thenReturn(
                runBlocking {
                    popularPersonsChannel.send(popularPersons)
                }
            )
            completionBlock.invoke {
                onComplete {}
            }
            returnedValue.addAll(popularPersonsChannel.value)
            assertEquals(returnedValue.size,4)
        }
    }
}




















