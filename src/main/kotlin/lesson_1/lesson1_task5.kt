package org.example.lesson_1

fun main() {

    val seconds = 6480

    val secondsRemains = seconds % 60
    val minutesInSpace = seconds / 60
    val minutesRemains = minutesInSpace % 60
    val hoursInSpace = minutesInSpace / 60

    print("0$hoursInSpace:$minutesRemains:0$secondsRemains") // очень смущает отсутствие проверок, но на данном этапе мы же не используем операторы циклов и сравнений
}