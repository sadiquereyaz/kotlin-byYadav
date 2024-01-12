fun main() {
    val myVariable = { x: Int -> x * x }
    myVariable(4)
    println("Square is " + myVariable(4))
}