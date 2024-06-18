package com.example.interview

import org.junit.Test

import org.junit.Assert.*
import kotlin.concurrent.thread

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun `print pairs`() {
        val fisher = Fisher()
        val maxCount = 10
        val threads = listOf(
            thread(start = false) {
                for (i in 1..maxCount) {
                    fisher.printLeft()
                }
            },
            thread(start = false) {
                for (i in 1..maxCount) {
                    fisher.printRight()
                }
            },
            thread(start = false) {
                for (i in 1..maxCount) {
                    fisher.printDash()
                }
            },
        )
        threads.forEach { it.start() }
        threads.forEach { it.join() }
        println()
    }
}