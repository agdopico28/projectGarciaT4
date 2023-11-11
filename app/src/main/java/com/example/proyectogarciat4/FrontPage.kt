package com.example.proyectogarciat4

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun FrontPage(navController: NavHostController) {

    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.kotlin),
                    contentDescription = "kotlin",
                    Modifier
                        .width(50.dp)
                        .height(50.dp)
                )
                Text(
                    text = stringResource(id = R.string.playJuegos),
                    fontSize = 40.sp,
                    textAlign = TextAlign.Center

                )

                Spacer(modifier = Modifier.size(50.dp))
                Row {
                    Button(
                        onClick = { navController.navigate("Unit4") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 4")
                    }
                    Button(
                        onClick = { navController.navigate("Unit5") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 5")
                    }
                    Button(
                        onClick = { navController.navigate("Unit6") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 6")
                    }
                    Button(
                        onClick = { navController.navigate("Unit7") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 7")
                    }
                }

                Row {
                    Button(
                        onClick = { navController.navigate("Unit8") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 8")
                    }
                    Button(
                        onClick = { navController.navigate("Unit9") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 9")
                    }
                    Button(
                        onClick = { navController.navigate("Unit10") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 10")
                    }
                    Button(
                        onClick = { navController.navigate("Unit11") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 11")
                    }
                }

                Row {
                    Button(
                        onClick = { navController.navigate("Unit12") }, modifier = Modifier
                            .weight(1f)
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 12")
                    }
                    Button(
                        onClick = { navController.navigate("Unit13") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 13")
                    }
                    Button(
                        onClick = { navController.navigate("Unit14") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 14")
                    }
                    Button(
                        onClick = { navController.navigate("Unit15") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 15")
                    }
                }

                Row {
                    Button(
                        onClick = { navController.navigate("Unit16") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 16")
                    }
                    Button(
                        onClick = { navController.navigate("Unit17") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 17")
                    }
                    Button(
                        onClick = { navController.navigate("Unit18") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 18")
                    }
                    Button(
                        onClick = { navController.navigate("Unit19") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 19")
                    }
                }
                Row {
                    Button(
                        onClick = { navController.navigate("Unit20") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 20")
                    }
                    Button(
                        onClick = { navController.navigate("Unit21") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 21")
                    }
                    Button(
                        onClick = { navController.navigate("Unit22") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 22")
                    }
                    Button(
                        onClick = { navController.navigate("Unit23") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 23")
                    }
                }
                Row {
                    Button(
                        onClick = { navController.navigate("Unit24") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 24")
                    }
                    Button(
                        onClick = { navController.navigate("Unit25") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 25")
                    }
                    Button(
                        onClick = { navController.navigate("Unit26") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 26")
                    }
                    Button(
                        onClick = { navController.navigate("Unit27") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 27")
                    }
                }

                Row {
                    Button(
                        onClick = { navController.navigate("Unit28") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 28")
                    }
                    Button(
                        onClick = { navController.navigate("Unit29") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 29")
                    }

                    Button(
                        onClick = { navController.navigate("Unit30") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 30")
                    }
                    Button(
                        onClick = { navController.navigate("Unit31") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 31")
                    }
                }
                Row {
                    Button(
                        onClick = { navController.navigate("Unit32") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 32")
                    }
                    Button(
                        onClick = { navController.navigate("Unit33") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 33")
                    }

                    Button(
                        onClick = { navController.navigate("Unit34") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 34")
                    }
                    Button(
                        onClick = { navController.navigate("Unit35") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 35")
                    }
                }

                Row {
                    Button(
                        onClick = { navController.navigate("Unit36") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 36")
                    }
                    Button(
                        onClick = { navController.navigate("Unit37") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 37")
                    }

                    Button(
                        onClick = { navController.navigate("Unit38") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 38")
                    }
                    Button(
                        onClick = { navController.navigate("Unit39") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 39")
                    }
                }

                Row {
                    Button(
                        onClick = { navController.navigate("Unit40") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 40")
                    }
                    Button(
                        onClick = { navController.navigate("Unit41") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 41")
                    }

                    Button(
                        onClick = { navController.navigate("Unit42") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 42")
                    }
                    Button(
                        onClick = { navController.navigate("Unit45") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 45")
                    }
                }

                Row {
                    Button(
                        onClick = { navController.navigate("Unit46") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 46")
                    }
                    Button(
                        onClick = { navController.navigate("Unit47") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 47")
                    }
                    Button(
                        onClick = { navController.navigate("Unit48") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 48")
                    }
                }

            }
        }

        else -> {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.kotlin),
                    contentDescription = "kotlin",
                    Modifier
                        .width(100.dp)
                        .height(100.dp)
                )
                Spacer(modifier = Modifier.padding(15.dp))

                Text(
                    text = stringResource(id = R.string.playJuegos),
                    fontSize = 40.sp,
                    textAlign = TextAlign.Center,
                )

                Spacer(modifier = Modifier.size(50.dp))

                Row {
                    Button(
                        onClick = { navController.navigate("Unit4") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 4")
                    }
                    Button(
                        onClick = { navController.navigate("Unit5") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 5")
                    }

                }
                Row {
                    Button(
                        onClick = { navController.navigate("Unit6") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 6")
                    }
                    Button(
                        onClick = { navController.navigate("Unit7") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 7")
                    }
                }
                Row {
                    Button(
                        onClick = { navController.navigate("Unit8") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 8")
                    }
                    Button(
                        onClick = { navController.navigate("Unit9") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 9")
                    }
                }
                Row {
                    Button(
                        onClick = { navController.navigate("Unit10") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 10")
                    }
                    Button(
                        onClick = { navController.navigate("Unit11") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 11")
                    }
                }
                Row {
                    Button(
                        onClick = { navController.navigate("Unit12") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 12")
                    }
                    Button(
                        onClick = { navController.navigate("Unit13") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 13")
                    }
                }

                Row {
                    Button(
                        onClick = { navController.navigate("Unit14") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 14")
                    }
                    Button(
                        onClick = { navController.navigate("Unit15") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 15")
                    }
                }
                Row {
                    Button(
                        onClick = { navController.navigate("Unit16") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 16")
                    }
                    Button(
                        onClick = { navController.navigate("Unit17") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 17")
                    }
                }
                Row {
                    Button(
                        onClick = { navController.navigate("Unit18") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 18")
                    }
                    Button(
                        onClick = { navController.navigate("Unit19") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 19")
                    }
                }

                Row {
                    Button(
                        onClick = { navController.navigate("Unit20") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 20")
                    }
                    Button(
                        onClick = { navController.navigate("Unit21") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 21")
                    }
                }

                Row {
                    Button(
                        onClick = { navController.navigate("Unit22") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 22")
                    }
                    Button(
                        onClick = { navController.navigate("Unit23") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 23")
                    }
                }
                Row {
                    Button(
                        onClick = { navController.navigate("Unit24") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 24")
                    }
                    Button(
                        onClick = { navController.navigate("Unit25") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 25")
                    }
                }

                Row {
                    Button(
                        onClick = { navController.navigate("Unit26") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 26")
                    }
                    Button(
                        onClick = { navController.navigate("Unit27") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 27")
                    }
                }

                Row {
                    Button(
                        onClick = { navController.navigate("Unit28") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 28")
                    }
                    Button(
                        onClick = { navController.navigate("Unit29") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 29")
                    }
                }

                Row {
                    Button(
                        onClick = { navController.navigate("Unit30") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 30")
                    }
                    Button(
                        onClick = { navController.navigate("Unit31") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 31")
                    }
                }

                Row {
                    Button(
                        onClick = { navController.navigate("Unit32") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 32")
                    }
                    Button(
                        onClick = { navController.navigate("Unit33") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 33")
                    }
                }

                Row {
                    Button(
                        onClick = { navController.navigate("Unit34") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 34")
                    }
                    Button(
                        onClick = { navController.navigate("Unit35") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 35")
                    }
                }
                Row {
                    Button(
                        onClick = { navController.navigate("Unit36") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 36")
                    }
                    Button(
                        onClick = { navController.navigate("Unit37") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 37")
                    }
                }

                Row {
                    Button(
                        onClick = { navController.navigate("Unit38") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 38")
                    }
                    Button(
                        onClick = { navController.navigate("Unit39") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 39")
                    }
                }

                Row {
                    Button(
                        onClick = { navController.navigate("Unit40") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 40")
                    }
                    Button(
                        onClick = { navController.navigate("Unit41") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 41")
                    }
                }

                Row {

                    Button(
                        onClick = { navController.navigate("Unit42") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 42")
                    }
                    Button(
                        onClick = { navController.navigate("Unit45") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 45")
                    }
                }

                Row {
                    Button(
                        onClick = { navController.navigate("Unit46") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 46")
                    }
                    Button(
                        onClick = { navController.navigate("Unit47") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 47")
                    }

                }
                Row {
                    Button(
                        onClick = { navController.navigate("Unit48") }, modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 48")
                    }
                }

            }
        }
    }
}
