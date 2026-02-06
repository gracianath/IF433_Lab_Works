package oop_116931_GraciaNathania.week01

fun main() {
    val gameTitle: String = "MOBILE LEGEND"
    val price: Int = 100000
}

fun calculateDiscount(price: Double): Double = if (price > 500000) price * 0.8 else price * 0.9