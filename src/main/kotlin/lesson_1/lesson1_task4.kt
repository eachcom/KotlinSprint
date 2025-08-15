package org.example.lesson_1

fun main() {
    val length: String = "40_868_600_000"
    val age: Short = 27
    val partOfDay: Float = 0.075f
    val seconds: Short = 6480
    val partOfYear: Double = 2.0547945205479453E-4 // тут у нас E-4 указывает на * -10 в 4 степени, в итоге получаем 0,00020547945, поэтому Double.
    val apogee: UInt = 327000u // апогей орбиты земли не может быть отрицательным, хотя если орбита параболическая, то может, но думаю, что тут была задача проверить запомнил ли ученик про переменные, у которых значение переменной не может быть отрицательным.

    print("$length\n$age\n$partOfDay\n$seconds\n$partOfYear\n$apogee") // захотел использовать наиболее короткую запись для реализации задачи
}