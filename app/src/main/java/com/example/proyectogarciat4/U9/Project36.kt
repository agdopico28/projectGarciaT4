package com.example.proyectogarciat4.U9

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
fun Project36() {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top
            ) {

                var height by remember { mutableStateOf("") }
                var people by remember { mutableStateOf("") }
                var x by remember { mutableStateOf(1) }
                var totalHeight by remember { mutableStateOf(0.0) }
                var outcome by remember { mutableStateOf("Inconclusive") }

                Row(
                    Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                )
                {
                    Text(
                        text = "Project 36",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }


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
                            if (height.toFloatOrNull() != null && people.toIntOrNull() != null) {
                                if (x < people.toInt()) {
                                    val left = people.toInt() - x
                                    outcome = "$left height/s left"
                                    totalHeight += height.toFloat()
                                    x++
                                } else {
                                    totalHeight += height.toFloat()
                                    val averageHeight = totalHeight / people.toInt()
                                    outcome = "The average height is: $averageHeight"
                                    x = 1
                                    totalHeight = 0.0
                                }
                                height = ""
                            } else {
                                outcome = "Introduce correct parameters"
                                height = ""
                                people = ""
                            }
                        },
                        modifier = Modifier.padding(10.dp),

                        ) {
                        Text(text = "Calculate")
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

                var height by remember { mutableStateOf("") }
                var people by remember { mutableStateOf("") }
                var x by remember { mutableStateOf(1) }
                var totalHeight by remember { mutableStateOf(0.0) }
                var outcome by remember { mutableStateOf("Inconclusive") }

                Row(
                    Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                )
                {
                    Text(
                        text = "Project 36",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }


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
                            if (height.toFloatOrNull() != null && people.toIntOrNull() != null) {
                                if (x < people.toInt()) {
                                    val left = people.toInt() - x
                                    outcome = "$left height/s left"
                                    totalHeight += height.toFloat()
                                    x++
                                } else {
                                    totalHeight += height.toFloat()
                                    val averageHeight = totalHeight / people.toInt()
                                    outcome = "The average height is: $averageHeight"
                                    x = 1
                                    totalHeight = 0.0
                                }
                                height = ""
                            } else {
                                outcome = "Introduce correct parameters"
                                height = ""
                                people = ""
                            }
                        },
                        modifier = Modifier.padding(10.dp),

                    ) {
                        Text(text = "Calculate")
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
