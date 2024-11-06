package task3

class MathOperations {
    // Сложение
    fun add(a: Int, b: Int): Double = (a + b).toDouble()
    fun add(a: Double, b: Double): Double = a + b

    // Вычитание
    fun subtract(a: Int, b: Int): Double = (a - b).toDouble()
    fun subtract(a: Double, b: Double): Double = a - b

    // Умножение
    fun mul(a: Int, b: Int): Double = (a * b).toDouble()
    fun mul(a: Double, b: Double): Double = a * b

    // Деление
    fun divide(a: Int, b: Int): Double = (a / b).toDouble()
    fun divide(a: Double, b: Double): Double = a / b
}
