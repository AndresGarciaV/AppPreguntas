package com.example.averresponde.presentacion

import android.app.Activity
import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.averresponde.R
import com.example.averresponde.databinding.ActivityControlPreguntasBinding


class ControlPreguntasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityControlPreguntasBinding
    private var numeracionn: TextView?=null
    var numPreguntas =10 //No superar al número de preguntas gayrdadas en PreguntasDC
    var contPre = 0
    //Definición de variables para el score
    companion object {
        var score: Int = 0
        var tipoPregunta = ""
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        super.onCreate(savedInstanceState)
        //Binding
        binding = ActivityControlPreguntasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Vinculacion textview numeracion
        numeracionn=findViewById((R.id.numeracion))

        obtenerVariableTipoPregunta()//obtener variable tipo de pregunta

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
            //println("imprimir la variable Score:::::::::::::::::::::"+ score.toString())
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
    private fun cambiarActivity(activity: Activity){
        var intent= Intent(this, activity::class.java)
        intent.putExtra("llaveScore",score.toString())//para mandar la variable a la poxima activity
        startActivity(intent)
    }

    //función para recivir la variable de la otra activity
    private fun obtenerVariableTipoPregunta(){
        val bundle = intent.extras
        val dato = bundle?.getString("llaveTipo")
        //Toast.makeText(this,dato, Toast.LENGTH_LONG).show()//imprimir sobre la pantalla el texto toast
        tipoPregunta=dato.toString()
        //viculacion textvier tipo de pregunta
        binding.textviewTipoPre.text = tipoPregunta
    }

    //funcion para no permitir al boton atraz regresar a la pregunta anterior
    override fun onBackPressed() {
        cambiarActivity(MenuActivity())
        //super.onBackPressed()
    }



}

