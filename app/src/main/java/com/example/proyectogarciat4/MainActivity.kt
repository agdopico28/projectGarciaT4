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
import com.example.proyectogarciat4.U10.Project45
import com.example.proyectogarciat4.U10.Project46
import com.example.proyectogarciat4.U11.Project52
import com.example.proyectogarciat4.U11.Project53
import com.example.proyectogarciat4.U11.Project54
import com.example.proyectogarciat4.U11.Project55
import com.example.proyectogarciat4.U11.Project56
import com.example.proyectogarciat4.U11.Project57
import com.example.proyectogarciat4.U11.Project58
import com.example.proyectogarciat4.U12.Project63
import com.example.proyectogarciat4.U12.Project64
import com.example.proyectogarciat4.U12.Project65
import com.example.proyectogarciat4.U13.Project69
import com.example.proyectogarciat4.U14.Project72
import com.example.proyectogarciat4.U14.Project73
import com.example.proyectogarciat4.U15.Project77
import com.example.proyectogarciat4.U15.Project78
import com.example.proyectogarciat4.U16.Project82
import com.example.proyectogarciat4.U16.Project83
import com.example.proyectogarciat4.U16.Project84
import com.example.proyectogarciat4.U17.Project88
import com.example.proyectogarciat4.U17.Project89
import com.example.proyectogarciat4.U17.Project90
import com.example.proyectogarciat4.U17.Project91
import com.example.proyectogarciat4.U18.Project93
import com.example.proyectogarciat4.U19.Project95
import com.example.proyectogarciat4.U20.Project97
import com.example.proyectogarciat4.U21.Project103
import com.example.proyectogarciat4.U4.Project5
import com.example.proyectogarciat4.U4.Project6
import com.example.proyectogarciat4.U4.Project7
import com.example.proyectogarciat4.U4.Project8
import com.example.proyectogarciat4.U4.Project9
import com.example.proyectogarciat4.U5.Project10
import com.example.proyectogarciat4.U5.Project11
import com.example.proyectogarciat4.U5.Project12
import com.example.proyectogarciat4.U5.Project13
import com.example.proyectogarciat4.U5.Project14
import com.example.proyectogarciat4.U6.Project15
import com.example.proyectogarciat4.U6.Project16
import com.example.proyectogarciat4.U6.Project17
import com.example.proyectogarciat4.U7.Project18
import com.example.proyectogarciat4.U7.Project19
import com.example.proyectogarciat4.U7.Project20
import com.example.proyectogarciat4.U7.Project21
import com.example.proyectogarciat4.U7.Project22
import com.example.proyectogarciat4.U8.Project23
import com.example.proyectogarciat4.U8.Project24
import com.example.proyectogarciat4.U8.Project25
import com.example.proyectogarciat4.U8.Project26
import com.example.proyectogarciat4.U8.Project27
import com.example.proyectogarciat4.U8.Project28
import com.example.proyectogarciat4.U8.Project29
import com.example.proyectogarciat4.U8.Project30
import com.example.proyectogarciat4.U9.Project31
import com.example.proyectogarciat4.U9.Project32
import com.example.proyectogarciat4.U9.Project33
import com.example.proyectogarciat4.U9.Project34
import com.example.proyectogarciat4.U9.Project35
import com.example.proyectogarciat4.U9.Project36
import com.example.proyectogarciat4.U9.Project37
import com.example.proyectogarciat4.U9.Project38
import com.example.proyectogarciat4.U9.Project39
import com.example.proyectogarciat4.U9.Project40
import com.example.proyectogarciat4.U9.Project41
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
                        composable("Unit7"){ Unit7(navController = navController)}
                        composable("Project18") { Project18() }
                        composable("Project19") { Project19() }
                        composable("Project20") { Project20() }
                        composable("Project21") { Project21() }
                        composable("Project22") { Project22() }
                        composable("Unit8"){ Unit8(navController = navController)}
                        composable("Project23") { Project23() }
                        composable("Project24") { Project24() }
                        composable("Project25") { Project25() }
                        composable("Project26") { Project26() }
                        composable("Project27") { Project27() }
                        composable("Project28") { Project28() }
                        composable("Project29") { Project29() }
                        composable("Project30") { Project30() }
                        composable("Unit9"){ Unit9(navController = navController)}
                        composable("Project31") { Project31() }
                        composable("Project32") { Project32() }
                        composable("Project33") { Project33() }
                        composable("Project34") { Project34() }
                        composable("Project35") { Project35() }
                        composable("Project36") { Project36() }
                        composable("Project37") { Project37() }
                        composable("Project38") { Project38() }
                        composable("Project39") { Project39() }
                        composable("Project40") { Project40() }
                        composable("Project41") { Project41() }
                        composable("Unit10"){ Unit10(navController = navController)}
                        composable("Project45") { Project45() }
                        composable("Project46") { Project46() }
                        composable("Unit11"){ Unit11(navController = navController)}
                        composable("Project52") { Project52() }
                        composable("Project53") { Project53() }
                        composable("Project54") { Project54() }
                        composable("Project55") { Project55() }
                        composable("Project56") { Project56() }
                        composable("Project57") { Project57() }
                        composable("Project58") { Project58() }
                        composable("Unit12"){ Unit12(navController = navController)}
                        composable("Project63") { Project63() }
                        composable("Project64") { Project64() }
                        composable("Project65") { Project65() }
                        composable("Unit13"){ Unit13(navController = navController) }
                        composable("Project69") { Project69() }
                        composable("Unit14"){ Unit14(navController = navController) }
                        composable("Project72") { Project72() }
                        composable("Project73") { Project73() }
                        composable("Unit15"){ Unit15(navController = navController) }
                        composable("Project77") { Project77() }
                        composable("Project78") { Project78() }
                        composable("Unit16"){ Unit16(navController = navController) }
                        composable("Project82") { Project82() }
                        composable("Project83") { Project83() }
                        composable("Project84") { Project84() }
                        composable("Unit17"){ Unit17(navController = navController) }
                        composable("Project88") { Project88() }
                        composable("Project89") { Project89() }
                        composable("Project90") { Project90() }
                        composable("Project91") { Project91() }
                        composable("Unit18"){ Unit18(navController = navController) }
                        composable("Project93") { Project93() }
                        composable("Unit19"){ Unit19(navController = navController) }
                        composable("Project95") { Project95() }
                        composable("Unit20"){ Unit20(navController = navController) }
                        composable("Project97") { Project97() }
                        composable("Unit21"){ Unit21(navController = navController) }
                        composable("Project103") { Project103() }
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
