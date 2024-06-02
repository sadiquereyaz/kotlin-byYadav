/*
* There are many scenarios where you want a class to only have one instance. For example:
Authentication, where only one user should be logged in at a time.
*A class should have only one instance by defining it as a singleton.
* A singleton is a class that can only have a single instance.
*  Kotlin provides a special construct, called an object, that can be used to make a singleton class.
*
* Because there's only one instance of StudentProgress in existence at one time,
* you access its properties by referring to the name of the object itself,
* followed by the dot operator (.), followed by the property name.
* */
data class Question4<T>(
    val question: String,
    val answer: T,
   val difficulty: Difficulty
)

object StudentProgress{
    val total :Int = 10
    var answered:Int = 3
}

fun main(){
//    val question1 = Question3<String>("What is your name?", "My name is Sadique", Difficulty.EASY)
//    val question2 = Question3<Boolean>("Color or the sky is blue.", true, Difficulty.HARD)
//    val question3 = Question3<Int>("What is your Age?", 25, Difficulty.MEDIUM)

    println("${StudentProgress.answered} out of ${StudentProgress.total} answered.")
}

