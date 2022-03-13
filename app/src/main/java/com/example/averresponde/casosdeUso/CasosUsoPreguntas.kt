package com.example.averresponde.casosdeUso

import com.example.averresponde.entidades.PreguntasDC

internal class CasosUsoPreguntas {
    //Seeccion casos de uso Preguntas Musica
    private val listPreguntasMusica = listOf<PreguntasDC>(
        PreguntasDC(
            "1. ¿En qué país nació Antonio Vivaldi? ",
            "*Italia",
            "Francia",
            "Colombia",
            "Estados Unidos",
            1
        ),
        PreguntasDC(
            "2. ¿Qué rockero es recordado por haber “incendiado” su guitarra?",
            "*Jimi Hendrix",
            "Nikki Sixx",
            "Georges Biard",
            "Ozzy",
            1
        ),
        PreguntasDC(
            "3. ¿Qué artista es comúnmente conocido como “El Padre del Soul”?",
            "*Ray Charles",
            "Alice Cooper",
            "Ringo Starr",
            "Marilyn Manson",
            1
        ),
        PreguntasDC(
            "4. ¿Qué cantante es considerado “El Rey del Rock and Roll”?",
            "*Elvis Presley.",
            "Ray Charles",
            "Sam Cooke",
            "Bob Dylan",
            1
        )
    )

    // funcion para tomar toda la lista de preguntas de Musica
    fun getAllNews(): List<PreguntasDC> {
        return listPreguntasMusica
    }

    // seccion casos de uso preguntas Pintura
    private val listPreguntasPintura = listOf<PreguntasDC>(
        PreguntasDC(
            "1P. ¿En qué país nació Antonio Vivaldi? ",
            "*Italia",
            "Francia",
            "Colombia",
            "Estados Unidos",
            1
        ),
        PreguntasDC(
            "2P. ¿Qué rockero es recordado por haber “incendiado” su guitarra?",
            "*Jimi Hendrix",
            "Nikki Sixx",
            "Georges Biard",
            "Ozzy",
            1
        ),
        PreguntasDC(
            "3P. ¿Qué artista es comúnmente conocido como “El Padre del Soul”?",
            "*Ray Charles",
            "Alice Cooper",
            "Ringo Starr",
            "Marilyn Manson",
            1
        ),
        PreguntasDC(
            "4P. ¿Qué cantante es considerado “El Rey del Rock and Roll”?",
            "*Elvis Presley.",
            "Ray Charles",
            "Sam Cooke",
            "Bob Dylan",
            1
        )
    )

    // funcion para tomar toda la lista de preguntas de Musica
    fun getAllNewsPrintura(): List<PreguntasDC> {
        return listPreguntasPintura
    }

}