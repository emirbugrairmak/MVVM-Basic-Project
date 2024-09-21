package com.example.pratik.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.pratik.R
import com.example.pratik.databinding.FragmentAnasayfaBinding
import com.example.pratik.ui.viewmodel.AnasayfaViewModel

class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding
    private lateinit var viewModel: AnasayfaViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_anasayfa, container, false)
        binding.anasayfaFragmentNesnesi=this


        viewModel.sonuc.observe(viewLifecycleOwner){
            binding.sonuc=it
        }

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel:AnasayfaViewModel by viewModels()
        viewModel=tempViewModel
    }

    fun calculate(){
        viewModel.calculate(sayi1 = binding.ilksayi!!.toInt(), sayi2 = binding.ikincisayi!!.toInt(), islem = binding.islemgir!!)
        /* Burada en yukarda parametre vermek yerine aşağıdaki fonksiyonda (viewmodel nesnesi ile gelen) varsayılan değerler atadım.
        Çünkü "binding.ilksayi!!!" vb. binding islemleri var.
         */
    }
}