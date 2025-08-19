package org.example.lesson_3

fun main() {
    val name = "Татьяна"
    val patronymic = "Сергеевна"
    var surname = "Андреева"
    var age = 20

    println("""
        Возраст - $age
        ФИО - $surname $name $patronymic
    """.trimIndent())

    age = 22
    surname = "Сидорова"

    println("""
        Возраст - $age
        ФИО - $surname $name $patronymic
    """.trimIndent())
}