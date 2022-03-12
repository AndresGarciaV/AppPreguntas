package com.example.averresponde.presentacion

import android.R
import android.os.Binder
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.averresponde.controladores.PreguntasControlador
import com.example.averresponde.databinding.FragmentPreguntasBinding


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

        binding.textPregunta.text = nueva.pregunta
        binding.radioButton.text = nueva.respuestaV
        binding.radioButton2.text = nueva.respuestaF1
        binding.radioButton3.text = nueva.respuestaF2
        binding.radioButton4.text = nueva.respuestaF3



        //Asisganr accion al a los botones
        binding.radioButton.setOnClickListener(){
            //val nueva = PreguntasControlador().getOneNews()
            binding.textPregunta.text = "Correcto"

        }

        return  binding.root


    }
}