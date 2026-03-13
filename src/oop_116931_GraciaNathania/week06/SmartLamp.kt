package oop_116931_GraciaNathania.week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable{
    override fun turnOn() {
        println("Lampu '$name': On")
    }
    override fun turnOff() {
        println("Lampu '$name': Off")
    }
}