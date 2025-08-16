package org.example.lesson_1

fun main() {
    val length: String = "40_868_600_000"
    val age: Byte = 27 // Спасибо! Почитал, 8 бит - это значения от -128 до 127! Запомню!
    val partOfDay: Float = 0.075f
    val seconds: Short = 6480
    val partOfYear: Double = 2.0547945205479453E-4 // тут у нас E-4 указывает на * -10 в 4 степени, в итоге получаем 0,00020547945, поэтому Double.
    val apogee: Int = 327000 // Поменяю на Int, что бы не мудрить с "супер" условиями. Short - это значения до 32 767, получается, что следующий - это Int.

    print("$length\n$age\n$partOfDay\n$seconds\n$partOfYear\n$apogee") // захотел использовать наиболее короткую запись для реализации задачи
}