package org.example.dev.akramov.sel.task1

fun main() {
    var hamyon = 1_000_000 // Katta sonlarni ajratib yozish o'qishni oson qiladi
    val mahsulotNarxi = 450_000

    val isEnough: Boolean = hamyon >= mahsulotNarxi

    if (isEnough) {
        hamyon -= mahsulotNarxi
        println("Muvaffaqiyatli. Hamyonda $hamyon so'm pul qoldi")
    } else {
        val yetishmayotganPul = mahsulotNarxi - hamyon
        println("Ogohlantirish. Xarid uchun yana $yetishmayotganPul so'm kerak")
    }
}