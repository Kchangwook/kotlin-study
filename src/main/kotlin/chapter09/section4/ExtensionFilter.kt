package chapter09.section4

fun main() {
    var list = listOf(1, 2, 3, 4, 5, 6)
    var listMixed = listOf(1, "Hello", 3, "World", 5, 'A')
    var listWithNull = listOf(1, null, 3, null, 5, 6)
    var listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)
    var map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    println(list.filter { it % 2 == 0})
    println(list.filterNot { it % 2 == 0 })
    println(listWithNull.filterNotNull())

    println("filteredIndexed: ${list.filterIndexed { index, value -> index != 1 && value % 2 == 0 }}")
    println("filteredIndexedTo: ${list.filterIndexedTo(mutableListOf()) { index, value -> index != 1 && value % 2 == 0 } }")

    println("filterKeys: ${map.filterKeys { it != 11 }}")
    println("filterValues: ${map.filterValues { it == "Java" }}")

    println("filterIsInstance: ${listMixed.filterIsInstance<String>()}")
}