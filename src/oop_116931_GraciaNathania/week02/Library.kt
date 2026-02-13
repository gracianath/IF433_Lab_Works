package oop_116931_GraciaNathania.week02

class Loan(val bookTitle: String, val borrower: String, val bookAuthor: String, val bookPrice: String, var loanDuration: Int = 1){
    fun calculateFine(): Int {
        return if (loanDuration > 3){
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}