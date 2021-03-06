package com.example.averresponde.logica

import com.example.averresponde.casosdeUso.CasosUsoPreguntas
import com.example.averresponde.entidades.PreguntasDC

class PreguntasBL {

    //Objetos complementarios
    companion object {
        var numRanUsados: MutableList<Int> = mutableListOf()
        var r = 0
    }


    //SECCION PARA MÚSICA
    //función para obtener una nueva listas
    fun getQuestionListMusica(): List<PreguntasDC> {
        return CasosUsoPreguntas().getAllQuestionMusica() //debuelve todas las preguntas lista de Música
    }
    //función para obtener una pregunta
    fun getOneQuestionMusica(): PreguntasDC {
        randomNumero()
        return CasosUsoPreguntas().getAllQuestionMusica()[r]//devuelve una pregunta
    }


    //SECCION PARA PINTURA
    fun getQuestionListPintura(): List<PreguntasDC> {
        return CasosUsoPreguntas().getAllQuestionPrintura()
    }
    fun getOneQuestionPintura(): PreguntasDC {
        randomNumero()
        return CasosUsoPreguntas().getAllQuestionPrintura()[r]
    }

    //SECCION PARA VIDEOJUEGOS
    fun getQuestionListVJ(): List<PreguntasDC> {
        return CasosUsoPreguntas().getAllQuestionVJ()
    }
    fun getOneQuestionVJ(): PreguntasDC {
        randomNumero()
        return CasosUsoPreguntas().getAllQuestionVJ()[r]//devuelve una pregunta
    }

    //SECCION PARA PARANORMAL
    fun getQuestionListParanormal(): List<PreguntasDC> {
        return CasosUsoPreguntas().getAllQuestionParanormal()
    }
    fun getOneQuestionParanormal(): PreguntasDC {
        randomNumero()
        return CasosUsoPreguntas().getAllQuestionParanormal()[r]//devuelve una pregunta
    }



    //funcion para no repetir las preguntas, se toma en cuenta un lista mutable
    //asigana a la variable r números no repetidos
    private fun randomNumero(){
        println("******************** Función randomNumero ***********************")
        r = (0..19).random() //elige un randomico entre 0 y 3, su superar a número de preguntas
        var contiene: List<Int>? = null
        ////
        if (numRanUsados.isEmpty()){
            println("lista ::::::::: "+ numRanUsados)
            println("lista vacia :::::::::: r: "+r+ " agregamos a la lista")
            numRanUsados.add(r)
            println("lista ::::::::: "+ numRanUsados)
        }else{
            contiene = numRanUsados.filter { it == r }
            println("lista no vacia :::::::::: lista:"+ numRanUsados)
            println("el nuevo r es :::::::::: "+ r)
            if(contiene.isEmpty()){
                println("el contenedor esta vacio, porque r ::::::::: "+ r+"  no se repite, lo agregamos")
                numRanUsados.add(r)
                println("lista ::::::::: "+ numRanUsados)
            }else{
                println("r ::::::::: "+ r +" se repitio por lo que llamamos denuevo a la función")
                randomNumero() //Recursividad
            }
        }
    }


}