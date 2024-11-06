package task2

class Student : Person() {
    private var studentId: Int = 0 // Теперь поле приватное

    fun setStudentId(newId: Int) {
        studentId = newId
    }

    fun getStudentId(): Int {
        return studentId
    }

    fun printStudentDetails() {
        println("Name: ${getName()}, Student ID: ${getStudentId()}")
    }
}
