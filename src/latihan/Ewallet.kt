package latihan

class Ewallet(accountName: String, var balance: Double) : w5PaymentMethod (accountName) {
    override fun processPayment(amount: Double): Double {
        if (amount <= balance ) {
            return balance -= amount
        }
        else {
            println("saldo ga cukup aduh")
        }
    }

    fun topUp(amount: Double): Double {
        balance += amount
        println("topUp $amount SUKSES! SALDO = $balance")
    }
}