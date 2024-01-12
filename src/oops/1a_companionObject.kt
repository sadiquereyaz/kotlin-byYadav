package oops

/*we make objects if we have to call the method or access the class members.
 We access the members of the class using the object only.*/
/*Companion Object in Kotlin is a way to access the class members using class names only.
There is no requirement for an instance of the class in this scenario.*/

class Person {
    val name = "John"
    fun callMe() {
        println("calling")
    }

    companion object {
        val age = 61
        val wifeName = "Sita"

        fun textMe() {
            println("Texting")
        }
    }
}

class Childd {
    val newObj = Person()

    fun parentName() {
        println("My Father name is ${newObj.name}")
        println("My mothers name is ${Person.wifeName}")        //accessed without using object

        Person.textMe()
    }
}

fun main() {
    val obj = Person()
    obj.callMe()
    // obj.age       //giving error

    Person.textMe() //companion object is accessed by class name

    val objChild = Childd()
    objChild.parentName()
}