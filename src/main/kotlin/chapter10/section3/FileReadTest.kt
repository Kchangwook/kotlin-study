package chapter10.section3

import java.io.FileReader

fun main() {
    val path = "D:\\test\\Over the Rainbow.txt"

    try {
        val read = FileReader(path)
        println(read.readText())
    } catch (exception: Exception) {
        println(exception.message)
    }
}