package oop_116931_GraciaNathania.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 1.25))
    coinRepo.add(Coin("ETH", 10.50))
    coinRepo.add(Coin("USDT", 5000.00))

    val response = ApiResponse("200 OK", coinRepo.getAll())
    println("Status Response: ${response.status}")

    response.data.forEach {
        println("Coin Name: ${it.name}")
        println("Balance: ${it.balance}")
    }

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 250000.0))
    txRepo.add(Transaction("TX002", 750000.0))
    txRepo.add(Transaction("TX003", 1000000.0))
}