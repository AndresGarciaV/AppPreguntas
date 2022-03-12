package com.example.averresponde.presentacion

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import com.example.averresponde.PuntuacionActivity
import com.example.averresponde.R
import com.example.averresponde.databinding.ActivityPreguntasBinding






class PreguntasActivity : AppCompatActivity() {
    private var tvCuentaAtrass: TextView?=null
    private var numeracionn: TextView?=null

    private lateinit var binding: ActivityPreguntasBinding
    var n=0
    var numPreguntas=3
    var tiempoEnSegundos= 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Binding
        binding = ActivityPreguntasBinding.inflate(layoutInflater)
        setContentView(binding.root)


        tvCuentaAtrass=findViewById(R.id.tvCuentaAtras) //Vinculacion cuanta atras text
        numeracionn=findViewById((R.id.numeracion))  //Vinculacion textview numeracion



        //Condicional para ajustar el número de preguntas
        binding.butEmpe.setOnClickListener(){
            if (n<=numPreguntas) {
                createFragment(FragmentPreguntas())
            }else  {
                //para cambiar a la otra activity
                var intent= Intent(this, PuntuacionActivity::class.java)
                startActivity(intent)
            }
        }

        binding.otroF.setOnClickListener(){
            var fragmentTrasaction = supportFragmentManager.beginTransaction()
            //que voy a remplazar y por que voy a remplazar
            fragmentTrasaction.replace(binding.FrameLayout1.id, FragmentPantallaCorrect())
            //Pintar el fregment
            fragmentTrasaction.commit()
        }






    }





    //Metodo para mostrar el fragment de preguntas, usos de apply para reducir codigo
    private  fun createFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(binding.FrameLayout1.id, fragment)
            addToBackStack(null)
        }.commit()
        n=n+1
        if(n<=numPreguntas){
            numeracionn?.text= (n).toString()
            //play() //cada vez que se llama a un fragment se llama a la cuenta regresiva
        }else{
            //para cambiar a la otra activity
            intent= Intent(this, PuntuacionActivity::class.java)
            startActivity(intent)
        }


    }

    //funcion play para cuenta regresiva
    var tiempoSegundos =tiempoEnSegundos.toLong()
    var tiempoMilisegundos=tiempoSegundos*1000
    fun play() {
        var tiempoMilisegundos=tiempoSegundos*1000
        object : CountDownTimer(tiempoMilisegundos,1000){
            override fun onFinish() {
                this.cancel()//termina
                createFragment(FragmentPreguntas())

            }
            override fun onTick(millisUntilFinished: Long) {
                val tiempoSegundos = (millisUntilFinished /1000).toInt()+1
                tvCuentaAtrass?.text= tiempoSegundos.toString()
            }
        }.start()//inicia
    }
    //




}


