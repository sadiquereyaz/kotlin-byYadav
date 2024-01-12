fun main() {
    var num1 = 4
    var num2 = 9

    var max = if (num1 > num2) {
        num1
    } else {
        num2
    }
    println("Maximum number is $max")

    var marks = 77
    if (marks in 50..100) {
        print("greater than 50%")
    } else {
        print("Lesser than 50%")
    }

}