package chapter05.section6.dependency

class Patient(val name: String, var id: Int) {
    fun doctorList(d: Doctor) {
        println("Patient: $name, Doctor: ${d.name}")
    }
}

class Doctor(val name: String, val p: Patient) {
    var customerId: Int = p.id

    fun patientList() {
        println("Doctor: $name, Patient: ${p.name}")
        println("Patient Id: $customerId")
    }
}

fun main() {
    val patient = Patient("Kildong", 1234)
    val doctor = Doctor("KimSabu", patient)

    doctor.patientList()
}