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

/**You enter the number of triangles and also the length of their sides.
 * Calculate if it is equilateral, isosceles or scalene*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project56() {
    val configuration = LocalConfiguration.current
    var amountTriangles by remember { mutableStateOf("") }
    var side3 by remember { mutableStateOf("") }
    var side2 by remember { mutableStateOf("") }
    var side1 by remember { mutableStateOf("") }
    var outcome by remember { mutableStateOf("") }
    var x by remember { mutableStateOf(1) }
    var equilateral by remember { mutableStateOf(0) }
    var isosceles by remember { mutableStateOf(0) }
    var scales by remember { mutableStateOf(0) }
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
                        text = "Project 56",
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
                    value = side1,
                    onValueChange = { side1 = it },
                    label = {
                        Text("Size")
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
                        Text("Size")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                    )
                OutlinedTextField(
                    value = side3,
                    onValueChange = { side3 = it },
                    label = {
                        Text("Size")
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
                            if (side1.toFloatOrNull() != null && side2.toFloatOrNull() != null && amountTriangles.toIntOrNull() != null && side3.toIntOrNull() != null) {
                                if (x < amountTriangles.toInt()) {
                                    val left = amountTriangles.toInt() - x
                                    outcome = "$left triangles left\n"
                                    if(side1 == side2 && side2 == side3){
                                        equilateral++
                                    }else if(side1 == side2 || side1 == side3 || side2 == side3){
                                        isosceles++
                                    }else{
                                        scales++
                                    }
                                    x++
                                } else {
                                    if (side1 == side2 && side1 == side3){
                                        equilateral++
                                    } else if (side1 == side2 || side1 == side3 || side2 == side3){
                                        isosceles++
                                    } else {
                                        scales++
                                    }
                                    outcome = "Equilateral: $equilateral\n" +
                                            "Isosceles: $isosceles\n" +
                                            "Scales: $scales"
                                    equilateral = 0
                                    isosceles = 0
                                    scales = 0
                                    x = 1
                                }
                                side1 = ""
                                side2 = ""
                                side3 = ""
                            } else {
                                outcome = "Introduce correct parameters"
                                side1 = ""
                                side2 = ""
                                side3 = ""
                                amountTriangles = ""
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
                        text = "Project 56",
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
                    value = side1,
                    onValueChange = { side1 = it },
                    label = {
                        Text("Size")
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
                        Text("Size")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                    )
                OutlinedTextField(
                    value = side3,
                    onValueChange = { side3 = it },
                    label = {
                        Text("Size")
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
                            if (side1.toFloatOrNull() != null && side2.toFloatOrNull() != null && amountTriangles.toIntOrNull() != null && side3.toIntOrNull() != null) {
                                if (x < amountTriangles.toInt()) {
                                    val left = amountTriangles.toInt() - x
                                    outcome = "$left triangles left\n"
                                    if(side1 == side2 && side2 == side3){
                                        equilateral++
                                    }else if(side1 == side2 || side1 == side3 || side2 == side3){
                                        isosceles++
                                    }else{
                                        scales++
                                    }
                                    x++
                                } else {
                                    if (side1 == side2 && side1 == side3){
                                        equilateral++
                                    } else if (side1 == side2 || side1 == side3 || side2 == side3){
                                        isosceles++
                                    } else {
                                        scales++
                                    }
                                    outcome = "Equilateral: $equilateral\n" +
                                            "Isosceles: $isosceles\n" +
                                            "Scales: $scales"
                                    equilateral = 0
                                    isosceles = 0
                                    scales = 0
                                    x = 1
                                }
                                side1 = ""
                                side2 = ""
                                side3 = ""
                            } else {
                                outcome = "Introduce correct parameters"
                                side1 = ""
                                side2 = ""
                                side3 = ""
                                amountTriangles = ""
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