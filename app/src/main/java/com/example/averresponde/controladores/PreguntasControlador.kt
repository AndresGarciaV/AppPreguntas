package com.example.averresponde.controladores

import com.example.averresponde.entidades.PreguntasDC
import com.example.averresponde.logica.PreguntasBL
var cont=0
var preguntasUsadas: MutableList<String> = mutableListOf()
class PreguntasControlador {
    /*Se controla lo que se va a optener */

    //Funcion para tomar una pregunta
    fun getOneQuestionMusica(): PreguntasDC? {

        /*var preObtenida = PreguntasBL().getOneQuestionMusica()
        var preMandar: PreguntasDC? = null
        var preObtenidaId = preObtenida.respuestaV
        if (cont==0){
            preguntasUsadas.add(preObtenidaId)
            cont= 1
        }
        if (cont==1){
            //preguntasUsadas = preguntasUsadas.filter { it != preObtenida } as MutableList<String>
                if(preguntasUsadas. == preObtenidaId){
                    getOneQuestionMusica()
                }else{
                    preguntasUsadas.add(preObtenidaId)
                    preMandar = preObtenida
                }
            println(preguntasUsadas)
        }*/

        return PreguntasBL().getOneQuestionMusica()
    }
    //SECCION PARA PINTURA
    fun getOneQuestionPintura(): PreguntasDC {
        return PreguntasBL().getOneQuestionPintura()
    }



}