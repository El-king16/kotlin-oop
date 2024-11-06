package task4

import java.util.Scanner

fun main() {
    val s = Scanner(System.`in`)

    val command = s.nextLine()

    if (command == "play"){
        val guitar = Guitar()
        guitar.play()
    }
}