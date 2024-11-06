package task5

class Admin(name: String) : Person(name, "Admin") {
    override fun showInfo() {
        println("Admin Name: $name")
    }
}
