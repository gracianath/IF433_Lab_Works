package oop_116931_GraciaNathania.week06

fun processCheckout(method: PaymentMethod, amount: Double){
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main(){
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1,50000.0)
    processCheckout(pay2,150000.0)

    println("\n=== TUGAS ===")
    val lampuTamu = SmartLamp("LO1", "Ruang Tamu")
    val nestDapur = SmartSpeaker("S01", "Google Nest Dapur")
    val CCTVGarasi = SmartCCTV("C01", "Ezviz Garasi")

}