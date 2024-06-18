package com.example.interview

import kotlinx.coroutines.delay

private suspend fun Char.suspendPrint() {
    delay(500)
    print(this)
    System.out.flush()
}

class SuspendFisher {

    suspend fun printLeft() {
        '<'.suspendPrint()
    }

    suspend fun printRight() {
        '>'.suspendPrint()
    }

    suspend fun printDash() {
        '_'.suspendPrint()
    }
}