package com.example.proyectogarciat4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyectogarciat4.ui.theme.ProyectoGarciaT4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProyectoGarciaT4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    val navController  = rememberNavController()
                    NavHost(navController = navController, startDestination = "FrontPage"){
                        composable("Project5") { Project5() }
                        composable("Project6") { Project6() }
                        composable("Project7") { Project7() }
                        composable("Project8") { Project8() }
                        composable("Project9") { Project9() }
                        composable("Unit4"){ Unit4(navController = navController)}
                        composable("Unit5"){ Unit5(navController = navController)}
                        composable("Project10") { Project10() }
                        composable("Project11") { Project11() }
                        composable("Project12") { Project12() }
                        composable("Project13") { Project13() }
                        composable("Project14") { Project14() }
                        composable("Unit6"){ Unit6(navController = navController)}
                        composable("Project15") { Project15() }
                        composable("Project16") { Project16() }
                        composable("Project17") { Project17() }
                        composable("FrontPage") { FrontPage(navController = navController) }
                    }

                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProyectoGarciaT4Theme {


    }
}
