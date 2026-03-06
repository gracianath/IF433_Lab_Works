package oop_116931_GraciaNathania.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (amount <= balance){
            balance -= amount
            println("PEMBAYARAN SEBESAR $amount SUKSES! SISA SALDO = $balance")
        }
        else{
            println("SALDO TIDAK CUKUP! SISA SALDO = $balance")
        }
    }

    fun topUp(amount: Double){
        balance += amount
        println("TOP UP BERHASIL! SISA SALDO = $balance")
    }
}