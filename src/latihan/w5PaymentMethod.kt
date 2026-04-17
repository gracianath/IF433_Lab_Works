package latihan

abstract class w5PaymentMethod (val accountName: String) {
    abstract fun processPayment(amount: Double): Double
}