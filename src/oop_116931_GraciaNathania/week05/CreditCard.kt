package oop_116931_GraciaNathania.week05

class CreditCard(val limit: Double, var usedAmount: Double = 0.0, accountName: String) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("PEMBAYARAN SUKSES SENILAI $amount BERHASIL!")
        }
        else{
            println("TRANSAKSI DITOLAK")
        }
    }
}