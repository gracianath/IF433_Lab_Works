package oop_116931_GraciaNathania.week04

import oop_001_johnthor.week04.Car

class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int ) : Car(brand, numberOfDoors) {

    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }

}