package com.example.navegacion_edad

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController
import java.time.Year


@Composable
fun respuestas(navegar: NavHostController,edadf: MutableState<Int>){
    Card() {
        Column() {
            Text("${calculadora().Calcular(edadf.value)}")

        }
    }
}