package oops

class PrivateModifier {
    private var userName: String = "Sadique"      //private members can only be accessed from inside the class
    fun fxn() {
        println(userName)
    }
    private fun fxnPrivate() {
        println(userName)
    }
}

fun main() {
    var newObj = PrivateModifier()
    // var String = newObj.userName            // throwing error due to private

    newObj.fxn()

    //newObj.fxnPrivate()         // throwing error due to private
}