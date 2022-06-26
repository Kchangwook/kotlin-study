package chapter07.section2

class Smartphone(val model: String) {
    private val cpu = "Exynos"

    inner class ExternalStorage(val size: Int) {
        fun getInfo() = "${model}: Installed on $cpu with ${size}Gb"
    }
}

fun main() {
    val mySdCard = Smartphone("S7").ExternalStorage(32)
    println(mySdCard.getInfo())
}