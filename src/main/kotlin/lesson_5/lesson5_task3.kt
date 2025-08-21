package org.example.lesson_5

fun main() {
    val number1 = (0..42).random()
    val number2 = (0..42).random()

    println("""Добро пожаловать в игру Лотерея! 
        |Вам нужно будет угадать 2-а числа от 0 до 42! 
        |Желаем удачи!""".trimMargin())
    print("Введите первое число: ")
    val userNumber1 = readln().toInt()
    print("Введите второе число: ")
    val userNumber2 = readln().toInt()

    if (userNumber1 == number1 && userNumber2 == number2) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (userNumber1 == number1 || userNumber2 == number2) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

    println("Загаданные числа: $number1 и $number2")
}