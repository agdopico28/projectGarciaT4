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

/**Stores five values in each list in two lists.
 * Prints which of the two lists has the largest cumulative value
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project40() {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top
            ) {

                var secondList by remember { mutableStateOf("") }
                var firstList by remember { mutableStateOf("") }
                var outcome by remember { mutableStateOf("") }
                var x by remember { mutableStateOf(1) }
                var totalList1 by remember { mutableStateOf(0.00) }
                var totalList2 by remember { mutableStateOf(0.00) }

                Row(
                    Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                )
                {
                    Text(
                        text = "Project 40",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }


                OutlinedTextField(
                    value = firstList,
                    onValueChange = { firstList = it },
                    label = {
                        Text("First List")
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
                    value = secondList,
                    onValueChange = { secondList = it },
                    label = {
                        Text("Second List")
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
                            if (secondList.toFloatOrNull() != null && firstList.toFloatOrNull() != null) {
                                if (x < 5) {
                                    val left = 5 - x
                                    outcome = "$left number/s left"
                                    totalList1 += firstList.toFloat()
                                    totalList2 += secondList.toFloat()
                                    x++
                                } else {
                                    totalList1 += firstList.toFloat()
                                    totalList2 += secondList.toFloat()
                                    outcome = if (totalList1 > totalList2) {
                                        "The biggest list is the first"
                                    } else if (totalList2 > totalList1){
                                        "The biggest list is the second"
                                    } else {
                                        "The lisThe lists are equal."
                                    }
                                    x = 1
                                    totalList1 = 0.0
                                    totalList2 = 0.0
                                }
                                secondList = ""
                                firstList = ""
                            } else {
                                outcome = "Introduce correct parameters"
                                secondList = ""
                                firstList = ""
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

                var secondList by remember { mutableStateOf("") }
                var firstList by remember { mutableStateOf("") }
                var outcome by remember { mutableStateOf("") }
                var x by remember { mutableStateOf(1) }
                var totalList1 by remember { mutableStateOf(0.00) }
                var totalList2 by remember { mutableStateOf(0.00) }

                Row(
                    Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                )
                {
                    Text(
                        text = "Project 40",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }


                OutlinedTextField(
                    value = firstList,
                    onValueChange = { firstList = it },
                    label = {
                        Text("First List")
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
                    value = secondList,
                    onValueChange = { secondList = it },
                    label = {
                        Text("Second List")
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
                            if (secondList.toFloatOrNull() != null && firstList.toFloatOrNull() != null) {
                                if (x < 5) {
                                    val left = 5 - x
                                    outcome = "$left number/s left"
                                    totalList1 += firstList.toFloat()
                                    totalList2 += secondList.toFloat()
                                    x++
                                } else {
                                    totalList1 += firstList.toFloat()
                                    totalList2 += secondList.toFloat()
                                    outcome = if (totalList1 > totalList2) {
                                        "The biggest list is the first"
                                    } else if (totalList2 > totalList1){
                                        "The biggest list is the second"
                                    } else {
                                        "The lisThe lists are equal."
                                    }
                                    x = 1
                                    totalList1 = 0.0
                                    totalList2 = 0.0
                                }
                                secondList = ""
                                firstList = ""
                            } else {
                                outcome = "Introduce correct parameters"
                                secondList = ""
                                firstList = ""
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
    }
}
