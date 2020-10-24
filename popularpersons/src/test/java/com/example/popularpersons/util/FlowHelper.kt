package com.example.popularpersons.util

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collectIndexed
import org.mockito.ArgumentCaptor
import org.mockito.Mockito

class FlowHelper {
    companion object{
        suspend fun <T> Flow<T>.take(count: Int): List<T> {
            var results: MutableList<T>? = null
            try {
                collectIndexed { index, value ->
                    if (index == 0) results = mutableListOf()
                    results?.add(value)

                    // If the number of  requested data is collected, finish the collection
                    if (index + 1 == count) throw AbortFlowException() // Defined my own AbortFlowException
                }
            } catch (e: AbortFlowException) {
                // Do nothing
                println(e.message)
            }

            if (results == null) throw NoSuchElementException("Expected at least one element")
            return results!!
        }

         fun <T> any(type: Class<T>): T = Mockito.any<T>(type)

        fun <T> capture(argumentCaptor: ArgumentCaptor<T>): T = argumentCaptor.capture()
    }
}