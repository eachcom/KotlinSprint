package org.example.lesson_2

    const val BAF = 20

fun main () {
    val crystalOre = 7
    val ironOre = 11
    val bafPercent: Double = BAF/100.0

    val crystalOreBaf = crystalOre*bafPercent
    val ironOreBaf = ironOre*bafPercent

    println("Дополнительная кристаллическая руда - ${crystalOreBaf.toInt()}")
    println("Дополнительная железная руда - ${ironOreBaf.toInt()}")
}