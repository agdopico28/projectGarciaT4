package com.example.proyectogarciat4.U5

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
/**Enter three grades for a student, if the average is greater than or equal to seven it will show Promoted**/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project13() {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top
            ) {

                var note1 by remember { mutableStateOf("") }
                var note2 by remember { mutableStateOf("") }
                var note3 by remember { mutableStateOf("") }
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
                        text = "Project 13",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }


                OutlinedTextField(
                    value = note1,
                    onValueChange = { note1 = it },
                    label = {
                        Text("First number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true
                )

                OutlinedTextField(
                    value = note2,
                    onValueChange = { note2 = it },
                    label = {
                        Text("Second number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true
                )

                OutlinedTextField(
                    value = note3,
                    onValueChange = { note3 = it },
                    label = {
                        Text("Third number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true
                )

                Row(
                    Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(
                        onClick = {
                            var catena = ""

                            if (note1.toFloatOrNull() != null &&
                                note2.toFloatOrNull() != null &&
                                note3.toFloatOrNull() != null
                            ) {

                                var result1: Float
                                result1 = (note1.toFloat() + note2.toFloat() + note3.toFloat()) / 3
                                if (result1 >= 7) {
                                    catena += "Promoted"
                                } else {

                                }
                            } else {
                                catena += "Some field is empty"
                            }
                            outcome = catena

                        },
                        modifier = Modifier.padding(10.dp)
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

                var note1 by remember { mutableStateOf("") }
                var note2 by remember { mutableStateOf("") }
                var note3 by remember { mutableStateOf("") }
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
                        text = "Project 13",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }


                OutlinedTextField(
                    value = note1,
                    onValueChange = { note1 = it },
                    label = {
                        Text("First number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true
                )

                OutlinedTextField(
                    value = note2,
                    onValueChange = { note2 = it },
                    label = {
                        Text("Second number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true
                )

                OutlinedTextField(
                    value = note3,
                    onValueChange = { note3 = it },
                    label = {
                        Text("Third number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true
                )

                Row(
                    Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(
                        onClick = {
                            var catena = ""

                            if (note1.toFloatOrNull() != null &&
                                note2.toFloatOrNull() != null &&
                                note3.toFloatOrNull() !=null) {

                                var result1: Float
                                result1 = (note1 . toFloat() + note2.toFloat()+ note3.toFloat()) / 3
                                if(result1 >= 7){
                                    catena+= "Promoted"
                                }else{

                                }
                            } else {
                                catena += "Some field is empty"
                            }
                            outcome = catena

                        },
                        modifier = Modifier.padding(10.dp)
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