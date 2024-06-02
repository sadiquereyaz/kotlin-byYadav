//Abstract class: incomplete class i.e. its methods may have nobody
//An abstract class is a class that is declared abstract—it may or may not include abstract methods.
// Abstract classes (or object of abstract class) cannot be instantiated directly, but they can be subclassed.
// An abstract method is a method that is declared without an implementation in abstract class (without braces, and followed by a semicolon)
//When an abstract class is subclassed, the subclass usually provides implementations for all the abstract methods in its parent class

package oops

abstract class Animals {

    //concrete method
    fun eat() {
        println("I can Eat")
    }

    //abstract method (incomplete function)
    abstract fun sleep()

    abstract val color: String
}

class Goat: Animals() {
    override fun sleep() {
        println("Now I can sleep")
    }

    override val color: String  = "green"
}

fun main (){
 //   val animal = Animal()
//    animal.eat()      //we can never create and use objects of abstract class until it is completed in child classes
    val animal = Goat()
    animal.eat()
    animal.sleep()
}