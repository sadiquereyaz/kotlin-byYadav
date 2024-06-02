/*When you want a property to have differing data types, subclassing is not the answer.
Instead, Kotlin provides something called generic types that allow you to have a single property
that can have differing data types, depending on the specific use case.*/
class Question<T>(
    // T is generic type parameter
    val question: String,
    val answer: T,
    val difficulty: String
)

fun main(){
    val question1 = Question<String>("What is your name?", "My name is Sadique", "Easy")
    val question2 = Question<Boolean>("Color or the sky is blue.", true, "Hard")
    val question3 = Question<Int>("What is your Age?", 25, "Easy")
}