package com.example.averresponde

import android.media.RingtoneManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.EditText
import android.widget.TextView

class PuntuacionActivity : AppCompatActivity() {
    private var txtTiempo:EditText?=null
    private var tvCuentaAtras:TextView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puntuacion)
        //Vinculacion
        txtTiempo=findViewById(R.id.ConstraintLayout)
        tvCuentaAtras=findViewById(R.id.tvCuentaAtras)

    }
    fun play(view: View){
        var tiempoSegundos =txtTiempo?.text.toString().toLong()
        var tiempoMilisegundos=tiempoSegundos*1000
        object : CountDownTimer(tiempoMilisegundos,1000){
            override fun onFinish() {
                val notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE)
                val r=RingtoneManager.getRingtone(this@PuntuacionActivity,notification)
                r.play()
                this.cancel()//termina
            }

            override fun onTick(millisUntilFinished: Long) {
                val tiempoSegundos = (millisUntilFinished /1000).toInt()
                tvCuentaAtras?.text= tiempoSegundos.toString()
            }
        }.start()//inicia
    }

}