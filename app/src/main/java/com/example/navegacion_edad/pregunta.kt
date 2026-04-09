package com.example.navegacion_edad

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun cuestionario(navegar: NavHostController,edadf: MutableState<Int>){
    var year by remember {mutableStateOf("")}
    var edad by remember { mutableStateOf(0) }


    Column(Modifier.fillMaxSize().padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text("Ingresa tu año de nacimiento :)\nunicamente numeros porfavor :)\n")
        TextField(year, onValueChange = {year= it},
        )
        Spacer(modifier = Modifier.size(10.dp))
        FloatingActionButton(
            onClick = {
            if (year.toIntOrNull()== null) {
            }else{
                navegar.navigate("respuesta")
                edad= calculadora().Agecalc(year.toInt())
                edadf.value= edad.toInt()
                navegar.navigate("respuesta")
            } },
            modifier=Modifier.width(120.dp),
            containerColor = Color(0xFF7D6991),
            contentColor = Color.White

        ) {
            Text("Calcular")
        }
    }
}