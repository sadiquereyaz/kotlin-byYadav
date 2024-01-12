package oops.others
// enum is used to define a set of constant values

enum class Gender {
    Male,
    Female,
    Other
}

enum class Days(val num: Int) {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7)
}

fun main() {
    val mon = Days.MONDAY
    println("--------------------------------")
    println(mon)
    println("Serial No is ${mon.num}")

    val value = Days.SATURDAY
    when (value) {
        Days.SUNDAY->println("This is Sunday")
        else -> println("This is Another day of week")
    }
}