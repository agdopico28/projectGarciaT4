package com.example.proyectogarciat4

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Unit11(navController: NavHostController) {

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
                Text(
                    text = "Unit 11 ",
                    fontSize = 40.sp,
                    textAlign = TextAlign.Center

                )

                Spacer(modifier = Modifier.size(50.dp))
                Row {
                    Button(
                        onClick = { navController.navigate("Project52") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Project 52")
                    }
                    Button(
                        onClick = { navController.navigate("Project53") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Project 53")
                    }
                    Button(
                        onClick = { navController.navigate("Project54") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Project 54")
                    }

                }
                Row {
                    Button(
                        onClick = { navController.navigate("Project55") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Project 55")
                    }
                    Button(
                        onClick = { navController.navigate("Project56") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Project 56")
                    }
                    Button(
                        onClick = { navController.navigate("Project57") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Project 57")
                    }



                }
                Row {

                    Button(
                        onClick = { navController.navigate("Project58") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Project 58")
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
                Text(
                    text = "Unit 11",
                    fontSize = 40.sp,
                    textAlign = TextAlign.Center,
                )

                Spacer(modifier = Modifier.size(50.dp))

                Button(
                    onClick = { navController.navigate("Project52") }, modifier = Modifier
                        .width(200.dp)
                        .padding(15.dp, 0.dp)
                ) {
                    Text(text = "Project 52")
                }
                Button(
                    onClick = { navController.navigate("Project53") }, modifier = Modifier
                        .width(200.dp)
                        .padding(15.dp, 0.dp)
                ) {
                    Text(text = "Project 53")
                }
                Button(
                    onClick = { navController.navigate("Project54") }, modifier = Modifier
                        .width(200.dp)
                        .padding(15.dp, 0.dp)
                ) {
                    Text(text = "Project 54")
                }
                Button(
                    onClick = { navController.navigate("Project55") }, modifier = Modifier
                        .width(200.dp)
                        .padding(15.dp, 0.dp)
                ) {
                    Text(text = "Project 55")
                }
                Button(
                    onClick = { navController.navigate("Project56") }, modifier = Modifier
                        .width(200.dp)
                        .padding(15.dp, 0.dp)
                ) {
                    Text(text = "Project 56")
                }
                Button(
                    onClick = { navController.navigate("Project57") }, modifier = Modifier
                        .width(200.dp)
                        .padding(15.dp, 0.dp)
                ) {
                    Text(text = "Project 57")
                }
                Button(
                    onClick = { navController.navigate("Project58") }, modifier = Modifier
                        .width(200.dp)
                        .padding(15.dp, 0.dp)
                ) {
                    Text(text = "Project 58")
                }




            }
        }
    }
}