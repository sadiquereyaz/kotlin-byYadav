package oops.ClassRelationship;

open class SmartDevice(val name: String, val category: String) {
    var deviceStatus = "online"
    open val deviceType = "unknown"
    open fun turnOn() {
        println("I am in SmartDevice")
        deviceStatus = "on"
    }

    open fun turnOff() {
        deviceStatus = "off"
        println("I am in SmartDevice")
    }
}
