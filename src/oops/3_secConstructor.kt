package oops

class Car
{
    var year: Int
    var color: String
    var price: Int

    constructor(modelYear: Int) {
        year = modelYear
        this.color = ""
        this.price = 0
        println("Creating Car object with year $year")
    }

    constructor(color: String, price: Int) {
        year = 0
        this.color = color
        this.price = price
    }
}

fun main() {
    val car1 = Car(1984)
    println( car1.year )

    var car2 = Car("blue", 100000000 )
    println( car2.color )
}