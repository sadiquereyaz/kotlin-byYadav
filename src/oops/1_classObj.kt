package oops

fun main(){

    var student1 = Student()        //object of class Student
    println(student1.id)
    student1.name = "Sadique"
    student1.id = 2207696
    student1.college = "JMI"
    student1.homeTown = "Azamgarh"
    println(student1.name)

    println("----------------------------------------------------------------")

    var student2 = Student() //object of class Student
    student2.name = "Aqsa"
    student2.id = 220
    student2.college = "NIET"
    student2.homeTown = "Kashmir"

    student2.showName()
}

class Student{
    var name: String = ""
    var id: Int = 0     //default
    var college: String = ""
    var homeTown: String = ""

    fun showName(){
        println("My Name is $name")
    }
}