package com.example.averresponde.presentacion

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.averresponde.databinding.ActivityMenuBinding
import android.view.View

import android.R.id
import android.app.Activity
import android.content.pm.ActivityInfo

class MenuActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMenuBinding
    var tipo = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //asisgnar accion al boton pintura con binding
        /**/
        binding.btnMusica.setOnClickListener(){
            tipo= "MÚSICA"
            cambiarActivityconDato(ControlPreguntasActivity(),tipo)
        }
        // asisgnar accion al boton Musica con binding
        binding.btnPintura.setOnClickListener(){
            tipo= "PINTURA"
            cambiarActivityconDato(ControlPreguntasActivity(),tipo)
        }
        // asisgnar accion al boton Juegos con binding
        binding.btnJuegos.setOnClickListener(){
            tipo= "VIDEO JUEGOS"
            cambiarActivityconDato(ControlPreguntasActivity(),tipo)
        }
        // asisgnar accion al boton Paranormal con binding
        binding.btnParanormal.setOnClickListener(){
            tipo= "PARANORMAL"
            cambiarActivityconDato(ControlPreguntasActivity(),tipo)
        }

        // asisgnar accion al boton Cerrar con binding
        binding.buttonCerrar.setOnClickListener(){
            //para cerrar la actividad y regresar a la anterior
            val cerrar = findViewById<View>(id.closeButton) as Button
            cerrar.setOnClickListener { finish() }
        }



    }

    //Función para pasar a la suiguiente activity y mandar un dato
    //no poner dentro de un else se daña
    public fun cambiarActivityconDato(activity: Activity, tipo: String){
        var intent= Intent(this, activity::class.java)
        intent.putExtra("llaveTipo",tipo)//para mandar la variable a la poxima activity
        startActivity(intent)
    }

    public fun cambiarActivity(activity: Activity){
        var intent= Intent(this, activity::class.java)
        startActivity(intent)
    }

    //función para no permitir al boton atraz regresar a la activity anterior
    override fun onBackPressed() {
        cambiarActivity(MainActivity())
        //super.onBackPressed()
    }

}