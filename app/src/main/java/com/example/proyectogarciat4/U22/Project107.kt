package com.example.proyectogarciat4.U22

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
fun Project107() {
    val configuration = LocalConfiguration.current
    var x by remember { mutableStateOf(1) }
    var arraySize by remember { mutableStateOf("") }
    var numValue by remember { mutableStateOf("") }
    var numArray  by remember { mutableStateOf<IntArray?>(null) }
    var arrayEnter by remember { mutableStateOf(true) }
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
                        text = "Project 107",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }






                OutlinedTextField(
                    value = arraySize,
                    onValueChange = { arraySize = it },
                    label = {
                        Text("Number one")
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
                            if (arraySize.toIntOrNull() != null) {
                                arrayEnter = false
                                if (x <= arraySize.toInt()) {
                                    if (numArray == null) {
                                        numArray = IntArray(arraySize.toInt())
                                    }
                                    numArray!![x - 1] = numValue.toInt()
                                    x++
                                    numValue = ""
                                    if (x > arraySize.toInt()) {
                                        val sum = numArray?.sum() ?: 0
                                        outcome =
                                            "Array creation completed. Sum of array elements: $sum"
                                        arraySize = ""
                                        x = 1
                                        numArray = null
                                        arrayEnter = true
                                    }
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
                    value = arraySize,
                    onValueChange = { arraySize = it },
                    label = {
                        Text("Number one")
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
                            if (arraySize.toIntOrNull() != null) {
                                arrayEnter = false
                                if (x <= arraySize.toInt()) {
                                    if (numArray == null) {
                                        numArray = IntArray(arraySize.toInt())
                                    }
                                    numArray!![x - 1] = numValue.toInt()
                                    x++
                                    numValue = ""
                                    if (x > arraySize.toInt()) {
                                        val sum = numArray?.sum() ?: 0
                                        outcome =
                                            "Array creation completed. Sum of array elements: $sum"
                                        arraySize = ""
                                        x = 1
                                        numArray = null
                                        arrayEnter = true
                                    }
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
    }
}