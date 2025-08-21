package org.example.lesson_5

fun main() {
    val number1 = (0..10).random()
    val number2 = (0..10).random()

    print("Для входа в программу решите пример: $number1 + $number2 = ")
    val userAnswer = readln().toInt()

    if (userAnswer == number1 + number2) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}