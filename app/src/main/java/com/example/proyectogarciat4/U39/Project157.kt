package com.example.proyectogarciat4.U39

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectogarciat4.ui.theme.Blue20

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project157() {
    val configuration = LocalConfiguration.current
    var vectorValues by remember { mutableStateOf("") }
    var vectorCount by remember { mutableStateOf(0) }
    var vector = Array(5) { Dice157() }
    var outcome by remember { mutableStateOf("") }
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
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
                        text = "Project 157",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                OutlinedTextField(
                    value = vectorValues,
                    onValueChange = {
                        vectorValues = it
                    },
                    label = {
                        Text("Enter element")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {
                            if (vectorCount < 5) {
                                val element = vectorValues.toIntOrNull() ?: 0
                                vector[vectorCount].valor = element
                                vectorValues = ""
                                vectorCount++

                                if (vectorCount == 5) {
                                    // Print the values of the dice
                                    for (i in vector.indices) {
                                        vector[i].throwDice()
                                        vector[i].printValue()
                                    }

                                    val count1 = vector.count { it.valor == 1 }
                                    val count2 = vector.count { it.valor == 2 }
                                    val count3 = vector.count { it.valor == 3 }
                                    val count4 = vector.count { it.valor == 4 }
                                    val count5 = vector.count { it.valor == 5 }
                                    val count6 = vector.count { it.valor == 6 }

                                    outcome = "Occurrences:\n " +
                                            "1: $count1 \n " +
                                            "2: $count2 \n " +
                                            "3: $count3 \n " +
                                            "4: $count4 \n " +
                                            "5: $count5 \n " +
                                            "6: $count6"
                                }
                            }
                        },
                        modifier = Modifier.padding(10.dp),


                        ) {
                        Text(text = "Calculate")
                    }
                }
                Text(
                    text = outcome,
                    modifier = Modifier.padding(20.dp),
                )
            }
        }


        else -> {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
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
                        text = "Project 157",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                OutlinedTextField(
                    value = vectorValues,
                    onValueChange = {
                        vectorValues = it
                    },
                    label = {
                        Text("Enter element")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {
                            if (vectorCount < 5) {
                                val element = vectorValues.toIntOrNull() ?: 0
                                vector[vectorCount].valor = element
                                vectorValues = ""
                                vectorCount++

                                if (vectorCount == 5) {
                                    // Print the values of the dice
                                    for (i in vector.indices) {
                                        vector[i].throwDice()
                                        vector[i].printValue()
                                    }

                                    val count1 = vector.count { it.valor == 1 }
                                    val count2 = vector.count { it.valor == 2 }
                                    val count3 = vector.count { it.valor == 3 }
                                    val count4 = vector.count { it.valor == 4 }
                                    val count5 = vector.count { it.valor == 5 }
                                    val count6 = vector.count { it.valor == 6 }

                                    outcome = "Occurrences:\n " +
                                            "1: $count1 \n " +
                                            "2: $count2 \n " +
                                            "3: $count3 \n " +
                                            "4: $count4 \n " +
                                            "5: $count5 \n " +
                                            "6: $count6"
                                }
                            }
                        },
                        modifier = Modifier.padding(10.dp),


                        ) {
                        Text(text = "Calculate")
                    }
                }
                Text(
                    text = outcome,
                    modifier = Modifier.padding(20.dp),
                )
            }
        }
    }
}

private class Dice157 {
    var valor: Int = 1

    fun throwDice() {
        valor = (1..6).random()
    }

    fun printValue() {
        println("Valor del dado: $valor")
    }
}