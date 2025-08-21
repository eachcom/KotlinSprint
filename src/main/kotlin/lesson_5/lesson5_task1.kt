package org.example.lesson_5

fun main() {
    val Number1 = (0..10).random()
    val Number2 = (0..10).random()

    print("Для входа в программу решите пример: $Number1 + $Number2 = ")
    val userAnswer = readln().toInt()

    if (userAnswer == Number1 + Number2) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}