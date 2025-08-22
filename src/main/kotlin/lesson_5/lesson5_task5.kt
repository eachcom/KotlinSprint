package org.example.lesson_5

fun main(){
    val number1 = (0..42).random()
    val number2 = (0..42).random()
    val number3 = (0..42).random()
    val trueAnswers = setOf<Int>(number1, number2, number3)

    println("Добро пожаловать в игру! Угадайте три числа от 0 до 42!")

    print("Введите первое число: ")
    val userNumber1 = readln().toInt()
    print("Введите второе число: ")
    val userNumber2 = readln().toInt()
    print("Введите третье число: ")
    val userNumber3 = readln().toInt()

    val userAnswers = setOf<Int>(userNumber1, userNumber2, userNumber3)

    val result = trueAnswers.intersect(userAnswers)

    if (result.count() == 3) {
        println("Вы выйграли Джекпот!")
    } else if (result.count() == 2) {
        println("Вы выйграли большой приз!")
    } else if (result.count() == 1) {
        println("Вы выйграли маленький приз!")
    } else {
        println("К сожалению, Вы проиграли.")
    }

    print("Выигрышные числа: $trueAnswers")
}