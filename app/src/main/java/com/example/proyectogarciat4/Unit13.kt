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
fun Unit13(navController: NavHostController) {

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
                        onClick = { navController.navigate("Project63") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Project 63")
                    }
                    Button(
                        onClick = { navController.navigate("Project64") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Project 64")
                    }
                    Button(
                        onClick = { navController.navigate("Project65") }, modifier = Modifier
                            .width(200.dp)
                            .padding(15.dp, 0.dp)
                    ) {
                        Text(text = "Project 65")
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
                    onClick = { navController.navigate("Project63") }, modifier = Modifier
                        .width(200.dp)
                        .padding(15.dp, 0.dp)
                ) {
                    Text(text = "Project 63")
                }
                Button(
                    onClick = { navController.navigate("Project64") }, modifier = Modifier
                        .width(200.dp)
                        .padding(15.dp, 0.dp)
                ) {
                    Text(text = "Project 64")
                }
                Button(
                    onClick = { navController.navigate("Project65") }, modifier = Modifier
                        .width(200.dp)
                        .padding(15.dp, 0.dp)
                ) {
                    Text(text = "Project 65")
                }


            }
        }
    }
}