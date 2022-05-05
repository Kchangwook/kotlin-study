package chapter04.section3

fun main() {
    returnFunction()
}

inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun returnFunction() {
  println("start of returnFunction")
  inlineLambda(13, 3) lit@ { a, b ->
      val result = a + b
      if (result > 10) {
          return@lit
      }
          println("result: $result")
  }
  println("end of returnFunction")
}