package latihan

class Developer (name: String, baseSalary: Int, val programmingLanguage: String) : Employee(name, baseSalary) {
    override fun work() {
        println("$name sedang mengoding menggunakan $programmingLanguage")
        super.calculateBonus()
    }



}