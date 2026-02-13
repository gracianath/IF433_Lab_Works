package oop_116931_GraciaNathania.week02

import java.util.Scanner

class Loan(val bookTitle: String, val borrower: String, var loanDuration: Int = 1){
    fun calculateFine(): Int {
        return if (loanDuration > 3){
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}

fun main(){
    val scanner = Scanner(System.`in`)

    println("--- LIBRARY SYSTEM ---")

    print("Masukkan Judul: ")
    val judul = scanner.nextLine()

    print("Masukkan Peminjam: ")
    val peminjam = scanner.nextLine()

    print("Masukkan Lama Pinjam: ")
    var lamaPinjam = scanner.nextInt()

    scanner.nextLine() //bersihkan buffer

    if(lamaPinjam < 0){
        lamaPinjam = 1
    }

    val loan1 = Loan(judul, peminjam, lamaPinjam)

    println("--- DETAIL PEMINJAMAN ---")
    println("Judul Buku: ${loan1.bookTitle}")
    println("Nama Peminjam: ${loan1.borrower}")
    println("Lama Pinjam: ${loan1.loanDuration}")
    println("Total Denda: ${loan1.calculateFine()}")

}