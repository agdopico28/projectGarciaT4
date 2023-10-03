package com.example.proyectogarciat4.U9

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project33() {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Top
            ) {

                var number1 by remember { mutableStateOf("") }
                var number2 by remember { mutableStateOf("") }
                var number3 by remember { mutableStateOf("") }
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
                        text = "Project 21",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }


                OutlinedTextField(
                    value = number1,
                    onValueChange = { number1 = it },
                    label = {
                        Text("First number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true
                )

                OutlinedTextField(
                    value = number2,
                    onValueChange = { number2 = it },
                    label = {
                        Text("Second number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true
                )

                OutlinedTextField(
                    value = number3,
                    onValueChange = { number3 = it },
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
                            if (number1.toIntOrNull() != null &&
                                    number2.toIntOrNull() != null &&
                                    number3.toIntOrNull() != null) {
                               var add = 0
                                var average = 0
                                add = number1.toInt() + number2.toInt() + number3.toInt()
                                average = add /3
                                catena += "The sum of the 10 values entered is $add. \n The average is $average"

                            } else {
                            catena += "Some field is empty"
                        }



                            outcome = catena

                        },
                        modifier = Modifier.padding(10.dp)
                    ) {
                        Text(text = "Show")
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
                modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Top
            ) {

                var number1 by remember { mutableStateOf("") }
                var number2 by remember { mutableStateOf("") }
                var number3 by remember { mutableStateOf("") }
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
                        text = "Project 21",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }


                OutlinedTextField(
                    value = number1,
                    onValueChange = { number1 = it },
                    label = {
                        Text("First number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true
                )

                OutlinedTextField(
                    value = number2,
                    onValueChange = { number2 = it },
                    label = {
                        Text("Second number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true
                )

                OutlinedTextField(
                    value = number3,
                    onValueChange = { number3 = it },
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
                            if (number1.toIntOrNull() != null &&
                                number2.toIntOrNull() != null &&
                                number3.toIntOrNull() != null) {
                                var add = 0
                                var average = 0
                                add = number1.toInt() + number2.toInt() + number3.toInt()
                                average = add /3
                                catena += "The sum of the 10 values entered is $add. \n The average is $average"

                            } else {
                                catena += "Some field is empty"
                            }



                            outcome = catena

                        },
                        modifier = Modifier.padding(10.dp)
                    ) {
                        Text(text = "Show")
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
