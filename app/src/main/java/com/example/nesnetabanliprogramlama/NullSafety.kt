package com.example.nesnetabanliprogramlama

fun main() {

    var str1:String? = null // str1 null olabilir
    // str1?.trim() // sorun varsa çalıştırmaz

    // str1!!.trim() // her şekilde çalıştır -> hata verdi

    if (str1 != null) {
        str1.trim()
    }

}