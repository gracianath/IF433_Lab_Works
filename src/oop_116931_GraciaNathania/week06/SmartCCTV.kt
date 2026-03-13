package oop_116931_GraciaNathania.week06

class SmartCCTV (override val id: String, override val name: String) : SmartDevice, Switchable, Recordable{
    override fun turnOn() {
        println("CCTV $name is on.")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV $name is off.")
    }

    override fun startRecord() {
        println("CCTV $name starts recording...")
    }
}