package task2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    scanner.nextLine()

    val students = List(n) {
        val student = Student()
        val input = scanner.nextLine().split(" ")
        val name = input[0]
        val id = input[1].toInt()

        student.setName(name)
        student.setStudentId(id)
        student
    }

    for (student in students) {
        student.printStudentDetails()
    }
}
