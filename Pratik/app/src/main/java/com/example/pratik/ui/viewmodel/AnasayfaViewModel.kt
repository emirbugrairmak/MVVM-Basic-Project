package com.example.pratik.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pratik.data.repo.HesaplamaRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AnasayfaViewModel:ViewModel() {
    var sonuc=MutableLiveData("0")
    var hrepo=HesaplamaRepository()

    fun calculate(sayi1:Int,sayi2:Int,islem:String){   //return işlemi viewmodel'da "livedata" sayesinde yapılır.
        CoroutineScope(Dispatchers.Main).launch {
            sonuc.value=hrepo.calculate(sayi1, sayi2, islem)
        }
    }
}