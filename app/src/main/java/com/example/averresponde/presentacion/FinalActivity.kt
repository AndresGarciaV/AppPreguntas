package com.example.averresponde.presentacion

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.averresponde.R
import com.example.averresponde.databinding.ActivityControlPreguntasBinding
import com.example.averresponde.databinding.ActivityFinalBinding

class FinalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFinalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Binding
        binding = ActivityFinalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Boton intentar nuevamente
        binding.btnIntentar.setOnClickListener(){
            cambiarActivity(MenuActivity())
        }
        //Boton Salir
        binding.btnSalir.setOnClickListener(){
            cambiarActivity(MainActivity())
        }

    }

    //Función para pasar a la suiguiente activity
    //no poner dentro de un else se daña
    public fun cambiarActivity(activity: Activity){
        var intent= Intent(this, activity::class.java)
        startActivity(intent)
    }




}