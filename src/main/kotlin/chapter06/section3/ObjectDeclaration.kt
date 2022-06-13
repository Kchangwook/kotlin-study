package chapter06.section3

object OCustomer {
    var name = "Kildong"
    fun greeting() {
        println("Hello World!")
    }

    val HOBBY = Hobby("BasketBall")
    init {
        println("Init")
    }
}

class CCustomer {
    companion object {
        const val Hello = "hello"
        var name = "Joosol"
        @JvmField val HOBBY = Hobby("Football")
        @JvmStatic fun greeting() {
            println("Hello World!")
        }
    }
}

class Hobby(val name: String) {}

fun main() {
    OCustomer.greeting()
    OCustomer.name = "Dooly"

    println("name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)

    CCustomer.greeting()
    println("name = ${CCustomer.name}, HELLO = ${CCustomer.Hello}")
    println(CCustomer.HOBBY.name)
}