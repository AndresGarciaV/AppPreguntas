package com.example.averresponde.presentacion

import android.app.Activity
import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import com.example.averresponde.R
import com.example.averresponde.databinding.ActivityControlPreguntasBinding


class ControlPreguntasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityControlPreguntasBinding
    private var numeracionn: TextView?=null
    var numPreguntas =5
    var contPre = 0
    //Definir la variable para el score
    companion object {
        var score: Int = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        super.onCreate(savedInstanceState)
        //Binding
        binding = ActivityControlPreguntasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Vinculacion textview numeracion
        numeracionn=findViewById((R.id.numeracion))


        //Acción para el boton continuar
        binding.btnContinuar.setOnClickListener(){
            contPre=contPre+1
            numeracionn?.text= (contPre).toString()

            if (contPre<=numPreguntas) {
                mostrarFragment(FragmentPreguntas())

            }
            if (contPre>numPreguntas) {
                cambiarActivity(FinalActivity())
                ControlPreguntasActivity().onBackPressed()//Termina la Actividad

            }
            println("imprimir la variable Score:::::::::::::::::::::"+ score.toString())
        }
    }


    //Función para mostrar un fragment
    private fun mostrarFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(binding.frameLayoutCP.id, fragment)
            addToBackStack(null)
        }.commit()
    }

    //Función para pasar a la suiguiente activity
    //no poner dentro de un else se daña
    public fun cambiarActivity(activity: Activity){
        var intent= Intent(this, activity::class.java)
        startActivity(intent)
    }
    //funcion para no permitir al boton atraz regresar a la pregunta anterior
    override fun onBackPressed() {
        cambiarActivity(MenuActivity())
        //super.onBackPressed()
    }



}

