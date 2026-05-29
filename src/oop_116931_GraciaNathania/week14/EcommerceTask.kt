package oop_116931_GraciaNathania.week14
import java.io.File

class BadOrderProcessor {
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        file.appendText("$itemName,$finalPrice,$customerType\n")

        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

interface OrderRepository {
    fun saveOrder(
        itemName: String,
        finalPrice: Double
    )
}

class CsvOrderRepository(
    private val filePath: String
) : OrderRepository {

    override fun saveOrder(
        itemName: String,
        finalPrice: Double
    ) {

        File(filePath).bufferedWriter().use { writer ->
            writer.append("$itemName,$finalPrice\n")
        }
    }
}

interface NotificationService {
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {

    override fun sendNotification(message: String) {
        println("Email terkirim: $message")
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {

    fun processOrder(
        itemName: String,
        basePrice: Double,
        pricingStrategy: PricingStrategy
    ) {

        val finalPrice = pricingStrategy.calculate(basePrice)

        println("Memproses pesanan $itemName seharga $finalPrice")

        repo.saveOrder(itemName, finalPrice)

        notifier.sendNotification(
            "Pesanan $itemName Anda telah dikonfirmasi!"
        )
    }
}

interface PricingStrategy {
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double {
        return price
    }
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double {
        return price * 0.90
    }
}

class MemberPricing : PricingStrategy {
    override fun calculate(price: Double): Double {
        return price * 0.95
    }
}

fun main() {
    val repository = CsvOrderRepository("orders.csv")
    val notifier = EmailNotifier()

    val processor = SafeOrderProcessor(
        repository,
        notifier
    )

    println("=== REGULAR CUSTOMER ===")
    processor.processOrder(
        itemName = "Laptop",
        basePrice = 8000000.0,
        pricingStrategy = RegularPricing()
    )

    println()

    println("=== VIP CUSTOMER ===")
    processor.processOrder(
        itemName = "Smartphone",
        basePrice = 5000000.0,
        pricingStrategy = VipPricing()
    )

    println()

    println("=== MEMBER CUSTOMER ===")
    processor.processOrder(
        itemName = "Keyboard Mechanical",
        basePrice = 1500000.0,
        pricingStrategy = MemberPricing()
    )
}
