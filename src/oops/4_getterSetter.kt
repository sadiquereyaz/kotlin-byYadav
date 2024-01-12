package oops

//in kotlin Getter and Setter is automatically generated no need write its code seperately. But we are wirting it for ouR UNDERSTANDING

class User {
    var userId: String = "default UserId"
        get() {                  //getter for var userId
            println("Getting user")
            return field
        }
        set(value) {
            println("Setting user to: $value")

            if (value.length > 10) {
                println("Your are exceeding the advised length")
            }
            field = value
            println("Success!")
        }
    var userName: String = ""        //default value
        set(value) {
            field = value   //field means 'userName'
        }
}

fun main() {
    var user1 = User()
    println("----------------------------------------------------")
    println(user1.userId)   //A/C to the op, getter is executed first when we retrieve any value of an object
    println("----------------------------------------------------")
    user1.userId = "New Id "
    println("----------------------------------------------------")

}