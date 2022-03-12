package com.example.averresponde.presentacion

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.averresponde.controladores.PreguntasControlador
import com.example.averresponde.databinding.FragmentPreguntasBinding
import java.util.*


class FragmentPreguntas: Fragment() {

    private lateinit var binding: FragmentPreguntasBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //bindig para frangment
        binding= FragmentPreguntasBinding.inflate(inflater, container, false)


        /*binding.radioButton.setOnClickListener(){
            //binding.textPregunta.text = "Siguiente pregunta"
            binding.textPregunta.text = "Como pongo la pregunta que esta almacenada como un estring," +
                    " no tengo idea de que hacer para implemntar eso con binding ."
        }*/



        val nueva = PreguntasControlador().getOneNews() //variable para agregar los atributos de una pregunta

        val r1=nueva.respuestaV
        val r2=nueva.respuestaF1
        val r3=nueva.respuestaF2
        val r4=nueva.respuestaF3
        val resArray = arrayOf(r1,r2,r3,r4)
        val resArrayP = arrayOf("A","B","C","D")
        val resAleatorias = resArrayP.sorted()
        val d=(resArray.size)-1
        for(i in 0..d){
            println(resArrayP[i])
        }

        println("arrglo aleatorio")
        for(i in 0..d){
            println(resAleatorias[i])
        }


        binding.textPregunta.text = nueva.pregunta
        binding.radioButton.text = nueva.respuestaV
        binding.radioButton2.text = nueva.respuestaF1
        binding.radioButton3.text = nueva.respuestaF2
        binding.radioButton4.text = nueva.respuestaF3
        val respuestaVerdadera = nueva.respuestaV

        binding.radioButton4.isEnabled=false //para bloquear los botones

        //Asisganr accion al al radioButton1 hacer esto con cada radioboton
        binding.radioButton3.setOnClickListener(){
            val compRes=binding.radioButton3.text
            if (compRes==respuestaVerdadera){
                binding.textPregunta.text = "Correcto"
            }else{
                binding.textPregunta.text = ("INCORRECTO es "+respuestaVerdadera)
            }

        }

        return  binding.root


    }
}