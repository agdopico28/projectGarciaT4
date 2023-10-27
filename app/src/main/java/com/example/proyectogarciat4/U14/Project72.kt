package com.example.proyectogarciat4.U14

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

/**You enter a value and it takes the square of it. Then you enter two values
 * and show the product of these*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project72(){
    val configuration = LocalConfiguration.current
    var x by remember { mutableStateOf(1) }
    var totalSquared by remember { mutableStateOf(0.00) }
    var squaredNumber by remember { mutableStateOf("") }
    var productNumber by remember { mutableStateOf("") }
    var total by remember { mutableStateOf(0.00) }
    var outcome by remember { mutableStateOf("") }
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
                        text = "Project 72",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }



                OutlinedTextField(
                    value = squaredNumber,
                    onValueChange = { squaredNumber = it },
                    label = {
                        Text("Square")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                )
                OutlinedTextField(
                    value = productNumber,
                    onValueChange = { productNumber = it },
                    label = {
                        Text("Product")
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
                            if (productNumber.toFloatOrNull() != null) {
                                if (x < 2) {
                                    left--
                                    outcome = "$left number left"
                                    total += productNumber.toFloat()
                                    productNumber  = ""
                                    x++
                                } else {
                                    total += productNumber.toFloat()
                                    outcome = "The product equals: $total"
                                    productNumber = ""
                                    x=1
                                    left = 2
                                    total = 0.00
                                }
                            } else if (squaredNumber.toFloatOrNull() != null) {
                                totalSquared = (squaredNumber.toFloat() * squaredNumber.toFloat()).toDouble()
                                outcome = "The square equals: $totalSquared"
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
                        text = "Project 72",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }



                OutlinedTextField(
                    value = squaredNumber,
                    onValueChange = { squaredNumber = it },
                    label = {
                        Text("Square")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                    )
                OutlinedTextField(
                    value = productNumber,
                    onValueChange = { productNumber = it },
                    label = {
                        Text("Product")
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
                            if (productNumber.toFloatOrNull() != null) {
                                if (x < 2) {
                                    left--
                                    outcome = "$left number left"
                                    total += productNumber.toFloat()
                                    productNumber  = ""
                                    x++
                                } else {
                                    total += productNumber.toFloat()
                                    outcome = "The product equals: $total"
                                    productNumber = ""
                                    x=1
                                    left = 2
                                    total = 0.00
                                }
                            } else if (squaredNumber.toFloatOrNull() != null) {
                                totalSquared = (squaredNumber.toFloat() * squaredNumber.toFloat()).toDouble()
                                outcome = "The square equals: $totalSquared"
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