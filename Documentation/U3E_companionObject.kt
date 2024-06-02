/*
You can define a singleton object inside another class using a companion object.
A companion object allows you to access its properties and methods from inside the class,
if the object's properties and methods belong to that class, allowing for more concise syntax.
* */
data class Question5<T>(
    val question: String,
    val answer: T,
   val difficulty: Difficulty
)
class Quiz{
    val question1 = Question5<String>("What is your name?", "My name is Sadique", Difficulty.EASY)
    val question2 = Question5<Boolean>("Color or the sky is blue.", true, Difficulty.HARD)
    val question3 = Question5<Int>("What is your Age?", 25, Difficulty.MEDIUM)
    companion object StudentProgress{
        val total :Int = 10
        var answered:Int = 3
    }
}
fun main(){
    println("${Quiz.answered} out of ${Quiz.total} answered.")
}

