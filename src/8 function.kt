fun showDetail(name: String, roll: Int): Int {
    println("name $name and roll no is $roll")
    return 1234
}

fun funCheck(argu: String = "Default Parameter i.e no Argument passed"): String {
    return argu
}

fun main() {
    println("----------------------------------------------------------------")

    val stud = arrayOf("Sadique", "Aqsa", "Malik")
    val rollNo = arrayOf(5, 2, 2, 5, 8)

    val phoneNo = showDetail(stud[2], rollNo[2])

    println("Mobile number is $phoneNo")

    println("----------------------------------------------------------------")

    println("Output when Argument is passed: " + funCheck("Yeeee Arg is passed"))
    println("output when NO Argument is passed: " + funCheck())
    println("----------------------------------------------------------------")

}