package latihan

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {
    override fun work() {
        println("$name sedang memimpin rapat")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}