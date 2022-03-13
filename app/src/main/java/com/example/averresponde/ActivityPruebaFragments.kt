package com.example.averresponde

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.example.averresponde.databinding.ActivityPreguntasBinding
import com.example.averresponde.databinding.ActivityPruebaFragmentsBinding
import com.example.averresponde.presentacion.FragmentPantallaCorrect
import com.example.averresponde.presentacion.FragmentPreguntas

class ActivityPruebaFragments : AppCompatActivity() {

    private lateinit var binding: ActivityPruebaFragmentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Binding
        binding = ActivityPruebaFragmentsBinding.inflate(layoutInflater)
        setContentView(binding.root)



        //Seccion para ajustar el aprecimiento de los fragments
        var cambio=0
        binding.botonCambio.setOnClickListener(){
            if(cambio==0){
                showFragment(FragmentPreguntas())
                cambio=1
            }else{
                showFragment(FragmentPantallaCorrect())
                cambio=0
            }
        }


    }
        fun showFragment(fragment: Fragment) {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentLayoutP, fragment)
                addToBackStack(null)
            }.commit()
        }


}