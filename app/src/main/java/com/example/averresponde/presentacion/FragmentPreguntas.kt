package com.example.averresponde.presentacion

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.averresponde.controladores.PreguntasControlador
import com.example.averresponde.databinding.FragmentPreguntasBinding


class FragmentPreguntas: Fragment() {
    private lateinit var binding: FragmentPreguntasBinding
    val valorxPre = 10 //valor agregado para cada pregunta respuesta correctamente
    var datoFrag = ControlPreguntasActivity.tipoPregunta //dato para la categoria de preguntas
    var nueva = PreguntasControlador().getOneQuestionMusica()// variablo para asignar el objeto preguntas


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //bindig para frangment
        binding= FragmentPreguntasBinding.inflate(inflater, container, false)
        //tomar la varble de ControlPreguntasActivity para texView
        binding.textviewScore.text =(ControlPreguntasActivity.score).toString()




        ///////////////Seccion para asignar el tipo de pregunta seleccionada///////////////
        llamarTipoPregunta()
        //Ingresar las respuestas en variables
        val r1= nueva?.respuestaV
        val r2= nueva?.respuestaF1
        val r3= nueva?.respuestaF2
        val r4= nueva?.respuestaF3
        val resArray = arrayOf(r1,r2,r3,r4) //arreglo de respuestas
        resArray.shuffle()//desordenar arreglo de respuetas

        //asignar las variables a los radioButtons
        if (nueva != null) {
            binding.textPregunta.text = nueva!!.pregunta
        }
        binding.radioButton.text = resArray[0]
        binding.radioButton2.text = resArray[1]
        binding.radioButton3.text = resArray[2]
        binding.radioButton4.text = resArray[3]

        val respuestaVerdadera = nueva?.respuestaV //variable para respuesta verdadera
        //////////////////////////////////////////////////////////////////////////////////


        //Asisganr accion al radioButton1
        binding.radioButton.setOnClickListener(){
            val compRes=binding.radioButton.text.toString()
            if (respuestaVerdadera != null) {
                comprobarRespuesta(compRes, respuestaVerdadera)
            }
        }
        //Asisganr accion al radioButton2
        binding.radioButton2.setOnClickListener(){
            val compRes=binding.radioButton2.text.toString()
            if (respuestaVerdadera != null) {
                comprobarRespuesta(compRes, respuestaVerdadera)
            }
        }
        //Asisganr accion al radioButton3
        binding.radioButton3.setOnClickListener(){
            val compRes=binding.radioButton3.text.toString()
            if (respuestaVerdadera != null) {
                comprobarRespuesta(compRes, respuestaVerdadera)
            }
        }
        //Asisganr accion al radioButton4
        binding.radioButton4.setOnClickListener(){
            val compRes=binding.radioButton4.text.toString()
            if (respuestaVerdadera != null) {
                comprobarRespuesta(compRes, respuestaVerdadera)
            }
        }




        return  binding.root
    }

    private fun comprobarRespuesta(compRes : String, respuestaVerdadera : String){
        if (compRes==respuestaVerdadera){
            binding.textPregunta.text = "Correcto"
            //Actualizar el puntaje
            ControlPreguntasActivity.score = ControlPreguntasActivity.score + valorxPre
            binding.textviewScore.text = ControlPreguntasActivity.score.toString()

        }else{
            binding.textPregunta.text = ("INCORRECTO es\n"+respuestaVerdadera)
        }
        bloquearBotones()
    }

    private fun bloquearBotones(){
        //para bloquear los demas botones
        binding.radioButton.isEnabled=false
        binding.radioButton2.isEnabled=false
        binding.radioButton3.isEnabled=false
        binding.radioButton4.isEnabled=false
    }

    private fun llamarTipoPregunta(){
        if(datoFrag == "MÚSICA"){
            nueva = PreguntasControlador().getOneQuestionMusica() //variable para agregar los atributos de una pregunta
        }
        if(datoFrag == "PINTURA"){
            nueva = PreguntasControlador().getOneQuestionPintura() //variable para agregar los atributos de una pregunta
        }
        //llenar para mas categorias
    }

}