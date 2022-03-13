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
    var puntuacion = 0
    val maxtotal= 100
    //intentar mandar el numero de preguntas desde el activity preguntas para divivir para el maxtotal
    val acum = maxtotal/10

    val fragmentManager =
    val fragmentTransaction = fragmentManager.beginTransaction()


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

        //Ingresar las respuestas en variables
        val r1=nueva.respuestaV
        val r2=nueva.respuestaF1
        val r3=nueva.respuestaF2
        val r4=nueva.respuestaF3
        val resArray = arrayOf(r1,r2,r3,r4) //arreglo de respuestas
        resArray.shuffle()//desordenar arreglo de respuetas [0,1,2,3]
        val d=(resArray.size)-1
        for(i in 0..d){
            println(resArray[i])
        }


        //asignar las variables a los radioButtons
        binding.textPregunta.text = nueva.pregunta
        binding.radioButton.text = resArray[0]
        binding.radioButton2.text = resArray[1]
        binding.radioButton3.text = resArray[2]
        binding.radioButton4.text = resArray[3]

        val respuestaVerdadera = nueva.respuestaV //variable para respuesta verdadera


        //Asisganr accion al radioButton1
        binding.radioButton.setOnClickListener(){
            val compRes=binding.radioButton.text
            if (compRes==respuestaVerdadera){
                binding.textPregunta.text = "Correcto"
                puntuacion = acum + puntuacion
                println("------------------------------------------------------------------------------------------"+puntuacion)
            }else{
                binding.textPregunta.text = ("INCORRECTO es\n" + respuestaVerdadera)
            }
            //para bloquear los demas botones
            binding.radioButton.isEnabled=false
            binding.radioButton2.isEnabled=false
            binding.radioButton3.isEnabled=false
            binding.radioButton4.isEnabled=false



            var fragmentTrasaction = supportFragmentManager.beginTransaction()
            //que voy a remplazar y por que voy a remplazar
            fragmentTrasaction.replace(binding.FrameLayout1.id, FragmentPantallaCorrect())
            //Pintar el fregment
            fragmentTrasaction.commit()

        }
        //Asisganr accion al radioButton2
        binding.radioButton2.setOnClickListener(){
            val compRes=binding.radioButton2.text
            if (compRes==respuestaVerdadera){
                binding.textPregunta.text = "Correcto"
                binding.textPregunta.text = "Correcto"
                puntuacion = acum + puntuacion
                println("------------------------------------------------------------------------------------------"+puntuacion)
            }else{
                binding.textPregunta.text = ("INCORRECTO es\n"+respuestaVerdadera)
            }
            //para bloquear los demas botones
            binding.radioButton.isEnabled=false
            binding.radioButton2.isEnabled=false
            binding.radioButton3.isEnabled=false
            binding.radioButton4.isEnabled=false
        }
        //Asisganr accion al radioButton3
        binding.radioButton3.setOnClickListener(){
            val compRes=binding.radioButton3.text
            if (compRes==respuestaVerdadera){
                binding.textPregunta.text = "Correcto"
                binding.textPregunta.text = "Correcto"
                puntuacion = acum + puntuacion
                println("------------------------------------------------------------------------------------------"+puntuacion)
            }else{
                binding.textPregunta.text = ("INCORRECTO es\n"+respuestaVerdadera)
            }
            //para bloquear los demas botones
            binding.radioButton.isEnabled=false
            binding.radioButton2.isEnabled=false
            binding.radioButton3.isEnabled=false
            binding.radioButton4.isEnabled=false
        }
        //Asisganr accion al radioButton4
        binding.radioButton4.setOnClickListener(){
            val compRes=binding.radioButton4.text
            if (compRes==respuestaVerdadera){
                binding.textPregunta.text = "Correcto"
                binding.textPregunta.text = "Correcto"
                puntuacion = acum + puntuacion
                println("------------------------------------------------------------------------------------------"+puntuacion)
            }else{
                binding.textPregunta.text = ("INCORRECTO es\n"+respuestaVerdadera)
            }
            //para bloquear los demas botones
            binding.radioButton.isEnabled=false
            binding.radioButton2.isEnabled=false
            binding.radioButton3.isEnabled=false
            binding.radioButton4.isEnabled=false
        }




        return  binding.root
    }
}