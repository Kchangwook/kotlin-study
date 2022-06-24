package chapter07.coffe

class Thermosiphon(heater: Heater): Pump, Heater by heater {
    override fun pump() {
        if (isHot()) {
            println("Thermosiphon pumping...")
        }
    }
}