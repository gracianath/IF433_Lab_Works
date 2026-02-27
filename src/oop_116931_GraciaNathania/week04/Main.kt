package oop_116931_GraciaNathania.week04

import oop_001_johnthor.week04.Car
import oop_001_johnthor.week04.Vehicle

fun main(){
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Task 1 ---")
    val myElectricCar = ElectricCar(brand = "BMW", numberOfDoors = 4, 90)
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()
}