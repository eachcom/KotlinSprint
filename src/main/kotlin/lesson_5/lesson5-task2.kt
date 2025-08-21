package org.example.lesson_5

import java.text.SimpleDateFormat
import java.util.Date

const val LEGAL_AGE = 18

fun main() {
    val sdf = SimpleDateFormat("yyyy")
    val currentYear = sdf.format(Date()).toInt()

    print("Введите год Вашего рождения: ")
    val userYear = readln().toInt()

    if (currentYear - userYear >= LEGAL_AGE) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Доступ запрещен!")
    }
}