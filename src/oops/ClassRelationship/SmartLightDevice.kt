package oops.ClassRelationship

class SmartLightDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {
    override val deviceType = "Smart Light"
    var brightnessLevel = 0
        set(value) {
            if (value in 0..100)
                field = value
        }

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }

    override fun turnOn() {
        deviceStatus = "on"
        brightnessLevel = 80
        println("$name turned on and it is at $brightnessLevel brightness level.")
    }

    override fun turnOff() {
        deviceStatus = "off"
        brightnessLevel = 0
        println("$name turned off and it is at $brightnessLevel brightness level")
    }
}