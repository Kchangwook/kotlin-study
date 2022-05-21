package chapter05.section5.privatetest

private class PrivateClass {
    private var i = 1
    private fun privateFunc() {
        i++
    }

    fun access() {
        privateFunc()
    }
}

class OtherClass {
    fun test() {
        val pc = PrivateClass()
    }
}

fun main() {
    val pc = PrivateClass()
    pc.access()
}

fun TopFunction() {
    val tpc = PrivateClass()
}