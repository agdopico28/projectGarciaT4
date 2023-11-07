package com.example.proyectogarciat4.U22

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

/**We load an array with the values entered by keyboard and print the smallest element and if it is repeated within the array*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project108() {
    val configuration = LocalConfiguration.current
    var number1 by remember { mutableStateOf("") }
    var outcome by remember { mutableStateOf("Enter numbers") }
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
                        text = "Project 108",
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
                        Text("Numbers")
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
                            if (number1.toIntOrNull() != null) {
                                val numbers = load(number1)
                                if (numbers.isNotEmpty()) {
                                    val minElement = minor(numbers)
                                    val seRepite = repeat(numbers, minElement)
                                    outcome = "The largest element is: $minElement" +
                                            if (seRepite) "\nThe largest element is repeated in the array." else "\nThe largest element is not repeated in the array."
                                } else {
                                    outcome = "Please enter some numbers."
                                }
                            } else {
                                outcome = "Introduce numbers please"
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
                        text = "Project 107",
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
                        Text("Numbers")
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
                                val numbers = load(number1)
                                if (numbers.isNotEmpty()) {
                                    val minElement = minor(numbers)
                                    val isRepeated = repeat(numbers, minElement)
                                    outcome = "The largest element is: $minElement" +
                                            if (isRepeated) "\nThe largest element is repeated in the array." else "\nThe largest element is not repeated in the array."
                                } else {
                                    outcome = "Please enter some numbers."
                                }
                        },
                        modifier = Modifier.padding(10.dp),


                        ) {
                        Text(text = "Find Smaller")
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

private fun load(input: String): IntArray {
    return input.split(",").mapNotNull { it.trim().toIntOrNull() }.toIntArray()
}

private fun minor(vector: IntArray): Int {
    return vector.minOrNull() ?: vector[0] // Handle the case where the array is empty
}

private fun repeat(vector: IntArray, buscar: Int): Boolean {
    return vector.count { it == buscar } > 1
}