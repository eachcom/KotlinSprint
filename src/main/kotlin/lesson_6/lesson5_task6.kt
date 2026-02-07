package org.example.lesson_6

import org.example.toUTF8
import kotlin.math.pow

fun main() {

    toUTF8() // У меня консоль не переводит из 1251... сделал небольшую функцию

    println("Введите Ваш вес в кг: ")
    val weight = readln().toDouble() // верим что пользователь хороший и вводит данные правильно, а не бяку
    println("Введите Ваш рост в см: ")
    val height = readln().toDouble()

    val imt = weight / (height / 100).pow(2.0)

    print("Ваш ИМТ - ${"%.2f".format(imt)} - ")

    if (imt < 18.5) {
        println("Недостаточная масса тела")
    } else if (imt in 18.5..<25.0) {
        println("Нормальная масса тела")
    } else if (imt in 25.0..<30.0) {
        println("Избыточная масса тела")
    } else {
        println("Ожирение")
    }
}