package com.example.averresponde.casosdeUso

import com.example.averresponde.entidades.PreguntasDC

internal class CasosUsoPreguntas {
    //Seeccion casos de uso Preguntas Musica
    private val listPreguntasMusica = listOf<PreguntasDC>(
        PreguntasDC(
            "1M. ¿En qué país nació Antonio Vivaldi? ",
            "*Italia",
            "Francia",
            "Colombia",
            "Estados Unidos"
        ),
        PreguntasDC(
            "2M. ¿Qué rockero es recordado por haber “incendiado” su guitarra?",
            "*Jimi Hendrix",
            "Nikki Sixx",
            "Georges Biard",
            "Ozzy"
        ),
        PreguntasDC(
            "3M. ¿Qué artista es comúnmente conocido como “El Padre del Soul”?",
            "*Ray Charles",
            "Alice Cooper",
            "Ringo Starr",
            "Marilyn Manson"
        ),
        PreguntasDC(
            "4M. ¿Qué cantante es considerado “El Rey del Rock and Roll”?",
            "*Elvis Presley.",
            "Ray Charles",
            "Sam Cooke",
            "Bob Dylan"
        )
    )

    // funcion para tomar toda la lista de preguntas de Musica
    fun getAllQuestionMusica(): List<PreguntasDC> {
        return listPreguntasMusica
    }

    // seccion casos de uso preguntas Pintura
    private val listPreguntasPintura = listOf<PreguntasDC>(
        PreguntasDC(
            "1P. ¿En que museo está la Mona Lisa? ",
            "*Louvre",
            "Galería Uffizi",
            "British Museum",
            "Museo del Prado"
        ),
        PreguntasDC(
            "2P. ¿En que siglo nació Van Gogh?",
            "*Siglo XIX",
            "Siglo XX",
            "Siglo XVII",
            "Siglo XVIII"
        ),
        PreguntasDC(
            "3P. ¿Cuáles son las flores más famosas pintadas por Van Gogh?",
            "*Girasoles",
            "Flor de loto",
            "Margaritas",
            "Lirios"
        ),
        PreguntasDC(
            "4P. ¿Qué personaje de cómic creó Bob Kane cuando tenía 18 años”?",
            "*Spiderman",
            "Dardervil",
            "Batman",
            "Flash"
        )
    )

    // funcion para tomar toda la lista de preguntas de Musica
    fun getAllQuestionPrintura(): List<PreguntasDC> {
        return listPreguntasPintura
    }

}