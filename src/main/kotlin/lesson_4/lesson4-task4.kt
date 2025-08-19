package org.example.lesson_4

fun main() {
    val trainingDay = 6

    val exerciseForHand: Boolean = trainingDay % 2 != 0
    val exerciseForPress: Boolean = trainingDay % 2 != 0
    val exerciseForBack: Boolean = trainingDay % 2 == 0
    val exerciseForLeg: Boolean = trainingDay % 2 == 0

    println("""
    Упражнения для рук:      $exerciseForHand
    Упражнения для ног:      $exerciseForPress
    Упражнения для спины:    $exerciseForBack
    Упражнения для пресса:   $exerciseForLeg
    """.trimIndent())
}