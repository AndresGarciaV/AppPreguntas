package com.example.averresponde.casosdeUso

import com.example.averresponde.entidades.PreguntasDC

internal class CasosUsoPreguntas {
    ////////////////Música//////////////
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


    ////////////////Pintura//////////////
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

    ////////////////Video Juegos//////////////
    // seccion casos de uso preguntas VideoJuegos
    private val listPreguntasVJ = listOf<PreguntasDC>(
        //1
        PreguntasDC(
            "¿Cómo se llama el hermano de Mario Bros?",
            "*Luigi",
            "Mario Jr.",
            "Honguito",
            "Luis"
        ),//2
        PreguntasDC(
            "¿Cuántos luchadores hay en Street Fighter II?",
            "*12",
            "8",
            "4",
            "16"
        ),//3
        PreguntasDC(
            "¿Cuántas entradas para mandos tiene Nintendo 64?",
            "*4",
            "2",
            "1",
            "6"
        ),//4
        PreguntasDC(
            "¿Cuál es un videojuego de autos de carrera?",
            "*Top Gear",
            "Snake",
            "Frogger",
            "R-Type"
        )
        ,//5
        PreguntasDC(
            "¿Cómo se llama el enemigo de Sonic?",
            "*Dr. Malo",
            "Robetech",
            "Tails",
            "Dr. Robotnik "
        ),//6
        PreguntasDC(
            "¿Cuál fue primero?",
            "*Pong",
            "Tetris",
            "Pac-man",
            "Donkey kong "
        )

    )

    ////////////////////Paranormal////////////

    // seccion casos de uso preguntas Paranormal
    private val listPreguntasParanormal = listOf<PreguntasDC>(
        //1
        PreguntasDC(
            "Paranormal¿Cómo se llama el hermano de Mario Bros?",
            "*Luigi",
            "Mario Jr.",
            "Honguito",
            "Luis"
        ),//2
        PreguntasDC(
            "Paranormal¿Cuántos luchadores hay en Street Fighter II?",
            "*12",
            "8",
            "4",
            "16"
        ),//3
        PreguntasDC(
            "Paranormal¿Cuántas entradas para mandos tiene Nintendo 64?",
            "*4",
            "2",
            "1",
            "6"
        ),//4
        PreguntasDC(
            "Paranormal¿Cuál es un videojuego de autos de carrera?",
            "*Top Gear",
            "Snake",
            "Frogger",
            "R-Type"
        )
        ,//5
        PreguntasDC(
            "Paranormal¿Cómo se llama el enemigo de Sonic?",
            "*Dr. Malo",
            "Robetech",
            "Tails",
            "Dr. Robotnik "
        ),//6
        PreguntasDC(
            "Paranormal¿Cuál fue primero?",
            "*Pong",
            "Tetris",
            "Pac-man",
            "Donkey kong "
        )

    )

    // funcion para tomar toda la lista de preguntas de Musica
    fun getAllQuestionMusica(): List<PreguntasDC> {
        return listPreguntasMusica
    }

    // funcion para tomar toda la lista de preguntas de Pintura
    fun getAllQuestionPrintura(): List<PreguntasDC> {
        return listPreguntasPintura
    }

    // funcion para tomar toda la lista de preguntas de VideoJuegos
    fun getAllQuestionVJ(): List<PreguntasDC> {
        return listPreguntasVJ
    }

    // funcion para tomar toda la lista de preguntas de Musica
    fun getAllQuestionParanormal(): List<PreguntasDC> {
        return listPreguntasParanormal
    }

}