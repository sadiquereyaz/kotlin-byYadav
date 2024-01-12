package oops

// class that holds data and it has some default functions like toString(), copy() etc
data class Child(val name: String, var age: Int, var phone: Int) {}

fun main() {
    val child1 = Child("Aisha", 23, 9506)

    println("--------------------------------")
    println(child1)

    val stringAge: String = child1.age.toString()

    var child1A = child1.copy()
    child1A.age = 11

    println("Age of child1 is ${child1.age} and age of child1A is ${child1A.age}")


}