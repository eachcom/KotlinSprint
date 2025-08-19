package org.example.lesson_5

const val TRUE_ANSWER = "4"

fun main() {
    print("Для входа в программу решите пример: 2 + 2 = ")
    val userAnswer = readln()

    if (userAnswer == TRUE_ANSWER) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}