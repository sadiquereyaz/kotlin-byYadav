package oops

fun main() {
    var student1 = Children("Sadique", 2022, "JMI", "Azmi")        //object of class Student
    println(student1.name)

    println("----------------------------------------------------------------")

    var student2 = Children("Aqsa", 111, "NIET", "Kashmir") //object of class Student
    student2.showName()
}

class Children constructor(var name: String, var id: Int, var college: String, var homeTown: String) {
    fun showName() {
        println("My Name is $name")
    }
}