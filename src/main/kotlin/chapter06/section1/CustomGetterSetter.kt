package chapter06.section1

class Users(id: Int, name: String, age: Int) {
    val id = id
    var name = name
    set(value) {
        println("Tha name was changed")
        field = value.uppercase()
    }

    var age = age
}

fun main() {
    var user = Users(1, "kildong", 35)
    user.name = "coco"
    println("user.name = ${user.name}")
}