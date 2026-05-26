package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var hamyon = 1000000 // Foydalanuvchi balansi (so'mda)
    val mahsulotNarxi = 450000 // Sotib olinayotgan mahsulot narxi

    // 1. Agar pul yetarli bo'lsa: hamyondan pulni ayiring va muvaffaqiyatli xabarni chiqaring.
    // 2. Agar pul yetarli bo'lmasa: ogohlantirish xabarini va qancha pul yetishmayotganini chiqaring.
    val isEnough: Boolean = hamyon >= mahsulotNarxi
    if (isEnough) {
        hamyon -= mahsulotNarxi
        println("Muvaffaqiyatli. Hamyonda $hamyon so\'m pul qoldi")
    } else {
        val mustBe = hamyon - mahsulotNarxi
        println("Ogohlantirish. Hamypnda : $mustBe so\'m bo\'lishi kerak")
    }
}