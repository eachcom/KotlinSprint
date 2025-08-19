package org.example.lesson_2

    const val PERCENT_MATH_TASK4 = 100.0

fun main () {
    val crystalOre = 7
    val ironOre = 11
    val baf = 20
    val bafPercent = baf / PERCENT_MATH_TASK4

    val crystalOreBaf = crystalOre * bafPercent
    val ironOreBaf = ironOre * bafPercent

    println("Дополнительная кристаллическая руда - ${crystalOreBaf.toInt()}")
    println("Дополнительная железная руда - ${ironOreBaf.toInt()}")
}