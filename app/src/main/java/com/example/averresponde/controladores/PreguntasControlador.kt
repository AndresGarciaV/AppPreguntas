package com.example.averresponde.controladores

import com.example.averresponde.entidades.PreguntasDC
import com.example.averresponde.logica.PreguntasBL

class PreguntasControlador {
    /*Se controla lo que se va a optener */

    //Funcion para tomar una pregunta
    fun getOneQuestionMusica(): PreguntasDC {
        return PreguntasBL().getOneQuestionMusica()
    }
    //SECCION PARA PINTURA
    fun getOneQuestionPintura(): PreguntasDC {
        return PreguntasBL().getOneQuestionPintura()
    }
}