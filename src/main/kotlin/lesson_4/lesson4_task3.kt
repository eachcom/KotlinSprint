package org.example.lesson_4

    const val IS_SUNNY = true
    const val TENT_OPEN = true
    const val AIR_HUMIDITY = 20
    const val BAD_SEASON = "зима"

fun main() {
    val isSunny = true
    val tentOpen = true
    val airHumidity = 20
    val season = "зима"

    val goodCondition = isSunny == IS_SUNNY &&
                        tentOpen == TENT_OPEN &&
                        airHumidity == AIR_HUMIDITY &&
                        season != BAD_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $goodCondition")
}