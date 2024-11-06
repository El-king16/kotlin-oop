package task6

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val animalType = scanner.next()

    val animal: Animal = when (animalType) {
        "Dog" -> Dog()
        "Cat" -> Cat()
        "Bird" -> Bird()
        else -> throw IllegalArgumentException("Unknown animal type")
    }

    animal.sound()
}
