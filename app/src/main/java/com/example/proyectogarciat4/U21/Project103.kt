package com.example.proyectogarciat4.U21

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
fun Project103() {
    val configuration = LocalConfiguration.current
    var x by remember { mutableStateOf(1) }
    var numbers by remember { mutableStateOf("") }
    var accumulator by remember { mutableStateOf(0) }
    var over36 by remember { mutableStateOf(0) }
    var over50 by remember { mutableStateOf(0) }
    var outcome by remember { mutableStateOf("Enter 8 numbers") }
    var left by remember { mutableStateOf(8) }
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
                        text = "Project 103",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }



                OutlinedTextField(
                    value = numbers,
                    onValueChange = { numbers = it },
                    label = {
                        Text("Numbers")
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
                            if ( numbers.toIntOrNull() != null) {
                                if (x < 8) {
                                    left--
                                    outcome = "$left number/s left"
                                    x++
                                    accumulator += numbers.toInt()
                                    if(numbers.toInt() > 36){
                                        over36 += numbers.toInt()
                                    }
                                    if(numbers.toInt() > 50){
                                        over50++
                                    }
                                } else {
                                    accumulator += numbers.toInt()
                                    if(numbers.toInt() > 36){
                                        over36 += numbers.toInt()
                                    }
                                    if(numbers.toInt() > 50){
                                        over50++
                                    }
                                    outcome = "Cumulative value of all values: $accumulator\n"+
                                            "Accumulated value of elements that are greater than 36: $over36 \n"+
                                            "Number of values greater than 50: $over50"
                                    x = 1
                                    left = 8
                                }
                                numbers = ""
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
                        text = "Project 103",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }



                OutlinedTextField(
                    value = numbers,
                    onValueChange = { numbers = it },
                    label = {
                        Text("Numbers")
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
                            if ( numbers.toIntOrNull() != null) {
                                if (x < 8) {
                                    left--
                                    outcome = "$left number/s left"
                                    x++
                                    accumulator += numbers.toInt()
                                    if(numbers.toInt() > 36){
                                        over36 += numbers.toInt()
                                    }
                                    if(numbers.toInt() > 50){
                                        over50++
                                    }
                                } else {
                                    accumulator += numbers.toInt()
                                    if(numbers.toInt() > 36){
                                        over36 += numbers.toInt()
                                    }
                                    if(numbers.toInt() > 50){
                                        over50++
                                    }
                                    outcome = "Cumulative value of all values: $accumulator\n"+
                                            "Accumulated value of elements that are greater than 36: $over36 \n"+
                                            "Number of values greater than 50: $over50"
                                    x = 1
                                    left = 8
                                }
                                numbers = ""
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
                    modifier = Modifier.padding(bottom = 20.dp),
                )
            }
        }
    }
}