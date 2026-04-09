package com.example.navegacion_edad

class calculadora {
    fun Agecalc(year: Int): Int {
        val actual = 2026
        return actual - year
    }

    fun Calcular(edad: Int): String {
        return when (edad) {
            in 1..13 -> "Tas mini"
            14 -> "Eres menor de edad"
            15 -> "mayor de edad en Indonesia pero no en mexico"
            16 -> "mayor de edad en Cuba pero no en mexico"
            17 -> "mayor de edad en Corea del norte pero no en mexico"
            18 -> "mayor de edad en mexico y gran parte de latinoamerica"
            19 -> "mayor de edad en Corea del sur"
            20 -> "mayor de edad en japón"
            21 -> "mayor de edad en Usa y posiblemente en todo el mundo"
            in 22..59 -> "Toca saberse la de chambear"
            in 60..64 -> "eres de tercera edad"
            65 -> "Ya te puedes jubilar, aprovecha"
            else -> "ya estas viejito amigo"
        }

    }

    fun Imagedad(edad: Int): Int {
        val imagenes = listOf(
            R.drawable.tj,
            R.drawable.bebe,
            R.drawable.joven,
            R.drawable.viejito
        )

        return when (edad) {
            in 1..13 -> imagenes[1] //imagen menor de edad
            in 14 ..59 -> imagenes[2]  //imagen joven
            in 60..100-> imagenes[3]
            else -> imagenes[0]  //
        }
    }
}