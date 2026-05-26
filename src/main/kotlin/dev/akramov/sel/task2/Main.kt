package org.example.dev.akramov.sel.task2

fun main() {
    var hamyon = 2_000_000 // Katta sonlarni ajratib yozish o'qishni oson qiladi
    while (true) {
        print("Iltimos mahsulot narxini kiriting: ")
        when (val mahsulotNarxi = readln().toInt()) {
            0 -> {
                println("Tizimdan chiqildi. Xizmatingiz uchun rahmat!")
                break
            }

            else -> {
                val isEnough: Boolean = hamyon >= mahsulotNarxi
                if (isEnough) {
                    hamyon -= mahsulotNarxi
                    println("Muvaffaqiyatli. Hamyonda $hamyon so'm pul qoldi")
                } else {
                    val yetishmayotganPul = mahsulotNarxi - hamyon
                    println("Ogohlantirish. Xarid uchun yana $yetishmayotganPul so'm kerak")
                }
            }
        }
    }
}