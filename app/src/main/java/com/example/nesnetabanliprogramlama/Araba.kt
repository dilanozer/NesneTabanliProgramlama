package com.example.nesnetabanliprogramlama

class Araba(var renk:String, var hiz:Int, var calisiyorMu:Boolean) {

    lateinit var otobus: Otobus // deger aktarmadan da deger tanimlama

    fun calistir() {
        calisiyorMu = true
    }

    fun durdur() {
        calisiyorMu = false
        hiz = 0
    }

    fun hizlan(kacKm:Int) {
        hiz += kacKm
    }

    fun yavasla(kacKm: Int) {
        hiz -= kacKm
    }

    fun bilgiAl() {
        println("Renk: $renk")
        println("Hız: $hiz")
        println("Çalışıyor mu?: $calisiyorMu")
    }

}