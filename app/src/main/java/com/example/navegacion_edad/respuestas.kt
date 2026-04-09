package com.example.navegacion_edad

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController


@Composable
fun Respuestas(navegar: NavHostController,edadf: MutableState<Int>){
    Column(Modifier.fillMaxSize().padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Card(
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            border = BorderStroke(width = .6.dp, color = Color(0xFF7D6991))
        ) {
            Text("Tienes ${edadf.value}",
                modifier = Modifier.align(Alignment.CenterHorizontally).padding(10.dp))
            Image(
                painter = painterResource(id = calculadora().Imagedad(edadf.value)),
                contentDescription="imagen adecuada a la edad del usuario",
                modifier = Modifier.size(300.dp)
            )
            Text("${calculadora().Calcular(edadf.value)}",
                modifier = Modifier.align(Alignment.CenterHorizontally).padding(10.dp))
        }
        Button(onClick = {navegar.navigate("pregunta")},
            colors = ButtonDefaults.buttonColors(Color(0xFF7D6991)),
            modifier=Modifier.width(120.dp)
        ) {
            Text("Regresar")
        }
    }
}