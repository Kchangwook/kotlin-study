package chapter11.section2

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main()  = runBlocking<Unit> {
    launch {
        delay(1000L)
        println("World!")
    }

    println("Hello")
}