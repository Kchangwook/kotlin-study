package chapter08.section2

fun main() {
    val fruits = arrayOf("banana", "avocado", "apple", "kiwi")

    fruits.filter { it.startsWith("a") }
        .sortedBy { it }
        .forEach { println(it) }
}