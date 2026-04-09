package com.example.navegacion_edad

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavManager(){
    val navController = rememberNavController()
    val edad = remember { mutableStateOf(0) }

    NavHost(navController, startDestination = "pregunta"){
        composable("pregunta"){
            Cuestionario(navController,edad)
        }
        composable("respuesta"){
            Respuestas( navController,edad)
        }

    }
}