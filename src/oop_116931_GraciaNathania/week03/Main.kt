package oop_116931_GraciaNathania.week03

fun main(){
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")

    val myWeapon = Weapon("Slayer Sword")

    println("-- Test 1: Set Damage Negatif --")
    myWeapon.damage = -50
    println("Damage saat ini: ${myWeapon.damage}")

    println("\n-- Test 2: Set Damage Overpower --")
    myWeapon.damage = 9999
    println("Damage saat ini: ${myWeapon.damage}")

    println("\n-- Test 3: Cek Tier --")
    println("Tier Senjata: ${myWeapon.tier}")


    val player = Player("Graceee")

    println("--- Testing Player Leveling ---")

    //player.xp = 500

    println("Menambah 50 XP")
    player.addXp(50)
    println("Level saat ini: ${player.level}")

    println("\nMenambah 60 XP")
    player.addXp(60)
    println("Level saat ini: ${player.level}")
}

