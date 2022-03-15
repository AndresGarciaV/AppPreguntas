package com.example.averresponde.presentacion

import android.app.Activity
import android.content.Intent
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
    var cont = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Binding
        binding = ActivityControlPreguntasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Vinculacion textview numeracion
        numeracionn=findViewById((R.id.numeracion))


        //Acción para el boton continuar
        binding.btnContinuar.setOnClickListener(){
            cont=cont+1
            numeracionn?.text= (cont).toString()

            if (cont<=numPreguntas) {
                mostrarFragment(FragmentPreguntas())

            }
            if (cont>numPreguntas) {
                cambiarActivity(FinalActivity())
                ControlPreguntasActivity().onBackPressed()//Termina la Actividad

            }

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




}

