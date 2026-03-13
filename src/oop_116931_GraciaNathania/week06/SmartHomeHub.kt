package oop_116931_GraciaNathania.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()
    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }
    fun turnOffAllSwitches() {
        println("Turning off all switches...")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
}