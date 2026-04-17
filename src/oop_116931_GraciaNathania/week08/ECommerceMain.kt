package oop_116931_GraciaNathania.week08

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not an Integer"),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )

    val parser = ApiParser()

    for (raw in rawApiData) {
        try {
            parser.parseProduct(raw)?.let { product ->
                when (product) {
                    is Electronic -> println("Product: ${product.name}, Warranty: ${product.warrantyMonths}")
                    is Clothing -> println("Product: ${product.name}, Size: ${product.size}")
                }

                parser.checkout(product)
            }
        } catch (e: IllegalArgumentException) {
            println("Error parsing data: ${e.message}")
        }
    }
}