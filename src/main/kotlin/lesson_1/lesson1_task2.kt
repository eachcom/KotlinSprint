package org.example.lesson_1

fun main () {
    val numberOfOrders: Int = 75
    val thanksYouMessage: String = "Спасибо за Ваш заказ!"

    println("Количество заказов - $numberOfOrders")
    println("Сообщение покупателю - $thanksYouMessage")

    var numberOfEmployees = 2000
    //println("Количество работников - $numberOfEmployees")

    numberOfEmployees -= 1
    println("Количество работников - $numberOfEmployees")
}