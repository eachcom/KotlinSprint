package org.example.lesson_2

const val MINUTES_IN_HOUR = 60

fun main () {
    val hourOfDepart = 9
    val minuteOfDepart = 39
    val minutesOnTheWay = 467

    val minutesOfDepartFromMidnight = hourOfDepart * MINUTES_IN_HOUR + minuteOfDepart
    val minutesOfArrivalFromMidnight = minutesOfDepartFromMidnight + minutesOnTheWay

    val hourOfArrival = minutesOfArrivalFromMidnight / MINUTES_IN_HOUR
    val minuteOfArrival = minutesOfArrivalFromMidnight % MINUTES_IN_HOUR

    println("%02d:%02d".format(hourOfArrival, minuteOfArrival))
}