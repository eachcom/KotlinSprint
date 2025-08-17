package org.example.lesson_2

fun main () {
    val numberOfWorkers = 50
    val numberOfInterns = 30
    val workersSalary = 30000
    val internSalary = 20000

    val allWorkersSalary = numberOfWorkers * workersSalary
    val allInternsSalary = numberOfInterns * internSalary // Этой переменной можно избежать сделав расчет общей зарплаты вот так: allWorkersAndInternsSalary = (numberOfWorkers * workersSalary) + (numberOfInterns * internSalary). Или вот так: allWorkersSalary + numberOfInterns * internSalary. Но мне кажется, что лучше выделить отдельно. Или для экономии памяти лучше делать максимально сжато?
    val allWorkersAndInternsSalary = allInternsSalary + allWorkersSalary
    val averageSalary = allWorkersAndInternsSalary / (numberOfInterns + numberOfWorkers)

    println("Зарплата постоянных сотрудников - $allWorkersSalary")
    println("Общие расходы на всех сотрудников (включая стажеров) - $allWorkersAndInternsSalary")
    println("Средняя заработная плата после прихода стажеров - $averageSalary")
}