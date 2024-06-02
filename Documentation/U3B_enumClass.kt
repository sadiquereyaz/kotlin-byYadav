/*An enum class is used to create types with a limited set of possible values.
In the real world, for example, the four cardinal directions—north, south, east,
and west—could be represented by an enum class. */
enum class Difficulty {
    EASY, MEDIUM, HARD
}
class Question2<T>(
    val question: String,
    val answer: T,
   val difficulty: Difficulty
)

fun main(){
    val question1 = Question2<String>("What is your name?", "My name is Sadique", Difficulty.EASY)
    val question2 = Question2<Boolean>("Color or the sky is blue.", true, Difficulty.HARD)
    val question3 = Question2<Int>("What is your Age?", 25, Difficulty.MEDIUM)
}