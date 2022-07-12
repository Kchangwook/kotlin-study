package chapter07.section2

class User(val id: Int, val name: String, var grade: String = "Normal") {
    fun check() {
        if (grade === "Normal") {
            println("You need to get the Silver grade")
        }
    }
}

fun main() {
    println(User::class)

    val classInfo = User::class
    classInfo.members.forEach { println("Property name: ${it.name}, type: ${it.returnType}") }
}