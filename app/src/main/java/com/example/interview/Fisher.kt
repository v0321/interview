package com.example.interview

fun printChar(char: Char) {
    print(char)
    System.out.flush()
}

class Fisher {

    fun printLeft() {
        printChar('<')
    }

    fun printRight() {
        print('>')
    }

    fun printDash() {
        print('_')
    }
}