package oop_116931_GraciaNathania.week06

class SmartSpeaker(override val id: String, override val name: String): SmartDevice, Switchable{
    override fun turnOn() {
        println("Smart Speaker '$id' is on")
    }

    override fun turnOff() {
        println("Smart Speaker '$id' is off")
    }

    fun playMusic(song: String){
        println("Memutar lagu $song dari Spotify.")
    }
}