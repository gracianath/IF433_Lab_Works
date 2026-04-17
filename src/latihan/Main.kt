package latihan

import oop_116931_GraciaNathania.week05.EWallet

fun main() {
    println("WEEK 3")
    val mycar = ElectricCar("WULING", 4, 100)
    mycar.accelerate()
    mycar.honk()
    mycar.openTrunk()

    println("WEEK 4")
    val manager1 = Manager("Budi", 20000000)
    val developer1 = Developer("Andi", 10000000, "kotlin")

    manager1.work()
    println("bonus: {${manager1.calculateBonus()}}")

    developer1.work()
    println("bonus: {${developer1.calculateBonus()}}")

    println("WEEK 5")
    val m = MathHelper(4, 2, 2, 2)
    println("{${m.hitungLuasPersegi(4)}}")
    println("{${m.hitungLuasLingkaran(2)}}")

    val ewallet1 = EWallet("Grace", 100000000.0)
    val cc1 = CreditCard()
}