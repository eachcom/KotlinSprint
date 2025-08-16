package org.example.lesson_1

const val secondsInOneMinute: Int = 60
const val minutesInOneHour: Int = 60

fun main() {

    val secondsForCalc = 6480 // не могу считать абсолютной константой, все же мы можем посчитать что-то еще. Но идею я понял! Переписал название переменной, что бы сделать ее более читаемой.


    val secondsRemains = secondsForCalc % secondsInOneMinute // получаем остаток от деления общего количества секунд на количество секунд в минуте
    val minutesInSpace = secondsForCalc / secondsInOneMinute // получаем количество минут проведенных Гагарином в космосе
    val minutesRemains = minutesInSpace % minutesInOneHour // получаем остаток от деления общего количества минут на количество минут в часе
    val hoursInSpace = minutesInSpace / minutesInOneHour // получаем количество часов проведенных Гагарином в космосе

    print("%02d".format(hoursInSpace))
    print(":")
    print("%02d".format(minutesRemains))
    print(":")
    print("%02d".format(secondsRemains)) // Спасибо! Очень нужная функция! Нужно будет погуглить как еще склонять (1 год, 2 года, 5 лет), очень часто встречается.
}