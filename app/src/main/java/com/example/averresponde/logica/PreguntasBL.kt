package com.example.averresponde.logica

import com.example.averresponde.casosdeUso.CasosUsoPreguntas
import com.example.averresponde.entidades.PreguntasDC

class PreguntasBL {
    //funcion para obtener una nueva listas
    fun getQuestionListMusica(): List<PreguntasDC> {
        return CasosUsoPreguntas().getAllQuestionMusica() //debuelve todas las preguntas lista de Música
    }

    //funcion para obtener una pregunta
    fun getOneQuestionMusica(): PreguntasDC {
        val r = (0..3).random() //elige un randomico entre 0 y 3
        return CasosUsoPreguntas().getAllQuestionMusica()[r]//devuelve una pregunta
    }

//SECCION PARA PINTURA
    //funcion para obtener una nueva listas
    fun getQuestionListPintura(): List<PreguntasDC> {
        return CasosUsoPreguntas().getAllQuestionPrintura() //debuelve todas las preguntas lista Pintura
    }
    //funcion para obtener una pregunta
    fun getOneQuestionPintura(): PreguntasDC {
        val r = (0..3).random() //elige un randomico entre 0 y 3
        return CasosUsoPreguntas().getAllQuestionPrintura()[r]//devuelve una pregunta
    }



}