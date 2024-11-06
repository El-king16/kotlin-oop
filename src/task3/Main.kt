package task3

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val mathOperations = MathOperations()

    val dataType = scanner.nextLine()
    val operation = scanner.nextLine()
    val num1: Any
    val num2: Any

    if (dataType == "Int") {
        num1 = scanner.nextInt()
        num2 = scanner.nextInt()
    } else {
        num1 = scanner.nextDouble()
        num2 = scanner.nextDouble()
    }

    val result: Double = when (operation) {
        "add" -> if (dataType == "Int") {
            mathOperations.add(num1 as Int, num2 as Int)
        } else {
            mathOperations.add(num1 as Double, num2 as Double)
        }
        "subtract" -> if (dataType == "Int") {
            mathOperations.subtract(num1 as Int, num2 as Int)
        } else {
            mathOperations.subtract(num1 as Double, num2 as Double)
        }
        "multiply" -> if (dataType == "Int") {
            mathOperations.mul(num1 as Int, num2 as Int)
        } else {
            mathOperations.mul(num1 as Double, num2 as Double)
        }
        "divide" -> if (dataType == "Int") {
            mathOperations.divide(num1 as Int, num2 as Int)
        } else {
            mathOperations.divide(num1 as Double, num2 as Double)
        }
        else -> throw IllegalArgumentException("Unsupported operation")
    }

    println(result)
}
