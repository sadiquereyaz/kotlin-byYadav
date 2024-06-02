// open keyword informs the compiler that this class is extendable, so now other classes can extend it. All classes are final by default in kotlin (non-extensible)
open class SmartDevice2(val name: String, val category: String) {
    var deviceStatus = "online"
    open val deviceType: String = "unknown"
    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }
    open fun turnOn() {
        println("$deviceType is turned on.")
    }
    open fun turnOff() {
        println("$deviceType is turned off.")
    }
}
/*
* The constructor definition for SmartTvDevice doesn't specify whether the properties are mutable or immutable.
* This means that the deviceName and deviceCategory parameters are constructor parameters instead of class properties.
* You won't be able to use them in the class, but simply pass them to the superclass constructor.
* i.e.,  the properties in a class can be either mutable (defined with var) or immutable (defined with val).
* If the properties are not specified as class properties, they will only exist as parameters in the constructor and cannot be accessed throughout the class.
* */
class SmartTvDevice2( tvName: String, tvCategory: String ) : SmartDevice2( name = tvName, category = tvCategory ) {
    override val deviceType: String= "Smart TV"
    var speakerVolume = 0
        set( value ) {
            if (value in 1..100){
                field = value;
            }
        }
    var channelNumber = 2
        set(value) {
            if (value in 1..200){
                field = value;
            }
        }
    fun increaseSpeakerVolume(){
        speakerVolume++
        println("Speaker volume increased to $speakerVolume")
    }
    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }
    override fun turnOn() {
       // deviceStatus = "on"
        //To call the overridden method in the superclass from the subclass, you need to use the super keyword.
        super.turnOn()
        println(
            "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                    "set to $channelNumber."
        )
    }
    override fun turnOff() {
//        deviceStatus = "off"
        super.turnOff()
        println("$name turned off")
    }
}

class SmartLightDevice2(deviceName: String, deviceCategory: String):SmartDevice2(name = deviceName, category = deviceCategory){
    override val deviceType = "Smart Light"
    var brightnessLevel = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }
    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }
    override fun turnOn(){
//        deviceStatus = "on"
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on and brightness level $brightnessLevel.")
    }
    override fun turnOff() {
//        deviceStatus = "off"
        super.turnOff()
        brightnessLevel = 0
        println("Smart Light turned off")
    }
}
class SmartHome2(
    val smartTvDevice2: SmartTvDevice2,
    val smartLightDevice2: SmartLightDevice2
){
    fun turnOnTv(){
        smartTvDevice2.turnOn()
    }
    fun turnOffTv(){
        smartTvDevice2.turnOff()
    }
    fun increaseTvVolume() {
        smartTvDevice2.increaseSpeakerVolume()
    }
    fun changeTvChannelToNext() {
        smartTvDevice2.nextChannel()
    }

    fun turnOnLight() {
        smartLightDevice2.turnOn()
    }

    fun turnOffLight() {
        smartLightDevice2.turnOff()
    }
    fun increaseLightBrightness() {
        smartLightDevice2.increaseBrightness()
    }
    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }
}
fun main() {
    var smartDevice: SmartDevice2 = SmartTvDevice2("Android Tv", "Entertainment")
    smartDevice.turnOn()

    smartDevice = SmartLightDevice2("Google Light", "Utility")
    smartDevice.turnOn()
}
/*
* Polymorphism is a fundamental concept in object-oriented programming (OOP)
* that allows objects of different classes to be treated as objects of a common superclass.
* */