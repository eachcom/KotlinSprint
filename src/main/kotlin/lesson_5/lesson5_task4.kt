package org.example.lesson_5

    const val LOGIN = "Zaphod"
    const val PASSWORD = "PanGalactic"

fun main() {
    print("Для входа в системы введите Ваш логин: ")
    val userLogin = readln()

    if (userLogin == LOGIN) {
        print("Пожалуйста введите Ваш пароль: ")
        val userPassword = readln()
        if (userPassword == PASSWORD) {
            println("Добро пожаловать в систему!")
        } else {
            println("Пароль введен неверно!")
        }
    } else {
        print("Кажется Вы у нас впервые! Пожалуйста, введите пароль для завершения регистрации: ")
        val userPassword = readln()
    }
}