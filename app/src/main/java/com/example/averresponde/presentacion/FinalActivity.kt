package com.example.averresponde.presentacion

import android.app.Activity
import android.content.Intent
import android.content.pm.ActivityInfo
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.averresponde.R
import com.example.averresponde.databinding.ActivityControlPreguntasBinding
import com.example.averresponde.databinding.ActivityFinalBinding

class FinalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFinalBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        super.onCreate(savedInstanceState)
        //Binding
        binding = ActivityFinalBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //Obtener y mostrar el score
        //función para recivir la variable de la otra activity
        val bundle = intent.extras
        val dato = bundle?.getString("llaveScore")
        //viculacion textvier tipo de pregunta
        binding.textViewScore.text = dato



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