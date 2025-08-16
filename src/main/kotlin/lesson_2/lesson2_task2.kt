package org.example.lesson_2

fun main () {
    val numberOfWorkers = 50
    val numberOfInterns = 30
    val workersSalary = 30000
    val internSalary = 20000

    val allWorkersSalary = numberOfWorkers * workersSalary
    val allInternsSalary = numberOfInterns * internSalary
    val allWorkersAndInternsSalary = allInternsSalary + allWorkersSalary // для выполнения ТЗ можно было не создавать переменную allInternsSalary и написать так: val allWorkersAndInternsSalary = numberOfInterns * internSalary + allWorkersSalary, но мне кажется это криво...
    val averageSalary = allWorkersAndInternsSalary / (numberOfInterns + numberOfWorkers)

    println("Зарплата постоянных сотрудников - $allWorkersSalary")
    println("Общие расходы на всех сотрудников (включая стажеров) - $allWorkersAndInternsSalary")
    println("Средняя заработная плата после прихода стажеров - $averageSalary")
}