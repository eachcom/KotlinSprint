package org.example.lesson_2

const val STUDENT_COUNT = 4

fun main() {
    val studentOneResult = 3.0
    val studentTwoResult = 4.0
    val studentThreeResult = 3.0
    val studentFourResult = 5.0

    val averageScore = (studentOneResult + studentTwoResult + studentThreeResult + studentFourResult) / STUDENT_COUNT

    print("Средний бал - $averageScore")
}