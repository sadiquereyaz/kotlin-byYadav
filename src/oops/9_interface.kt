package  oops

//Interface is similar to Abstract, but it Cloneablestate

interface MyInterface {
    fun m1()   //but here we don't need to mention abstract keywords'
    fun m2() {
        println("mrthod 2")
    }

    //    val p1: String = "this is a string"    //state or property initialization is not allowed
    val p1: String
}

interface  Cloneable {
    fun clone()
}

class Child1 : MyInterface, Cloneable {
    override val p1: String = "this is a string"
    override fun m1() {
        println("mrthod 1")
    }

    override fun clone() {
        println("Cloning Done")
    }
}

fun main() {
    val c1 = Child1()
    c1.m1()
    c1.m2()
    c1.clone()
}