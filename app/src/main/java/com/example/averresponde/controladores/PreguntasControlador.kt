package com.example.averresponde.controladores

import com.example.averresponde.entidades.PreguntasDC
import com.example.averresponde.logica.PreguntasBL

class PreguntasControlador {
    /*Se controla lo que se va a optener */

    var preguntasUsadas: MutableList<String> = mutableListOf()
    var preMandar: PreguntasDC? = null
    var contiene: MutableList<String>? = null
    var cont=0

    //Funcion para tomar una pregunta
    fun getOneQuestionMusica(): PreguntasDC? {
        return PreguntasBL().getOneQuestionMusica()
    }

    fun getOneQuestionPintura(): PreguntasDC {
        return PreguntasBL().getOneQuestionPintura()
    }

    fun getOneQuestionVJ(): PreguntasDC {
        return PreguntasBL().getOneQuestionVJ()
    }

    fun getOneQuestionParanormal(): PreguntasDC {
        return PreguntasBL().getOneQuestionParanormal()
    }



}