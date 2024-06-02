private class SmartDevice1(val name: String, val category: String){
    var deviceStatus = "Online"     //hardcoded

    //secondary constructor
    constructor(name: String, category: String, statusCode: Int): this(name, category){
        deviceStatus = when (statusCode) {
            0->"Offline"
            1->"Online"
            else -> "Unknown"
        }
    }
}

fun main(){
    val tv = SmartDevice1("dsjaf", "husdhf",5)
    val db = tv.deviceStatus
    println(db)
}