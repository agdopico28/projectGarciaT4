package com.example.proyectogarciat4.U9

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectogarciat4.ui.theme.Blue20

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project41() {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top
            ) {

                var values by remember { mutableStateOf("") }
                var amountValues by remember { mutableStateOf("") }
                var outcome by remember { mutableStateOf("") }
                var x by remember { mutableStateOf(1) }
                var pairs by remember { mutableStateOf(0) }
                var odd by remember { mutableStateOf(0) }

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
                    value = amountValues,
                    onValueChange = { amountValues = it },
                    label = {
                        Text("Amount of numbers")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true,

                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Number
                    ),
                )
                OutlinedTextField(
                    value = values,
                    onValueChange = { values = it },
                    label = {
                        Text("Numbers")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {
                            if (values.toIntOrNull() != null && amountValues.toIntOrNull() != null) {
                                if (x < amountValues.toInt()) {
                                    val left = amountValues.toInt() - x
                                    outcome = "$left number/s left"
                                    if (values.toInt() % 2 == 0) {
                                        pairs++
                                    } else {
                                        odd++
                                    }
                                    x++
                                } else {
                                    if (values.toInt() % 2 == 0) {
                                        pairs++
                                    } else {
                                        odd++
                                    }
                                    outcome = "The number of pairs is: $pairs\n" +
                                            "The amount of odd is: $odd"
                                    x = 1
                                    pairs = 0
                                    odd = 0
                                }
                                values = ""
                            } else {
                                outcome = "Introduce correct parameters"
                                values = ""
                                amountValues = ""
                            }
                        },
                        modifier = Modifier.padding(10.dp),

                    ) {
                        Text(text = "Enter")
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

                var note1 by remember { mutableStateOf("") }
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
                    value = note1,
                    onValueChange = { note1 = it },
                    label = {
                        Text("First number")
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

                            if (note1.toIntOrNull() != null) {

                                var result1: Int
                                if (note1.toInt() < 10) {
                                    result1 = 1
                                    catena += "The number $note1 has $result1 digits"
                                } else if (note1.toInt() < 100) {
                                    result1 = 2
                                    catena += "The number $note1 has $result1 digits"
                                } else if (note1.toInt() < 1000) {
                                    result1 = 3
                                    catena += "The number $note1 has $result1 digits"
                                }else {
                                    catena += "The number $note1 is out of range"
                                }
                            } else {
                                catena += "Some field is empty"
                            }
                            outcome = catena

                        },
                        modifier = Modifier.padding(10.dp)
                    ) {
                        Text(text = "Claculate")
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
