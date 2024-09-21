package com.example.pratik.data.repo

import com.example.pratik.data.datasource.HesaplamaDataSource

class HesaplamaRepository {
    var hds=HesaplamaDataSource()

    suspend fun calculate(sayi1:Int,sayi2:Int,islem:String):String=hds.calculate(sayi1, sayi2, islem)
}