package com.example.proyectogarciat4.U45

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

/**We enter the height of 5 people.
 * The program shows the average of the entered heights.
 * It also shows people who are taller than average and those who are shorter than average.*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project180() {
    val configuration = LocalConfiguration.current
    var height by remember { mutableStateOf("") }
    var outcome by remember { mutableStateOf("") }
    val listEmpl by remember { mutableStateOf(FloatArray(5)) }
    var aux by remember { mutableStateOf(0) }
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
                        text = "Project 180",
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
                            outcome = ""
                            if (height.toFloatOrNull() != null) {
                                listEmpl[aux] = height.toFloat()
                                if (aux == 4){
                                    val average = listEmpl.average()
                                    val above = listEmpl.count{it > average}
                                    val below = listEmpl.count{it < average}
                                    outcome += "Amount above $average: $above\n"
                                    outcome += "Amount below $average: $below\n"
                                    aux = -1
                                }
                                outcome = "Can keep introducing heights\n"
                                aux++
                            } else {
                                outcome = "Introduce a number"
                            }
                            height = ""

                        },
                        modifier = Modifier.padding(10.dp),


                        ) {
                        Text(text = "Enter")
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
                        text = "Project 180",
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
                            outcome = ""
                            if (height.toFloatOrNull() != null) {
                                listEmpl[aux] = height.toFloat()
                                if (aux == 4){
                                    val average = listEmpl.average()
                                    val above = listEmpl.count{it > average}
                                    val below = listEmpl.count{it < average}
                                    outcome += "Amount above $average: $above\n"
                                    outcome += "Amount below $average: $below\n"
                                    aux = -1
                                }
                                outcome += "Can keep introducing heights\n"
                                aux++
                            } else {
                                outcome = "Introduce a number"
                            }
                            height = ""

                        },
                        modifier = Modifier.padding(10.dp),


                        ) {
                        Text(text = "Enter")
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
