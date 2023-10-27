package com.example.proyectogarciat4.U11

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
fun Project58() {
    val configuration = LocalConfiguration.current
    var number by remember { mutableStateOf("") }
    var outcome by remember { mutableStateOf("") }
    var x by remember { mutableStateOf(1) }
    var negative by remember { mutableStateOf(0) }
    var positive by remember { mutableStateOf(0) }
    var multiple by remember { mutableStateOf(0) }
    var addition by remember { mutableStateOf(0.0) }
    var left by remember { mutableStateOf(10) }
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
                        text = "Project 58",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }


                OutlinedTextField(
                    value = number,
                    onValueChange = { number = it },
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
                            if (number.toFloatOrNull() != null) {
                                if (x < 10){
                                    left--
                                    outcome = "$left number/s left"
                                    if (number.toFloat() < 0) {
                                        negative++
                                    }
                                    if (number.toFloat() > 0) {
                                        positive++
                                    }
                                    if (number.toInt() % 15 == 0) {
                                        multiple++
                                    }
                                    addition += number.toFloat()
                                    x++
                                } else {
                                    if (number.toFloat() < 0) {
                                        negative++
                                    }
                                    if (number.toFloat() > 0) {
                                        positive++
                                    }
                                    if (number.toInt() % 15 == 0) {
                                        multiple++
                                    }
                                    addition += number.toFloat()
                                    outcome = "Positives: $positive\n" +
                                            "Negative: $negative\n" +
                                            "Multiple of 15: $multiple\n" +
                                            "Total amount: $addition"
                                    positive = 0
                                    negative = 0
                                    multiple = 0
                                    addition = 0.0
                                    x = 1
                                    left = 10
                                }
                            } else {
                                outcome = "Introduce a number"
                            }
                            number = ""
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
                        text = "Project 58",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }


                OutlinedTextField(
                    value = number,
                    onValueChange = { number = it },
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
                            if (number.toFloatOrNull() != null) {
                                if (x < 10){
                                    left--
                                    outcome = "$left number/s left"
                                    if (number.toFloat() < 0) {
                                        negative++
                                    }
                                    if (number.toFloat() > 0) {
                                        positive++
                                    }
                                    if (number.toInt() % 15 == 0) {
                                        multiple++
                                    }
                                    addition += number.toFloat()
                                    x++
                                } else {
                                    if (number.toFloat() < 0) {
                                        negative++
                                    }
                                    if (number.toFloat() > 0) {
                                        positive++
                                    }
                                    if (number.toInt() % 15 == 0) {
                                        multiple++
                                    }
                                    addition += number.toFloat()
                                    outcome = "Positives: $positive\n" +
                                            "Negative: $negative\n" +
                                            "Multiple of 15: $multiple\n" +
                                            "Total amount: $addition"
                                    positive = 0
                                    negative = 0
                                    multiple = 0
                                    addition = 0.0
                                    x = 1
                                    left = 10
                                }
                            } else {
                                outcome = "Introduce a number"
                            }
                            number = ""
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
    }
}