package org.example.lesson_4

const val NUMBER_OF_TABLES = 13

fun main() {
    val todayReservation = 13
    val tomorrowReservation = 9

    val todayFreeTables = NUMBER_OF_TABLES > todayReservation
    val tomorrowFreeTables = NUMBER_OF_TABLES > tomorrowReservation

    println("[Доступность столиков на сегодня: $todayFreeTables],\n[Доступность столиков на завтра: $tomorrowFreeTables].")
}