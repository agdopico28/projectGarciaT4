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

/**You enter coordinates and check which plane it belongs to*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project57() {
    val configuration = LocalConfiguration.current
    var coordinates by remember { mutableStateOf("") }
    var pointX by remember { mutableStateOf("") }
    var pointY by remember { mutableStateOf("") }
    var outcome by remember { mutableStateOf("") }
    var x by remember { mutableStateOf(1) }
    var firstQuadrant by remember { mutableStateOf(0) }
    var secondQuadrant by remember { mutableStateOf(0) }
    var thirdQuadrant by remember { mutableStateOf(0) }
    var fourthQuadrant by remember { mutableStateOf(0) }
    var aboveTwelve by remember { mutableStateOf(0) }

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
                        text = "Project 57",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                OutlinedTextField(
                    value = coordinates,
                    onValueChange = { coordinates = it },
                    label = {
                        Text("Coordinates")
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
                    value = pointY,
                    onValueChange = { pointY = it },
                    label = {
                        Text("Y")
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
                    value = pointX,
                    onValueChange = { pointX = it },
                    label = {
                        Text("X")
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
                            if (pointX.toFloatOrNull() != null && pointY.toFloatOrNull() != null && coordinates.toIntOrNull() != null) {
                                if (x < coordinates.toInt()) {
                                    val left = coordinates.toInt() - x
                                    outcome = "$left triangles left\n"
                                    if (pointX.toFloat() > 0.0) {
                                        if (pointY.toFloat() > 0) {
                                            firstQuadrant++
                                        } else {
                                            secondQuadrant++
                                        }
                                    } else {
                                        if (pointY.toFloat() < 0) {
                                            thirdQuadrant++
                                        }else {
                                            fourthQuadrant++
                                        }
                                    }
                                    x++
                                } else {
                                    if (pointX.toFloat() > 0.0) {
                                        if (pointY.toFloat() > 0) {
                                            firstQuadrant++
                                        } else {
                                            secondQuadrant++
                                        }
                                    } else {
                                        if (pointY.toFloat() < 0) {
                                            thirdQuadrant++
                                        }else {
                                            fourthQuadrant++
                                        }
                                    }
                                    outcome = "First Quadrant: $firstQuadrant\n" +
                                            "Second Quadrant: $secondQuadrant\n" +
                                            "Third Quadrant: $thirdQuadrant\n" +
                                            "Fourth Quadrant: $fourthQuadrant"

                                    x = 1
                                    aboveTwelve = 0
                                    firstQuadrant = 0
                                    secondQuadrant = 0
                                    thirdQuadrant = 0
                                    fourthQuadrant = 0
                                }
                                pointX = ""
                                pointY = ""
                            } else {
                                outcome = "Introduce correct parameters"
                                pointX = ""
                                pointY = ""
                                coordinates = ""
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
                Row(
                    Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                )
                {
                    Text(
                        text = "Project 57",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                OutlinedTextField(
                    value = coordinates,
                    onValueChange = { coordinates = it },
                    label = {
                        Text("Coordinates")
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
                    value = pointY,
                    onValueChange = { pointY = it },
                    label = {
                        Text("Y")
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
                    value = pointX,
                    onValueChange = { pointX = it },
                    label = {
                        Text("X")
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
                            if (pointX.toFloatOrNull() != null && pointY.toFloatOrNull() != null && coordinates.toIntOrNull() != null) {
                                if (x < coordinates.toInt()) {
                                    val left = coordinates.toInt() - x
                                    outcome = "$left triangles left\n"
                                    if (pointX.toFloat() > 0.0) {
                                        if (pointY.toFloat() > 0) {
                                            firstQuadrant++
                                        } else {
                                            secondQuadrant++
                                        }
                                    } else {
                                        if (pointY.toFloat() < 0) {
                                            thirdQuadrant++
                                        }else {
                                            fourthQuadrant++
                                        }
                                    }
                                    x++
                                } else {
                                    if (pointX.toFloat() > 0.0) {
                                        if (pointY.toFloat() > 0) {
                                            firstQuadrant++
                                        } else {
                                            secondQuadrant++
                                        }
                                    } else {
                                        if (pointY.toFloat() < 0) {
                                            thirdQuadrant++
                                        }else {
                                            fourthQuadrant++
                                        }
                                    }
                                    outcome = "First Quadrant: $firstQuadrant\n" +
                                            "Second Quadrant: $secondQuadrant\n" +
                                            "Third Quadrant: $thirdQuadrant\n" +
                                            "Fourth Quadrant: $fourthQuadrant"

                                    x = 1
                                    aboveTwelve = 0
                                    firstQuadrant = 0
                                    secondQuadrant = 0
                                    thirdQuadrant = 0
                                    fourthQuadrant = 0
                                }
                                pointX = ""
                                pointY = ""
                            } else {
                                outcome = "Introduce correct parameters"
                                pointX = ""
                                pointY = ""
                                coordinates = ""
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