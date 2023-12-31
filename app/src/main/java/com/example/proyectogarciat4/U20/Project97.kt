package com.example.proyectogarciat4.U20

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

/**You enter two integers and it shows us the largest.
 * It does it with 5 pairs of values
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project97() {
    val configuration = LocalConfiguration.current
    var x by remember { mutableStateOf(1) }
    var firstNumber by remember { mutableStateOf("") }
    var secondNumber by remember { mutableStateOf("") }
    var outcome by remember { mutableStateOf("") }
    var left by remember { mutableStateOf(5) }
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
                        text = "Project 97",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }



                OutlinedTextField(
                    value = firstNumber,
                    onValueChange = { firstNumber = it },
                    label = {
                        Text("First number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                    )
                OutlinedTextField(
                    value = secondNumber,
                    onValueChange = { secondNumber = it },
                    label = {
                        Text("Second number")
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
                            outcome = ""
                            if (secondNumber.toFloatOrNull() != null && firstNumber.toFloatOrNull() != null) {
                                if (x < 5) {
                                    left--
                                    outcome = "$left pair/s of number/s left"
                                    if(firstNumber.toFloat() == secondNumber.toFloat()){
                                        outcome = "Both numbers are equal"
                                    }else if(firstNumber.toFloat() > secondNumber.toFloat()){
                                        outcome = "$firstNumber is greater than $secondNumber"
                                    }else{
                                        outcome = "$secondNumber is greater than $firstNumber"
                                    }
                                    x++
                                } else {
                                    if(firstNumber.toFloat() == secondNumber.toFloat()){
                                        outcome = "Both numbers are equal"
                                    }else if(firstNumber.toFloat() > secondNumber.toFloat()){
                                        outcome = "$firstNumber is greater than $secondNumber"
                                    }else{
                                        outcome = "$secondNumber is greater than $firstNumber"
                                    }
                                    x = 1
                                    left = 5
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
                        text = "Project 97",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }



                OutlinedTextField(
                    value = firstNumber,
                    onValueChange = { firstNumber = it },
                    label = {
                        Text("First number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                    )
                OutlinedTextField(
                    value = secondNumber,
                    onValueChange = { secondNumber = it },
                    label = {
                        Text("Second number")
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
                            outcome = ""
                            if (secondNumber.toFloatOrNull() != null && firstNumber.toFloatOrNull() != null) {
                                if (x < 5) {
                                    left--
                                    outcome = "$left pair/s of number/s left"
                                    if(firstNumber.toFloat() == secondNumber.toFloat()){
                                        outcome = "Both numbers are equal"
                                    }else if(firstNumber.toFloat() > secondNumber.toFloat()){
                                        outcome = "$firstNumber is greater than $secondNumber"
                                    }else{
                                        outcome = "$secondNumber is greater than $firstNumber"
                                    }
                                    x++
                                } else {
                                    if(firstNumber.toFloat() == secondNumber.toFloat()){
                                        outcome = "Both numbers are equal"
                                    }else if(firstNumber.toFloat() > secondNumber.toFloat()){
                                        outcome = "$firstNumber is greater than $secondNumber"
                                    }else{
                                        outcome = "$secondNumber is greater than $firstNumber"
                                    }
                                    x = 1
                                    left = 5
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
                    modifier = Modifier.padding(bottom = 20.dp),
                )
            }
        }
    }
}