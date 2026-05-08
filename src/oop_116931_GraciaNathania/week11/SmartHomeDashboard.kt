package oop_116931_GraciaNathania.week11

fun main(){
    val homeDevices = mutableListOf<SmartDevice>()
    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("[LOG] Kamera terhubung")
        homeDevices.add(it)
    }

    val acInverter = run {
        val device = SmartDevice("Daikin Inverter (kabel 3x2.5", "HVAC", false, 800)
        device
    }
    homeDevices.add(acInverter)

    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))

    val searchResult = homeDevices.find { it.category == "Camera"}
    searchResult?.let {
        println("Hasil Pencarian Kamera:")
        println(it.diagnose())
    }

    with(homeDevices) {
        println("\nTotal Perangkat Terdaftar: ${this.size}")
    }

    val totalPower = homeDevices.run {
        sumOf { it.powerLoad }
    }
    println("Total Konsumsi Daya: $totalPower Watt")
}