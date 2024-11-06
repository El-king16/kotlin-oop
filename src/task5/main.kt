package task5

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val name = scanner.next()
    val role = scanner.next()

    val person: Person = when (role) {
        "Moderator" -> Moderator(name)
        "Admin" -> Admin(name)
        else -> throw IllegalArgumentException("Неизвестная роль")
    }

    person.showInfo()
}
