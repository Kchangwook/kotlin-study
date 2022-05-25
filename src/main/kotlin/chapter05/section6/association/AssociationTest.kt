package chapter05.section6.association

class Patient(val name: String) {
    fun doctorList(d: Doctor) {
        println("Patient: $name, Doctor: ${d.name}")
    }
}

class Doctor(val name: String) {
    fun patientList(p: Patient) {
        println("Doctor: $name, Patient: ${p.name}")
    }
}

fun main() {
    val doctor = Doctor("KimSabu")
    val patient = Patient("Kildong")

    doctor.patientList(patient)
    patient.doctorList(doctor)
}