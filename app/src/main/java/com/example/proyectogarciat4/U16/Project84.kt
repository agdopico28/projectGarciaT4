package com.example.proyectogarciat4.U16

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
fun Project84() {
    val configuration = LocalConfiguration.current
    var side1 by remember { mutableStateOf("") }
    var side2 by remember { mutableStateOf("") }
    var outcome by remember { mutableStateOf("") }
    var x by remember { mutableStateOf(1) }
    var perimeter by remember { mutableStateOf(0.00) }
    var left by remember { mutableStateOf(2) }
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
                        text = "Project 83",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }



                OutlinedTextField(
                    value = side1,
                    onValueChange = { side1 = it },
                    label = {
                        Text("Side one of rectangle")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                    )

                OutlinedTextField(
                    value = side2,
                    onValueChange = { side2 = it },
                    label = {
                        Text("Side two of rectangle")
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
                            if (side1.toFloatOrNull() != null) {
                                if (x < 2) {
                                    left--
                                    outcome = "$left rectangles left"
                                    perimeter = ((side1.toFloat() ) * (side2.toFloat())).toDouble()
                                    x++
                                }else{
                                    val perimeter2 = ((side1.toFloat() ) * (side2.toFloat())).toDouble()
                                    outcome = if (perimeter > perimeter2){
                                        "The first rectangle is the largest"
                                    }else{
                                        "The second rectangle is the largest"
                                    }
                                }
                               x = 1
                                left = 2


                            } else {
                                outcome = "Enter numbers"
                            }
                            side1 = ""
                            side2 = ""
                        },
                        modifier = Modifier.padding(10.dp),

                        ) {
                        Text(text = "Calculate")
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
                        text = "Project 83",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }



                OutlinedTextField(
                    value = side1,
                    onValueChange = { side1 = it },
                    label = {
                        Text("Side of square")
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
                            if (side1.toFloatOrNull() != null) {
                                val perimeter = side1.toFloat() * side1.toFloat() * side1.toFloat() * side1.toFloat()
                                outcome = "The perimeter of the square is: $perimeter"
                            } else {
                                outcome = "Enter numbers"
                            }
                            side1 = ""
                        },
                        modifier = Modifier.padding(10.dp),

                        ) {
                        Text(text = "Calculate")
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