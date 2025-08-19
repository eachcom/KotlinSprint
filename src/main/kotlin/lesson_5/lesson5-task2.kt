package org.example.lesson_5

import java.text.SimpleDateFormat
import java.util.Date

const val LEGAL_AGE = 18

fun main() {
    val sdf = SimpleDateFormat("yyyy")
    val currentYear = sdf.format(Date())
    val currentYearInt = currentYear.toInt()

    print("Введите год Вашего рождения: ")
    val userYearString = readln()
    val userYearInt = userYearString.toInt()

    val userAge = currentYearInt - userYearInt

    if (userAge >= LEGAL_AGE) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Доступ запрещен!")
    }
}