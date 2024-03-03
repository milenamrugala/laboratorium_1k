// Milena Mrugała, zadanie nr 3

fun main() {
    val students = listOf(
        Student("Milena", "Mrugała", "51251"),
        Student("Monika", "Fik", "41341"),
        Student("Adam", "Malinowski", "71571"),
        Student("Anna", "Lewandowska", "90890"),
        Student("Barbara", "Starzyńska", "45645")
    )

    for ((i, student) in students.withIndex()) {
        println("Student ${i + 1}: $student")
    }
}