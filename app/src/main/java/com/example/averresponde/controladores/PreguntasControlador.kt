package com.example.averresponde.controladores

import com.example.averresponde.entidades.PreguntasDC
import com.example.averresponde.logica.PreguntasBL

class PreguntasControlador {

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