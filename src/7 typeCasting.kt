fun main() {
    var ob: Any = "Sadique"
    // println(ob.length)         //throws error
    val strOb: String = ob as String        //typecasting using 'as'
     println(strOb.length)


}