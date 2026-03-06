package oop_116931_GraciaNathania.week05

abstract class PaymentMethod(val accountName: String) {
    open fun processPayment(amount: Double){}
}