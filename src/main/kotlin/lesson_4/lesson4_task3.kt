package org.example.lesson_4

fun main() {
    val sunWeather = true
    val tentOpen = true
    val airHumidity = 20
    val season = "зима"

    val goodCondition = sunWeather == true && tentOpen == true && airHumidity == 20 && season != "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $goodCondition")
}