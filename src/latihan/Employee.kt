package latihan

open class Employee(val name: String, val baseSalary: Int) {
    open fun work(){
        println("$name is working")
    }

    open fun calculateBonus() : Int{
        return (baseSalary * 0.1).toInt()
    }
}