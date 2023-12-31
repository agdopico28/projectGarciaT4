package com.example.proyectogarciat4.U11

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

/**Read a number of bases and heights of a triangle and report the area*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project52() {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Top
            ) {

                var amountTriangles by remember { mutableStateOf("") }
                var height by remember { mutableStateOf("") }
                var base by remember { mutableStateOf("") }
                var outcome by remember { mutableStateOf("") }
                var x by remember { mutableStateOf(1) }
                var aboveTwelve by remember { mutableStateOf(0) }

                Row(
                    Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                )
                {
                    Text(
                        text = "Project 52",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                OutlinedTextField(
                    value = amountTriangles,
                    onValueChange = { amountTriangles = it },
                    label = {
                        Text("Amount of triangles")
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
                    value = base,
                    onValueChange = { base = it },
                    label = {
                        Text("Base")
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
                    value = height,
                    onValueChange = { height = it },
                    label = {
                        Text("Height")
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
                            if (height.toFloatOrNull() != null && base.toFloatOrNull() != null && amountTriangles.toIntOrNull() != null) {
                                if (x < amountTriangles.toInt()) {
                                    val left = amountTriangles.toInt() - x

                                    val surface = (base.toFloat() * height.toFloat()) / 2
                                    outcome = "$left triangles left\n" +
                                            "The surface is: $surface"
                                    if (surface > 12) {
                                        aboveTwelve++
                                    }
                                    x++
                                } else {
                                    val surface = (base.toFloat() * height.toFloat()) / 2
                                    if (surface > 12) {
                                        aboveTwelve++
                                    }
                                    outcome = "The surface is: $surface\n" +
                                            "The amount above 12 cm is: $aboveTwelve"

                                    x = 1
                                    aboveTwelve = 0
                                }
                                height = ""
                                base = ""
                            } else {
                                outcome = "Introduce correct parameters"
                                height = ""
                                base = ""
                                amountTriangles = ""
                            }
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
                var amountTriangles by remember { mutableStateOf("") }
                var height by remember { mutableStateOf("") }
                var base by remember { mutableStateOf("") }
                var outcome by remember { mutableStateOf("") }
                var x by remember { mutableStateOf(1) }
                var aboveTwelve by remember { mutableStateOf(0) }

                Row(
                    Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                )
                {
                    Text(
                        text = "Project 52",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                OutlinedTextField(
                    value = amountTriangles,
                    onValueChange = { amountTriangles = it },
                    label = {
                        Text("Amount of triangles")
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
                    value = base,
                    onValueChange = { base = it },
                    label = {
                        Text("Base")
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
                    value = height,
                    onValueChange = { height = it },
                    label = {
                        Text("Height")
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
                            if (height.toFloatOrNull() != null && base.toFloatOrNull() != null && amountTriangles.toIntOrNull() != null) {
                                if (x < amountTriangles.toInt()) {
                                    val left = amountTriangles.toInt() - x

                                    val surface = (base.toFloat() * height.toFloat()) / 2
                                    outcome = "$left triangles left\n" +
                                            "The surface is: $surface"
                                    if (surface > 12) {
                                        aboveTwelve++
                                    }
                                    x++
                                } else {
                                    val surface = (base.toFloat() * height.toFloat()) / 2
                                    if (surface > 12) {
                                        aboveTwelve++
                                    }
                                    outcome = "The surface is: $surface\n" +
                                            "The amount above 12 cm is: $aboveTwelve"

                                    x = 1
                                    aboveTwelve = 0
                                }
                                height = ""
                                base = ""
                            } else {
                                outcome = "Introduce correct parameters"
                                height = ""
                                base = ""
                                amountTriangles = ""
                            }
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