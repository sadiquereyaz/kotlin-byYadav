package oops

class Bike {
    var year: Int
    var color: String
    var price: Int

    constructor(modelYear: Int) : this(modelYear, "", 0) {
        // "this" is used to call the other constructor from the constructor
        println("First constructor is Executed")
    }

    constructor(modelYear: Int, color: String, price: Int) {
        year = modelYear
        this.color = color
        this.price = price
        println("Second constructor Executed")
    }
}

fun main() {
    var yamaha = Bike(1984)
    println(yamaha.year)
    println(yamaha.price)

//    var splender = Bike(2001,"blue", 100000000)
//    println(splender.color)
}