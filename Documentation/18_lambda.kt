fun main() {
    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }
    val cupcake:(Int)->String = {
        "$it cupcakes"
    }
    val treatFxn = trickOrTreat(false, coins)
    val trickFxn = trickOrTreat(true, cupcake)
    val trickFxn2 = trickOrTreat(true, {"$it Candies"})
    val treatFxn2 = trickOrTreat(true) {"$it Momo's"}

    //concise way of writing for loop is use repeat()
    repeat(4){
        treatFxn()
    }
}

val treat = {
    println("Have a Treat")
}
val trick = {
    println("This is the trick")
}

fun trickOrTreat(isTrick: Boolean, extraTreat: (Int) -> String): () -> Unit {
    if (isTrick) {
        println(extraTreat(5))
        return trick
    } else {
        println(extraTreat(10))
        return treat
    }
}
