package task7

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    scanner.nextLine() // Переход на следующую строку

    for (i in 1..n) {
        val input = scanner.nextLine().split(" ")
        val brand = input[0]
        val year = input[1].toInt()

        val car = Car(brand, year)
        car.printDetails()
    }
}
