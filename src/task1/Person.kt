package task1

class Person {
    private var name: String = ""

    fun setName(newName: String) {
        name = newName
    }

    fun printName() {
        println("$name")
    }
}
