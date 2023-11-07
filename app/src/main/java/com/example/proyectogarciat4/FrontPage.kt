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
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 4")
                    }
                    Button(
                        onClick = { navController.navigate("Unit5") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 5")
                    }
                    Button(
                        onClick = { navController.navigate("Unit6") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 6")
                    }
                    Button(
                        onClick = { navController.navigate("Unit7") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 7")
                    }
                }

                Row {
                    Button(
                        onClick = { navController.navigate("Unit8") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 8")
                    }
                    Button(
                        onClick = { navController.navigate("Unit9") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 9")
                    }
                    Button(
                        onClick = { navController.navigate("Unit10") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 10")
                    }
                    Button(
                        onClick = { navController.navigate("Unit11") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 11")
                    }
                }

                Row {
                    Button(
                        onClick = { navController.navigate("Unit12") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 12")
                    }
                    Button(
                        onClick = { navController.navigate("Unit13") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 13")
                    }
                    Button(
                        onClick = { navController.navigate("Unit14") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 14")
                    }
                    Button(
                        onClick = { navController.navigate("Unit15") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 15")
                    }
                }

                Row {
                    Button(
                        onClick = { navController.navigate("Unit16") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 16")
                    }
                    Button(
                        onClick = { navController.navigate("Unit17") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 17")
                    }
                    Button(
                        onClick = { navController.navigate("Unit18") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 18")
                    }
                    Button(
                        onClick = { navController.navigate("Unit19") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 19")
                    }
                }
                Row{
                    Button(
                        onClick = { navController.navigate("Unit20") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 20")
                    }
                    Button(
                        onClick = { navController.navigate("Unit21") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 21")
                    }
                    Button(
                        onClick = { navController.navigate("Unit22") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 22")
                    }
                    Button(
                        onClick = { navController.navigate("Unit23") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 23")
                    }
                }
                Row{
                    Button(
                        onClick = { navController.navigate("Unit24") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 24")
                    }
                    Button(
                        onClick = { navController.navigate("Unit25") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 25")
                    }
                }
            }
        }

        else -> {
            Column(
                modifier = Modifier.fillMaxSize(),
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
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 4")
                    }
                    Button(
                        onClick = { navController.navigate("Unit5") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 5")
                    }

                }
                Row {
                    Button(
                        onClick = { navController.navigate("Unit6") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 6")
                    }
                    Button(
                        onClick = { navController.navigate("Unit7") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 7")
                    }
                }
                Row {
                    Button(
                        onClick = { navController.navigate("Unit8") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 8")
                    }
                    Button(
                        onClick = { navController.navigate("Unit9") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 9")
                    }
                }
                Row {
                    Button(
                        onClick = { navController.navigate("Unit10") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 10")
                    }
                    Button(
                        onClick = { navController.navigate("Unit11") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 11")
                    }
                }
                Row {
                    Button(
                        onClick = { navController.navigate("Unit12") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 12")
                    }
                    Button(
                        onClick = { navController.navigate("Unit13") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 13")
                    }
                }

                Row {
                    Button(
                        onClick = { navController.navigate("Unit14") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 14")
                    }
                    Button(
                        onClick = { navController.navigate("Unit15") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 15")
                    }
                }
                Row {
                    Button(
                        onClick = { navController.navigate("Unit16") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 16")
                    }
                    Button(
                        onClick = { navController.navigate("Unit17") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 17")
                    }
                }
                Row{
                    Button(
                        onClick = { navController.navigate("Unit18") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 18")
                    }
                    Button(
                        onClick = { navController.navigate("Unit19") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 19")
                    }
                }

                Row{
                    Button(
                        onClick = { navController.navigate("Unit20") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 20")
                    }
                    Button(
                        onClick = { navController.navigate("Unit21") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 21")
                    }
                }

                Row{
                    Button(
                        onClick = { navController.navigate("Unit22") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 22")
                    }
                    Button(
                        onClick = { navController.navigate("Unit23") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 23")
                    }
                }
                Row{
                    Button(
                        onClick = { navController.navigate("Unit24") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 24")
                    }
                    Button(
                        onClick = { navController.navigate("Unit25") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Unit 25")
                    }
                }
            }
        }
    }
}
