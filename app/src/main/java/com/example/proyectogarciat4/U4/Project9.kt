package com.example.proyectogarciat4.U4

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectogarciat4.ui.theme.Blue20

/** A program that reads three numerical values by keyboard integers and report their sum and average. **/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project9() {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top
            ) {

                var num1 by remember { mutableStateOf("") }
                var num2 by remember { mutableStateOf("") }
                var num3 by remember { mutableStateOf("") }
                var outcome by remember { mutableStateOf("Inconclusive") }

                Row(
                    Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                )
                {
                    Text(
                        text = "Project 9",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }


                OutlinedTextField(
                    value = num1,
                    onValueChange = { num1 = it },
                    label = {
                        Text("First number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true
                )

                OutlinedTextField(
                    value = num2,
                    onValueChange = { num2 = it },
                    label = {
                        Text("Second number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true
                )

                OutlinedTextField(
                    value = num3,
                    onValueChange = { num3 = it },
                    label = {
                        Text("Third number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true
                )
                Row(
                    Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(
                        onClick = {
                            var catena = ""
                            if (num2.toFloatOrNull() != null && num1.toFloatOrNull() != null) {
                                var resultAdd: Float
                                var resultPromedio: Float
                                resultAdd = num1.toFloat() + num2.toFloat() + num3.toFloat()
                                resultPromedio = resultAdd / 3
                                catena += "Adittion: $resultAdd  . Average: $resultPromedio"
                            } else {
                                catena += "Some field is empty"
                            }
                            outcome = catena

                        },
                        modifier = Modifier.padding(10.dp)
                    ) {
                        Text(text = "Add and Average")
                    }


                }

                Text(
                    text = outcome,
                    modifier = Modifier.padding(20.dp)
                )

            }
        }

        else -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top
            ) {

                var num1 by remember { mutableStateOf("") }
                var num2 by remember { mutableStateOf("") }
                var num3 by remember { mutableStateOf("") }
                var outcome by remember { mutableStateOf("Inconclusive") }

                Row(
                    Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                )
                {
                    Text(
                        text = "Project 9",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }


                OutlinedTextField(
                    value = num1,
                    onValueChange = { num1 = it },
                    label = {
                        Text("First number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true
                )

                OutlinedTextField(
                    value = num2,
                    onValueChange = { num2 = it },
                    label = {
                        Text("Second number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true
                )

                OutlinedTextField(
                    value = num3,
                    onValueChange = { num3 = it },
                    label = {
                        Text("Third number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true
                )
                Row(
                    Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(
                        onClick = {
                            var catena = ""
                            if (num2.toFloatOrNull() != null && num1.toFloatOrNull() != null) {
                                var resultAdd: Float
                                var resultPromedio: Float
                                resultAdd = num1.toFloat() + num2.toFloat() + num3.toFloat()
                                resultPromedio = resultAdd / 3
                                catena += "Adittion: $resultAdd  . Average: $resultPromedio"
                            } else {
                                catena += "Some field is empty"
                            }
                            outcome = catena

                        },
                        modifier = Modifier.padding(10.dp)
                    ) {
                        Text(text = "Add and Average")
                    }


                }

                Text(
                    text = outcome,
                    modifier = Modifier.padding(20.dp)
                )

            }
        }
    }
}

