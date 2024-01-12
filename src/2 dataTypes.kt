class Student(                                  //customDataType
    val name: String, val rollNo: Int
) {
        fun showRoll(){
            print("And my roll no is $rollNo")
        }
}

fun main() {
    var Byte = 1  // 1 bytes = 8 bits whose range is 2^8-1 to 2^8
    var Short = 1  // 2 bytes
    var Int = 1  // 4 bytes
    var Long = 1  // 8 bytes

    val student1: Student = Student(name = "Sadique", rollNo = 45)

    print("My name is ${student1.name} ")
    student1.showRoll()
}