package org.example.lesson_2
import kotlin.math.pow

const val PERCENT_MATH = 100.0
const val ONE_FOR_MATH = 1

fun main() {
    val depositAmount = 70000
    val interestRate = 16.7
    val depositPeriod = 20

    val amountToPay = depositAmount * (ONE_FOR_MATH + interestRate/PERCENT_MATH).pow(depositPeriod)

    println(String.format("%.3f", amountToPay))
}