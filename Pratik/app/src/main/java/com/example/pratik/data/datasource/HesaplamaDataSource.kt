package com.example.pratik.data.datasource

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class HesaplamaDataSource {
    suspend fun calculate(sayi1:Int,sayi2:Int,islem:String):String=
        withContext(Dispatchers.IO){
            var sonuc="0"
            when(islem){
                "+" -> sonuc= (sayi1+sayi2).toString()
                "-" -> sonuc= (sayi1-sayi2).toString()
                "*" -> sonuc= (sayi1*sayi2).toString()
                "/" -> sonuc= (sayi1/sayi2).toString()
            }
            return@withContext sonuc //sonuç, anaekranda değer olarak gösterilecek. yani return işlemi olup livedata kullanılacak.
        }

}