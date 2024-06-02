/*When a class is defined as a data class, the following methods are implemented.
equals()
hashCode(): you'll see this method when working with certain collection types.
toString()
componentN(): component1(), component2(), etc.
copy()*/
data class Question3<T>(
    val question: String,
    val answer: T,
   val difficulty: Difficulty
)

fun main(){
    val question1 = Question3<String>("What is your name?", "My name is Sadique", Difficulty.EASY)
    val question2 = Question3<Boolean>("Color or the sky is blue.", true, Difficulty.HARD)
    val question3 = Question3<Int>("What is your Age?", 25, Difficulty.MEDIUM)

    println(question2.toString())
}

