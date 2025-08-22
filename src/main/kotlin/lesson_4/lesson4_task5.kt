package org.example.lesson_4

    const val MIN_CREW = 55
    const val MAX_CREW = 70
    const val MIN_FOOD = 50

fun main() {
    print("Если корабль поврежден введите true, если нет любое значение: ")
    val damage = readln().toBoolean()
    print("Введите количество членов экипажа: ")
    val crew = readln().toInt()
    print("Введите количество ящиков с провизией: ")
    val food = readln().toInt()

    if (!damage) {
        if (crew in MIN_CREW..MAX_CREW && food >= MIN_FOOD)
            print("Удачного плаванья!")
        else {
            print("К сожалению, придется остаться в порту!")
        }
    } else {
        print("Если погода хорошая введите true, если нет любое значение: ")
        val goodWeather = readln().toBoolean()
        if ( crew == MAX_CREW && goodWeather && food > MIN_FOOD)
            print("Удачного плаванья!")
        else {
            print("К сожалению, придется остаться в порту!")
        }
    }
}