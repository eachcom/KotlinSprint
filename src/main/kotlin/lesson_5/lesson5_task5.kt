package org.example.lesson_5

fun main() {
    val userAnswers = mutableSetOf<Int>()
    val trueAnswers = mutableSetOf<Int>()

    for (i in 1..3) {
        trueAnswers.add((0..42).random())
    }

    println("Добро пожаловать в игру! Угадайте три числа от 0 до 42!")

    for (i in 1..3) {
        print("Введите число №$i: ")
        userAnswers.add(readln().toInt())
    }

    val result = trueAnswers.intersect(userAnswers)

    when (result.size) {
        3 -> println("Вы выйграли Джекпот!")
        2 -> println("Вы выйграли большой приз!")
        1 -> println("Вы выйграли маленький приз!")
        0 -> println("К сожалению, Вы проиграли.")
    }

    print("Выигрышные числа: $trueAnswers")
}