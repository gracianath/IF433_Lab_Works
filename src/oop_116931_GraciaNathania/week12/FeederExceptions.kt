package oop_116931_GraciaNathania.week12

sealed class FeederExceptions(msg: String) : Exception(msg)

class FoodEmptyException(requested: Int, available: Int) : FeederExceptions("Kibble tidak cukup! Diminta $requested gr, sisa $available gr")

class DispenserJamException : FeederExceptions("Wadah dispenser tersangkit/macet!")