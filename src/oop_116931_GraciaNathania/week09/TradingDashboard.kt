package oop_116931_GraciaNathania.week09

fun main(){
    val tradeHistory = listOf(
        TradeLog(pair = "BTCUSDT", position = "LONG",  leverage = 20, roe = 15.5, status = "CLOSED"),
        TradeLog(pair = "ETHUSDT", position = "SHORT", leverage = 10, roe = -5.2, status = "CLOSED"),
        TradeLog(pair = "BTCUSDT", position = "SHORT", leverage = 15, roe = 8.3,  status = "CLOSED"),
        TradeLog(pair = "ETHUSDT", position = "LONG",  leverage = 5,  roe = 0.0,  status = "CLOSED"),
        TradeLog(pair = "XRPUSDT", position = "LONG",  leverage = 25, roe = 12.1, status = "OPEN"),
        TradeLog(pair = "SOLUSDT", position = "SHORT", leverage = 12, roe = -2.7, status = "OPEN"),
        TradeLog(pair = "BNBUSDT", position = "LONG",  leverage = 8,  roe = 3.4,  status = "CLOSED"),
        TradeLog(pair = "BTCUSDT", position = "LONG",  leverage = 30, roe = -9.8, status = "CLOSED")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED"}
}