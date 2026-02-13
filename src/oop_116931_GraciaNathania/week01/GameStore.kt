package oop_116931_GraciaNathania.week01

fun main() {
    val gameTitle: String = "MOBILE LEGEND"
    val price: Int = 100000
    val userName: String? = null
    val finalPrice = calculateDiscount(price)

    printReceipt(title = gameTitle, price, finalPrice = finalPrice, userName = userName)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.8).toInt() else (price * 0.9).toInt()

fun printReceipt(title: String, price: Int, finalPrice: Int, userName: String?) {
    println("Nama Game: $title")
    println("Harga Awal: $price")
    println("Nama Pengguna: ${userName ?: "Tidak ada catatan"}")
    println("Total Harga Akhir: $finalPrice")
}