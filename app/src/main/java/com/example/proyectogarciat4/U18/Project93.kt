package com.example.proyectogarciat4.U18

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
fun Project93() {
    val configuration = LocalConfiguration.current
    var firstNumber by remember { mutableStateOf("") }
    var secondNumber by remember { mutableStateOf("") }
    var thirdNumber by remember { mutableStateOf("0") }
    var fourthNumber by remember { mutableStateOf("0") }
    var fifthNumber by remember { mutableStateOf("0") }
    var outcome by remember { mutableStateOf("") }
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Top
            ) {
                Row(
                    Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                )
                {
                    Text(
                        text = "Project 90",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }



                OutlinedTextField(
                    value = firstNumber,
                    onValueChange = { firstNumber = it },
                    label = {
                        Text("First Number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                )
                OutlinedTextField(
                    value = secondNumber,
                    onValueChange = { secondNumber = it },
                    label = {
                        Text("Second Number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                )
                OutlinedTextField(
                    value = thirdNumber,
                    onValueChange = { thirdNumber = it },
                    label = {
                        Text("Third Number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                )
                OutlinedTextField(
                    value = fourthNumber,
                    onValueChange = { fourthNumber = it },
                    label = {
                        Text("Fourth Number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                )
                OutlinedTextField(
                    value = fifthNumber,
                    onValueChange = { fifthNumber = it },
                    label = {
                        Text("Fifth Number")
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
                            outcome = if (secondNumber.toFloatOrNull() != null && firstNumber.toFloatOrNull() != null) {
                                val sum = firstNumber.toFloat() + secondNumber.toFloat() +
                                        thirdNumber.toFloat() + fourthNumber.toFloat() +
                                        fifthNumber.toFloat()
                                "The sum of the values is: $sum"
                            } else {
                                "Introduce at least two numbers please"
                            }
                            firstNumber = ""
                            secondNumber = ""
                            thirdNumber = "0"
                            fourthNumber = "0"
                            fifthNumber = "0"
                        },
                        modifier = Modifier.padding(10.dp),

                    ) {
                        Text(text = "Enter")
                    }
                }
                Text(
                    text = outcome,
                    modifier = Modifier.padding(bottom = 20.dp),
                )
            }
        }

        else -> {
            Column(
                modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Top
            ) {

                Row(
                    Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                )
                {
                    Text(
                        text = "Project 90",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }



                OutlinedTextField(
                    value = firstNumber,
                    onValueChange = { firstNumber = it },
                    label = {
                        Text("First Number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                    )
                OutlinedTextField(
                    value = secondNumber,
                    onValueChange = { secondNumber = it },
                    label = {
                        Text("Second Number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                    )
                OutlinedTextField(
                    value = thirdNumber,
                    onValueChange = { thirdNumber = it },
                    label = {
                        Text("Third Number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                    )
                OutlinedTextField(
                    value = fourthNumber,
                    onValueChange = { fourthNumber = it },
                    label = {
                        Text("Fourth Number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                    )
                OutlinedTextField(
                    value = fifthNumber,
                    onValueChange = { fifthNumber = it },
                    label = {
                        Text("Fifth Number")
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
                            outcome = if (secondNumber.toFloatOrNull() != null && firstNumber.toFloatOrNull() != null) {
                                val sum = firstNumber.toFloat() + secondNumber.toFloat() +
                                        thirdNumber.toFloat() + fourthNumber.toFloat() +
                                        fifthNumber.toFloat()
                                "The sum of the values is: $sum"
                            } else {
                                "Introduce at least two numbers please"
                            }
                            firstNumber = ""
                            secondNumber = ""
                            thirdNumber = "0"
                            fourthNumber = "0"
                            fifthNumber = "0"
                        },
                        modifier = Modifier.padding(10.dp),

                        ) {
                        Text(text = "Enter")
                    }
                }
                Text(
                    text = outcome,
                    modifier = Modifier.padding(bottom = 20.dp),
                )
            }
        }
    }
}