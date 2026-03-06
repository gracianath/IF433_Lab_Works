package oop_116931_GraciaNathania.week05

fun main(){
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()
        //pegawai.mengajar()

        when(pegawai){
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }

            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-----------------------------")
    }

    println("=== TUGAS 1 ===")
    val hitungPersegi = MathHelper()
    println("Luas Persegi = ${hitungPersegi.hitungLuasPersegi(3)}")

    val hitungPersegiPanjang = MathHelper()
    println("Luas Persegi Panjang = ${hitungPersegiPanjang.hitungLuasPersegiPanjang(4,2)}")

    val hitungLingkaran = MathHelper()
    println("Luas Lingkaran = ${hitungLingkaran.hitungLuasLingkaran(5.2)}")

    println("=== TUGAS 2 ===")
    val eWallet1 = EWallet("Budi", 50000.0)
    val card1 = CreditCard(100000.0, 1000000.0, "Budi")

    val payments: List<PaymentMethod> = listOf(eWallet1, card1)

    for (payment in payments) {
        println("--- Memproses pembayaran untuk: ${payment.accountName} ---")
        payment.processPayment(75000.0)
    }
}