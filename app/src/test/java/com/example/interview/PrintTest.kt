package com.example.interview

import org.junit.Test

import kotlin.concurrent.thread

class PrintTest {

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