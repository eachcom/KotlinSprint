package org.example.lesson_3

fun main() {
    val parsingString = "D2-D4;0"

    val parsedList = parsingString.split("-",";")

    val start = parsedList[0]
    val finish = parsedList[1]
    val strokeNumber = parsedList[2]

    println(start)
    println(finish)
    println(strokeNumber)
}