package latihan

class CreditCard (accountName: String, val limit : Double, var usedAmount : Double = 0.0) : w5PaymentMethod (accountName) {
    override fun processPayment(amount: Double): Double {
        if(usedAmount + amount <= limit) {
            usedAmount += amount
            println("sukses")
        }
        else{
            println("ditolak")
        }
    }
}