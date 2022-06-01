package chapter06.section1

class User(id: Int, name: String, age: Int) {
    val id: Int = id
        get() = field

    var name: String = name
        get() = field
        set(value) {
            field = value
        }

    var age: Int = age
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val user = User(1, "Kildong", 30)
    user.age = 35
    println("user.age = ${user.age}")
}