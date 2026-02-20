package oop_116931_GraciaNathania.week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if(value < 0){
                println("ERROR! Damage tidak boleh negatif!")
                field = value
            } else if(value > 1000){
                field = 1000
            } else{
                field = value
            }
    }

    val tier: String
        get() = if (damage > 800) "Legendary" else if (damage > 500) "Epic" else "Common"

}