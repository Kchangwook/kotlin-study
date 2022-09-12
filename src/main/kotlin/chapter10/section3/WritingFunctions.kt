package chapter10.section3

import java.io.File
import java.io.PrintWriter

fun main() {
    val outString = "안녕하세요!\tHello\r\nWorld!."
    val path = "D:\\test\\testfile.txt"

    val file = File(path)
    val printWriter = PrintWriter(file)

    printWriter.println(outString)
    printWriter.close()
}