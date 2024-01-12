package oops

open class Parent {
    var property = "35000 Sq. ft"
    open var childrenNo = 6

    open fun buildHouse() {
        println("This is Zahir House")
        println("A Jhopdi")

    }

    class ModernChild : Parent() {
        override fun buildHouse() {
            println("Building FarmHouse")
        }

        fun supBuild() { super.buildHouse() }
        override var childrenNo = 2

    }
}

fun main() {
    val john = Parent.ModernChild()
    println(john.property)
    println(john.childrenNo)

    println("----------------------------------------------------------------")
    john.buildHouse()
    john.supBuild()
    println("----------------------------------------------------------------")


}