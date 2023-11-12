package com.example.proyectogarciat4.U37

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectogarciat4.ui.theme.Blue20
import kotlin.random.Random

/**We create an array of 10 values and fill it with random numbers then we check the values that are multiples of 2,
 * multiples of 3 or 5, values greater than or equal to 50 and the values included 1-10,20-30, 90-95 . The program prints all this on the screen*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project150() {
    val configuration = LocalConfiguration.current
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
                        text = "Project 150",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {
                            outcome = ""
                            val vector = IntArray(10)
                            for (i in vector.indices) {
                                vector[i] = ((Math.random() * 100)).toInt()
                            }

                            outcome += "Multiples 2:\n${printIf(vector) { x -> x % 2 == 0 }}\n"
                            outcome += "Multiples 3 or 5:\n${printIf(vector) { x -> x % 3 == 0 || x % 5 == 0 }}\n"
                            outcome += "Greater than or equal to 50:\n${printIf(vector) { x -> x >= 50}}\n"
                            outcome += "Values between 1-10,20-30,90-95:\n${
                                printIf(vector) { x ->
                                    when (x) {
                                        in 1..10 -> true
                                        in 20..30 -> true
                                        in 90..95 -> true
                                        else -> false
                                    }
                                }
                            }\n"
                            outcome += "All values:\n${printIf(vector) { true }}\n"

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
                        text = "Project 150",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }


                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {
                            outcome = ""
                            val vector = IntArray(10)
                            for (i in vector.indices) {
                                vector[i] = ((Math.random() * 100)).toInt()
                            }

                            outcome += "Multiples 2:\n${printIf(vector) { x -> x % 2 == 0 }}\n"
                            outcome += "Multiples 3 or 5:\n${printIf(vector) { x -> x % 3 == 0 || x % 5 == 0 }}\n"
                            outcome += "Greater than or equal to 50:\n${printIf(vector) { x -> x >= 50}}\n"
                            outcome += "Values between 1-10,20-30,90-95:\n${
                                printIf(vector) { x ->
                                    when (x) {
                                        in 1..10 -> true
                                        in 20..30 -> true
                                        in 90..95 -> true
                                        else -> false
                                    }
                                }
                            }\n"
                            outcome += "All values:\n${printIf(vector) { true }}\n"

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

fun printIf(
    vector: IntArray,
    fn: (Int) -> Boolean //Important to be able to create the function and make it work
): String
{
    var aux = ""
    for (element in vector) {
        if (fn(element)) {
            aux += "$element\n"
        }
    }
    return aux
}