package chapter02.section3

fun main() {
    val num = 256

    if (num is Int) {
        println(num)
    } else {
        println("Not a Int")
    }
}