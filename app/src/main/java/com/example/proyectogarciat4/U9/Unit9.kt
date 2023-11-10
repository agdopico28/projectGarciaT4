package com.example.proyectogarciat4.U9

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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.proyectogarciat4.R

@Composable
fun Unit9(navController: NavHostController) {

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
                        .width(100.dp)
                        .height(100.dp)
                )
                Spacer(modifier = Modifier.padding(5.dp))
                Text(
                    text = "Unit 9 ",
                    fontSize = 40.sp,
                    textAlign = TextAlign.Center

                )

                Spacer(modifier = Modifier.size(50.dp))
                Row {
                    Button(
                        onClick = { navController.navigate("Project31") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Project 31")
                    }
                    Button(
                        onClick = { navController.navigate("Project32") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Project 32")
                    }
                    Button(
                        onClick = { navController.navigate("Project33") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Project 33")
                    }
                    Button(
                        onClick = { navController.navigate("Project34") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Project 34")
                    }
                }
                Row {
                    Button(
                        onClick = { navController.navigate("Project35") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Project 35")
                    }
                    Button(
                        onClick = { navController.navigate("Project36") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Project 36")
                    }
                    Button(
                        onClick = { navController.navigate("Project37") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Project 37")
                    }

                    Button(
                        onClick = { navController.navigate("Project38") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Project 38")
                    }

                }
                Row {

                    Button(
                        onClick = { navController.navigate("Project39") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Project 39")
                    }
                    Button(
                        onClick = { navController.navigate("Project40") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Project 40")
                    }

                    Button(
                        onClick = { navController.navigate("Project41") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Project 41")
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
                Spacer(modifier = Modifier.padding(5.dp))
                Text(
                    text = "Unit 9",
                    fontSize = 40.sp,
                    textAlign = TextAlign.Center,
                )

                Spacer(modifier = Modifier.size(50.dp))

                Button(
                    onClick = { navController.navigate("Project31") }, modifier = Modifier
                        .width(200.dp)
                        .padding(15.dp, 0.dp)
                ) {
                    Text(text = "Project 31")
                }
                Button(
                    onClick = { navController.navigate("Project32") }, modifier = Modifier
                        .width(200.dp)
                        .padding(15.dp, 0.dp)
                ) {
                    Text(text = "Project 32")
                }
                Button(
                    onClick = { navController.navigate("Project33") }, modifier = Modifier
                        .width(200.dp)
                        .padding(15.dp, 0.dp)
                ) {
                    Text(text = "Project 33")
                }
                Button(
                    onClick = { navController.navigate("Project34") }, modifier = Modifier
                        .width(200.dp)
                        .padding(15.dp, 0.dp)
                ) {
                    Text(text = "Project 34")
                }
                Button(
                    onClick = { navController.navigate("Project35") }, modifier = Modifier
                        .width(200.dp)
                        .padding(15.dp, 0.dp)
                ) {
                    Text(text = "Project 35")
                }
                Button(
                    onClick = { navController.navigate("Project36") }, modifier = Modifier
                        .width(200.dp)
                        .padding(15.dp, 0.dp)
                ) {
                    Text(text = "Project 36")
                }
                Button(
                    onClick = { navController.navigate("Project37") }, modifier = Modifier
                        .width(200.dp)
                        .padding(15.dp, 0.dp)
                ) {
                    Text(text = "Project 37")
                }

                Button(
                    onClick = { navController.navigate("Project38") }, modifier = Modifier
                        .width(200.dp)
                        .padding(15.dp, 0.dp)
                ) {
                    Text(text = "Project 38")
                }

                Button(
                    onClick = { navController.navigate("Project39") }, modifier = Modifier
                        .width(200.dp)
                        .padding(15.dp, 0.dp)
                ) {
                    Text(text = "Project 39")
                }
                Button(
                    onClick = { navController.navigate("Project40") }, modifier = Modifier
                        .width(200.dp)
                        .padding(15.dp, 0.dp)
                ) {
                    Text(text = "Project 40")
                }

                Button(
                    onClick = { navController.navigate("Project41") }, modifier = Modifier
                        .width(200.dp)
                        .padding(15.dp, 0.dp)
                ) {
                    Text(text = "Project 41")
                }



            }
        }
    }
}