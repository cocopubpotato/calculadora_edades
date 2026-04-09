package com.example.navegacion_edad

class calculadora {
        fun Agecalc(year: Int):Int {
            val actual= 2026
            return actual-year
        }

        fun Calcular(edad:Int): String {
            return when(edad) {
                in 1..13-> "Tas mini"
                14-> "Eres menor de edad"
                15-> "mayor de edad en Idonesia pero no en mexico"
                16-> "años mayor de edad en Cuba pero no en mexico"
                17 ->"años mayor de edad en Corea del norte pero no en mexico"
                18 ->"años mayor de edad en mexico y gran parte de latinoamerica"
                19-> "años mayor de edad en Corea del sur"
                20 ->"años myaor de edad en japón"
                21 ->"años mayor de edad en Usa y posiblemente en todo el mundo"
                in 22..59->"Toca saberse la de chambear"
                60 -> "eres de tercera edad"
                65 -> "Ya te puedes jubilar, aprovecha"

                else ->   "ya estas viejito amigo"
            }

        }
    }
