package com.example.averresponde.presentacion

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.averresponde.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Data classes
        //dataClasses()


        //asisgnar accion al boton ingresar
        /**/
        var btnJugar = findViewById<Button>(R.id.btnJugar)
        btnJugar.setOnClickListener {
            //para cambiar a la otra activity
            var intent= Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }


    }

    /*private fun dataClasses(){
        val andres = Trabajador(nombre="Andres Garcia",edad=25, trabajo="Estudiante")
        val brayan = Trabajador(nombre="Andres Garcia",edad=25, trabajo="Estudiante")
        andres.ultimoTrabajo="Pintor"
        val sara = Trabajador()

        //equals & hashCode
        if (andres==brayan){
            println("Son iguales")
        }else{
            println("No son iguales")
        }
        //to String
        println(brayan.toString())
        //copy
        val brayan2 = brayan.copy(edad = 30)
        println(brayan.toString())
        println(brayan2.toString())
    //componentN
        val (nombre, edad)=andres
        println(nombre)
        println(edad)

    }*/
}