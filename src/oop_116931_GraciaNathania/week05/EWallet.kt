package oop_116931_GraciaNathania.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (amount <= balance){
            balance -= amount
            println("SUKSES")
        }
        else{
            println("SALDO TIDAK CUKUP")
        }
    }

    fun topUp(amount: Double){
        balance += amount
    }
}