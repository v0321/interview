package com.example.interview

import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import org.junit.Test

class SuspendPrintTest {

    @Test
    fun `print pairs`() = runBlocking {
        val fisher = SuspendFisher()
        val maxCount = 10

        launch {
            for (i in 1..maxCount) {
                fisher.printLeft()
            }
        }

        launch {
            for (i in 1..maxCount) {
                fisher.printRight()
            }
        }

        launch {
            for (i in 1..maxCount) {
                fisher.printDash()
            }
        }
        withTimeout(3000) {
            joinAll()
            println()
        }
    }
}