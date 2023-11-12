package com.example.proyectogarciat4.U45

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
import com.example.proyectogarciat4.U42.amountAbove
import com.example.proyectogarciat4.ui.theme.Blue20

/**Generates a list with 100 elements, with values between 1 and 20.
 * The program shows the entire list that has been randomly generated and the number of numbers that have come out between 1-4, 5-8 and 10-13 and if the value 20 is on the list.*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project178() {
    val configuration = LocalConfiguration.current
    var age by remember { mutableStateOf("") }
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
                        text = "Project 178",
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
                            val list = List(100) { ((Math.random() * 21)).toInt() }
                            outcome += "Actual List:\n"
                            outcome += "$list"
                            var cant1 = 0
                            var cant2 = 0
                            var cant3 = 0
                            list.forEach {
                                when (it) {
                                    in 1..4 -> cant1++
                                    in 5..8 -> cant2++
                                    in 10..13 -> cant3++
                                }
                            }
                            outcome += "\nAmount between 1 and 4: $cant1\n" +
                                    "Amount between 5 and 8: $cant2\n" +
                                    "Amount between 10 and 13: $cant3\n"
                            if (list.contains(20)) {
                                outcome += "The list contains 20"
                            } else {
                                outcome += "The list doesn't contain 20"
                            }

                        },
                        modifier = Modifier.padding(10.dp),


                        ) {
                        Text(text = "Enter")
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
                        text = "Project 178",
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
                            val list = List(100) { ((Math.random() * 21)).toInt() }
                            outcome += "Actual List:\n"
                            outcome += "$list"
                            var cant1 = 0
                            var cant2 = 0
                            var cant3 = 0
                            list.forEach {
                                when (it) {
                                    in 1..4 -> cant1++
                                    in 5..8 -> cant2++
                                    in 10..13 -> cant3++
                                }
                            }
                            outcome += "\nAmount between 1 and 4: $cant1\n" +
                                    "Amount between 5 and 8: $cant2\n" +
                                    "Amount between 10 and 13: $cant3\n"
                            if (list.contains(20)) {
                                outcome += "The list contains 20"
                            } else {
                                outcome += "The list doesn't contain 20"
                            }

                        },
                        modifier = Modifier.padding(10.dp),


                        ) {
                        Text(text = "Enter")
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

