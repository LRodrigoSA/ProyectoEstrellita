package com.example.proyectoestrellita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyectoestrellita.ui.theme.ProyectoEstrellitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProyectoEstrellitaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "Inicio"){
                        composable("Inicio") {
                            Inicio(irUsec = { navController.navigate("Usec") },
                                irBear = { navController.navigate("Bear") })
                        }
                        composable("Usec"){
                            Usec(irInicio = { navController.navigate("Inicio") })
                        }
                        composable("Bear"){
                            Bear(irInicio = { navController.navigate("Inicio") })
                        }
                    }
                }
            }
        }
    }
}

