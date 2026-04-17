package oop_116931_GraciaNathania.week08

sealed class Product

data class Electronical(val id: String, val name: String, val warrantyMonths: Int) : Product()

data class Clothing(val id: String, val name: String, val size: String) : Product()