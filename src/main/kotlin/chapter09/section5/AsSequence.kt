package chapter09.section5

fun main() {
    var list1 = listOf(1, 2, 3, 4, 5)
    var listDefault = list1.asSequence()
        .map {
            println("map($it)")
            it * it
        }
        .filter {
            println("filter($it)")
            it % 2 == 0
        }

    println(listDefault)
}