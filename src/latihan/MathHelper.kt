package latihan

class MathHelper (val sisi: Int, val panjang: Int, val lebar: Int, val jari: Int) {
    fun hitungLuasPersegi(sisi: Int): Int {
        return (sisi * sisi)
    }

    fun hitungLuasPP(sisi: Int, panjang: Int, lebar: Int): Int {
        return (panjang * lebar)
    }

    fun hitungLuasLingkaran(jari: Int): Double {
        return (3.14 * jari * jari)
    }
}