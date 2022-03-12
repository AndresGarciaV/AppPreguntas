package com.example.averresponde.controladores

import com.example.averresponde.entidades.PreguntasDC
import com.example.averresponde.logica.PreguntasBL

class PreguntasControlador {
    /*Se controla lo que se va a optener */

    //Funcion para tomar una pregunta
    fun getOneNews(): PreguntasDC {
        return PreguntasBL().getOneNews()
    }
    //SECCION PARA PINTURA
    fun getOneNewsPintura(): PreguntasDC {
        return PreguntasBL().getOneNewsPintura()
    }
}