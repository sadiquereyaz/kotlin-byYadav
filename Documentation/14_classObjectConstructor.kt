//To maintain immutability but avoid hardcoded values, we use parameterized constructor to initialize them.
private class SmartDevice (val name: String, val category: String){

    val deviceStatus = "online" //hardcoded

    var speakerVolume = 15  //default
        set(value) {
            if (value in 1..100) {
                field = value
            }
        }

    // function inside class is called method
    fun turnOn() {
        println("SmartDevice is turned on")
        //we can call any method from here as usual as calling turnOff method from turnOn method
        // turnOff()
    }

    fun turnOff() {
        println("SmartDevice is turned off")
    }
}

fun main() {
    println("----------------Main-------------------")
    val smartTvDevice = SmartDevice("AndroidTv", category = "Entertainment")
    println("Device name is ${smartTvDevice.name}")
    smartTvDevice.turnOn()
}