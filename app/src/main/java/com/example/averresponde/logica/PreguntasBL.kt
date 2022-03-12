package com.example.averresponde.logica

import com.example.averresponde.casosdeUso.CasosUsoPreguntas
import com.example.averresponde.entidades.PreguntasDC

class PreguntasBL {
    //funcion para obtener una nueva listas
    fun getNewsList(): List<PreguntasDC> {
        return CasosUsoPreguntas().getAllNews() //debuelve todas las preguntas
    }

    //funcion para obtener una pregunta
    fun getOneNews(): PreguntasDC {
        val r = (0..3).random() //elige un randomico entre 0 y 3
        return CasosUsoPreguntas().getAllNews()[r]//devuelve una pregunta
    }

//SECCION PARA PINTURA
    //funcion para obtener una nueva listas
    fun getNewsListPintura(): List<PreguntasDC> {
        return CasosUsoPreguntas().getAllNewsPrintura() //debuelve todas las preguntas
    }
    //funcion para obtener una pregunta
    fun getOneNewsPintura(): PreguntasDC {
        val r = (0..3).random() //elige un randomico entre 0 y 3
        return CasosUsoPreguntas().getAllNewsPrintura()[r]//devuelve una pregunta
    }

    /*fun preguntas():HashMap? {
        return null
    }*/
}