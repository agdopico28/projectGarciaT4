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
import com.example.proyectogarciat4.U10.Unit10
import com.example.proyectogarciat4.U11.Project52
import com.example.proyectogarciat4.U11.Project53
import com.example.proyectogarciat4.U11.Project54
import com.example.proyectogarciat4.U11.Project55
import com.example.proyectogarciat4.U11.Project56
import com.example.proyectogarciat4.U11.Project57
import com.example.proyectogarciat4.U11.Project58
import com.example.proyectogarciat4.U11.Unit11
import com.example.proyectogarciat4.U12.Project63
import com.example.proyectogarciat4.U12.Project64
import com.example.proyectogarciat4.U12.Project65
import com.example.proyectogarciat4.U12.Unit12
import com.example.proyectogarciat4.U13.Project69
import com.example.proyectogarciat4.U13.Unit13
import com.example.proyectogarciat4.U14.Project72
import com.example.proyectogarciat4.U14.Project73
import com.example.proyectogarciat4.U14.Unit14
import com.example.proyectogarciat4.U15.Project77
import com.example.proyectogarciat4.U15.Project78
import com.example.proyectogarciat4.U15.Unit15
import com.example.proyectogarciat4.U16.Project82
import com.example.proyectogarciat4.U16.Project83
import com.example.proyectogarciat4.U16.Project84
import com.example.proyectogarciat4.U16.Unit16
import com.example.proyectogarciat4.U17.Project88
import com.example.proyectogarciat4.U17.Project89
import com.example.proyectogarciat4.U17.Project90
import com.example.proyectogarciat4.U17.Project91
import com.example.proyectogarciat4.U17.Unit17
import com.example.proyectogarciat4.U18.Project93
import com.example.proyectogarciat4.U18.Unit18
import com.example.proyectogarciat4.U19.Project95
import com.example.proyectogarciat4.U19.Unit19
import com.example.proyectogarciat4.U20.Project97
import com.example.proyectogarciat4.U20.Unit20
import com.example.proyectogarciat4.U21.Project103
import com.example.proyectogarciat4.U21.Project104
import com.example.proyectogarciat4.U21.Unit21
import com.example.proyectogarciat4.U22.Project107
import com.example.proyectogarciat4.U22.Project108
import com.example.proyectogarciat4.U22.Unit22
import com.example.proyectogarciat4.U23.Project111
import com.example.proyectogarciat4.U23.Unit23
import com.example.proyectogarciat4.U24.Project115
import com.example.proyectogarciat4.U24.Project116
import com.example.proyectogarciat4.U24.Unit24
import com.example.proyectogarciat4.U25.Project118
import com.example.proyectogarciat4.U25.Unit25
import com.example.proyectogarciat4.U26.Project121
import com.example.proyectogarciat4.U26.Unit26
import com.example.proyectogarciat4.U27.Project124
import com.example.proyectogarciat4.U27.Unit27
import com.example.proyectogarciat4.U28.Project126
import com.example.proyectogarciat4.U28.Project127
import com.example.proyectogarciat4.U28.Unit28
import com.example.proyectogarciat4.U29.Project130
import com.example.proyectogarciat4.U29.Unit29
import com.example.proyectogarciat4.U30.Project133
import com.example.proyectogarciat4.U30.Unit30
import com.example.proyectogarciat4.U31.Project136
import com.example.proyectogarciat4.U31.Unit31
import com.example.proyectogarciat4.U32.Project139
import com.example.proyectogarciat4.U32.Unit32
import com.example.proyectogarciat4.U33.Project141
import com.example.proyectogarciat4.U33.Unit33
import com.example.proyectogarciat4.U34.Project142
import com.example.proyectogarciat4.U34.Project143
import com.example.proyectogarciat4.U34.Unit34
import com.example.proyectogarciat4.U35.Project145
import com.example.proyectogarciat4.U35.Project146
import com.example.proyectogarciat4.U35.Unit35
import com.example.proyectogarciat4.U36.Project147
import com.example.proyectogarciat4.U36.Project148
import com.example.proyectogarciat4.U36.Unit36
import com.example.proyectogarciat4.U37.Project149
import com.example.proyectogarciat4.U37.Project150
import com.example.proyectogarciat4.U37.Project151
import com.example.proyectogarciat4.U37.Unit37
import com.example.proyectogarciat4.U38.Project153
import com.example.proyectogarciat4.U38.Unit38
import com.example.proyectogarciat4.U39.Project157
import com.example.proyectogarciat4.U39.Unit39
import com.example.proyectogarciat4.U4.Project5
import com.example.proyectogarciat4.U4.Project6
import com.example.proyectogarciat4.U4.Project7
import com.example.proyectogarciat4.U4.Project8
import com.example.proyectogarciat4.U4.Project9
import com.example.proyectogarciat4.U4.Unit4
import com.example.proyectogarciat4.U40.Project160
import com.example.proyectogarciat4.U40.Project161
import com.example.proyectogarciat4.U40.Unit40
import com.example.proyectogarciat4.U41.Project162
import com.example.proyectogarciat4.U41.Project163
import com.example.proyectogarciat4.U41.Project164
import com.example.proyectogarciat4.U41.Project165
import com.example.proyectogarciat4.U41.Project166
import com.example.proyectogarciat4.U41.Project167
import com.example.proyectogarciat4.U41.Project168
import com.example.proyectogarciat4.U41.Project169
import com.example.proyectogarciat4.U41.Unit41
import com.example.proyectogarciat4.U42.Project172
import com.example.proyectogarciat4.U42.Unit42
import com.example.proyectogarciat4.U45.Project178
import com.example.proyectogarciat4.U45.Project179
import com.example.proyectogarciat4.U45.Project180
import com.example.proyectogarciat4.U45.Unit45
import com.example.proyectogarciat4.U46.Project186
import com.example.proyectogarciat4.U46.Unit46
import com.example.proyectogarciat4.U47.Project189
import com.example.proyectogarciat4.U47.Unit47
import com.example.proyectogarciat4.U48.Project191
import com.example.proyectogarciat4.U48.Unit48
import com.example.proyectogarciat4.U5.Project10
import com.example.proyectogarciat4.U5.Project11
import com.example.proyectogarciat4.U5.Project12
import com.example.proyectogarciat4.U5.Project13
import com.example.proyectogarciat4.U5.Project14
import com.example.proyectogarciat4.U5.Unit5
import com.example.proyectogarciat4.U6.Project15
import com.example.proyectogarciat4.U6.Project16
import com.example.proyectogarciat4.U6.Project17
import com.example.proyectogarciat4.U6.Unit6
import com.example.proyectogarciat4.U7.Project18
import com.example.proyectogarciat4.U7.Project19
import com.example.proyectogarciat4.U7.Project20
import com.example.proyectogarciat4.U7.Project21
import com.example.proyectogarciat4.U7.Project22
import com.example.proyectogarciat4.U7.Unit7
import com.example.proyectogarciat4.U8.Project23
import com.example.proyectogarciat4.U8.Project24
import com.example.proyectogarciat4.U8.Project25
import com.example.proyectogarciat4.U8.Project26
import com.example.proyectogarciat4.U8.Project27
import com.example.proyectogarciat4.U8.Project28
import com.example.proyectogarciat4.U8.Project29
import com.example.proyectogarciat4.U8.Project30
import com.example.proyectogarciat4.U8.Unit8
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
import com.example.proyectogarciat4.U9.Unit9
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
                        composable("FrontPage") { FrontPage(navController = navController) }

                        //Unit 4
                        composable("Unit4"){ Unit4(navController = navController) }
                        composable("Project5") { Project5() }
                        composable("Project6") { Project6() }
                        composable("Project7") { Project7() }
                        composable("Project8") { Project8() }
                        composable("Project9") { Project9() }

                        //Unit 5
                        composable("Unit5"){ Unit5(navController = navController) }
                        composable("Project10") { Project10() }
                        composable("Project11") { Project11() }
                        composable("Project12") { Project12() }
                        composable("Project13") { Project13() }
                        composable("Project14") { Project14() }

                        //Unit 6
                        composable("Unit6"){ Unit6(navController = navController) }
                        composable("Project15") { Project15() }
                        composable("Project16") { Project16() }
                        composable("Project17") { Project17() }

                        //Unit 7
                        composable("Unit7"){ Unit7(navController = navController) }
                        composable("Project18") { Project18() }
                        composable("Project19") { Project19() }
                        composable("Project20") { Project20() }
                        composable("Project21") { Project21() }
                        composable("Project22") { Project22() }

                        //Unit 8
                        composable("Unit8"){ Unit8(navController = navController) }
                        composable("Project23") { Project23() }
                        composable("Project24") { Project24() }
                        composable("Project25") { Project25() }
                        composable("Project26") { Project26() }
                        composable("Project27") { Project27() }
                        composable("Project28") { Project28() }
                        composable("Project29") { Project29() }
                        composable("Project30") { Project30() }

                        //Unit 9
                        composable("Unit9"){ Unit9(navController = navController) }
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

                        //Unit 10
                        composable("Unit10"){ Unit10(navController = navController) }
                        composable("Project45") { Project45() }
                        composable("Project46") { Project46() }

                        //Unit 11
                        composable("Unit11"){ Unit11(navController = navController) }
                        composable("Project52") { Project52() }
                        composable("Project53") { Project53() }
                        composable("Project54") { Project54() }
                        composable("Project55") { Project55() }
                        composable("Project56") { Project56() }
                        composable("Project57") { Project57() }
                        composable("Project58") { Project58() }

                        //Unit 12
                        composable("Unit12"){ Unit12(navController = navController) }
                        composable("Project63") { Project63() }
                        composable("Project64") { Project64() }
                        composable("Project65") { Project65() }

                        //Unit 13
                        composable("Unit13"){ Unit13(navController = navController) }
                        composable("Project69") { Project69() }

                        //Unit 14
                        composable("Unit14"){ Unit14(navController = navController) }
                        composable("Project72") { Project72() }
                        composable("Project73") { Project73() }

                        //Unit 15
                        composable("Unit15"){ Unit15(navController = navController) }
                        composable("Project77") { Project77() }
                        composable("Project78") { Project78() }

                        //Unit 16
                        composable("Unit16"){ Unit16(navController = navController) }
                        composable("Project82") { Project82() }
                        composable("Project83") { Project83() }
                        composable("Project84") { Project84() }

                        //Unit 17
                        composable("Unit17"){ Unit17(navController = navController) }
                        composable("Project88") { Project88() }
                        composable("Project89") { Project89() }
                        composable("Project90") { Project90() }
                        composable("Project91") { Project91() }

                        //Unit 18
                        composable("Unit18"){ Unit18(navController = navController) }
                        composable("Project93") { Project93() }

                        //Unit 19
                        composable("Unit19"){ Unit19(navController = navController) }
                        composable("Project95") { Project95() }

                        //Unit 20
                        composable("Unit20"){ Unit20(navController = navController) }
                        composable("Project97") { Project97() }

                        //Unit 21
                        composable("Unit21"){ Unit21(navController = navController) }
                        composable("Project103") { Project103() }
                        composable("Project104") { Project104() }

                        //Unit 22
                        composable("Unit22"){ Unit22(navController = navController) }
                        composable("Project107") { Project107() }
                        composable("Project108") { Project108() }

                        //Unit 23
                        composable("Unit23"){ Unit23(navController = navController) }
                        composable("Project111") { Project111() }

                        //Unit 24
                        composable("Unit24"){ Unit24(navController = navController) }
                        composable("Project115") { Project115() }
                        composable("Project116") { Project116() }

                        //Unit 25
                        composable("Unit25"){ Unit25(navController = navController) }
                        composable("Project118") { Project118() }

                        //Unit 26
                        composable("Unit26"){ Unit26(navController = navController) }
                        composable("Project121") { Project121() }

                        //Unit 27
                        composable("Unit27"){ Unit27(navController = navController) }
                        composable("Project124") { Project124() }

                        //Unit 28
                        composable("Unit28"){ Unit28(navController = navController) }
                        composable("Project126") { Project126() }
                        composable("Project127") { Project127() }

                        //Unit 29
                        composable("Unit29"){ Unit29(navController = navController) }
                        composable("Project130") { Project130() }

                        //Unit 30
                        composable("Unit30"){ Unit30(navController = navController) }
                        composable("Project133") { Project133() }

                        //Unit 31
                        composable("Unit31"){ Unit31(navController = navController) }
                        composable("Project136") { Project136() }

                        //Unit 32
                        composable("Unit32"){ Unit32(navController = navController) }
                        composable("Project139") { Project139() }

                        //Unit 33
                        composable("Unit33"){ Unit33(navController = navController) }
                        composable("Project141") { Project141() }

                        //Unit 34
                        composable("Unit34"){ Unit34(navController = navController) }
                        composable("Project142") { Project142() }
                        composable("Project143") { Project143() }

                        //Unit 35
                        composable("Unit35"){ Unit35(navController = navController) }
                        composable("Project145") { Project145() }
                        composable("Project146") { Project146() }

                        //Unit 36
                        composable("Unit36"){ Unit36(navController = navController) }
                        composable("Project147") { Project147() }
                        composable("Project148") { Project148() }

                        //Unit 37
                        composable("Unit37"){ Unit37(navController = navController) }
                        composable("Project149") { Project149() }
                        composable("Project150") { Project150() }
                        composable("Project151") { Project151() }

                        //Unit 38
                        composable("Unit38"){ Unit38(navController = navController) }
                        composable("Project153") { Project153() }

                        //Unit 39
                        composable("Unit39"){ Unit39(navController = navController) }
                        composable("Project157") { Project157() }

                        //Unit 40
                        composable("Unit40"){ Unit40(navController = navController) }
                        composable("Project160") { Project160() }
                        composable("Project161") { Project161() }

                        //Unit 41
                        composable("Unit41"){ Unit41(navController = navController) }
                        composable("Project162") { Project162() }
                        composable("Project163") { Project163() }
                        composable("Project164") { Project164() }
                        composable("Project165") { Project165() }
                        composable("Project166") { Project166() }
                        composable("Project167") { Project167() }
                        composable("Project168") { Project168() }
                        composable("Project169") { Project169() }

                        //Unit 42
                        composable("Unit42"){ Unit42(navController = navController) }
                        composable("Project172") { Project172() }

                        //Unit 45
                        composable("Unit45"){ Unit45(navController = navController) }
                        composable("Project178") { Project178() }
                        composable("Project179") { Project179() }
                        composable("Project180") { Project180() }

                        //Unit 46
                        composable("Unit46"){ Unit46(navController = navController) }
                        composable("Project186") { Project186() }

                        //Unit 47
                        composable("Unit47"){ Unit47(navController = navController) }
                        composable("Project189") { Project189() }

                        //Unit 48
                        composable("Unit48"){ Unit48(navController = navController) }
                        composable("Project191") { Project191() }
                    }

                }
            }
        }
    }
}

