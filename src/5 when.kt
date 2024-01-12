fun main() {
    val marks = 78

    var grade: Char = when (marks) {
        in 90..100 -> 'A'
        in 80..90 -> 'B'
        in 70..80 -> {
            println("Your Marks is between 70 and 80")
            'C'
        }
        else -> 'F'
    }
    println("Your Grade is $grade")
}