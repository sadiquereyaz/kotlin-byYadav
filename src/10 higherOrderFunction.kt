fun sum(
    num1: Int, num2: Int, funName: () -> Unit
) {        //()->Unit is the type of funName. It means funName has no arguments and no return type
    println("sum of $num1 and $num2 is: ${num1 + num2}")
    funName()
}

fun newFunction(fxn: () -> Unit) {
    fxn()
}

fun argFun() {
    println("I am in Argument function")
}

fun main() {
    val fxn = {
        println("summation successful...")
    }
    sum(3, 1, fxn)
    sum(2, 1) {
        println("Completed...")
    }
    println("-------------------------------------------------------")

    newFunction(::argFun)
}