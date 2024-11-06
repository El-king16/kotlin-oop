package task1

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    scanner.nextLine()

    val people = List(n) {
        val person = Person()
        val name = scanner.nextLine()
        person.setName(name)
        person
    }

    for (person in people) {
        person.printName()
    }
}
