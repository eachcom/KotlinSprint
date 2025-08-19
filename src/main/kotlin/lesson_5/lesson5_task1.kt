package org.example.lesson_5

fun main() {
    val firstNumberToCalc = (0..10).random()
    val secondNumberToCalc = (0..10).random()
    val trueAnswer = firstNumberToCalc + secondNumberToCalc

    print("Для входа в программу решите пример: $firstNumberToCalc + $secondNumberToCalc = ")
    val userAnswer = readln()
    val userAnswerInt = userAnswer.toInt()

    if (userAnswerInt == trueAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}