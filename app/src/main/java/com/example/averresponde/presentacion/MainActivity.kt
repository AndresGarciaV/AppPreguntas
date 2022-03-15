package com.example.averresponde.presentacion

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.averresponde.R
import com.example.averresponde.databinding.ActivityFinalBinding
import com.example.averresponde.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //Accion boton ingresar
        binding.btnJugar.setOnClickListener(){
            var intent= Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
        //Accion boton salir
        binding.btnExit.setOnClickListener(){
            finishAffinity()  //Finaliza la actividad pero se guarda en el segundo plano
            //finishAndRemoveTask() //Finaliza totalmente
        }


    }
}