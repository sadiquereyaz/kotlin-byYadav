package oops
//   when one class takes(acquire) the property and behaviour of another class then it is called inheritance

open class Animal {
    var limbs: Int = 4
    fun run() {
        println("Running........")
    }
}

class Human : Animal() {

    fun write() {
        println("Hello Gentleman")
    }
}

fun main() {
    var humanObj = Human()
    println("No of legs and Hand Human have: ${humanObj.limbs}")
    humanObj.run()
}