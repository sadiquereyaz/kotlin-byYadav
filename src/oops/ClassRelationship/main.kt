package oops.ClassRelationship

fun main() {
    var smartDevice: SmartDevice = SmartTvDevice("Android Tv", "Entertainment Device")
    smartDevice.turnOn()

    smartDevice = SmartLightDevice("Google Light", "Utility")
    smartDevice.turnOn()    //note: if function is not defined in sub class but in super clas, then that of super class function will be executed
}