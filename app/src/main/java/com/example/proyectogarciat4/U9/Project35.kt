package com.example.proyectogarciat4.U9

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

/**Enter 10 notes and report how many have more than 7 and how many have less**/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project35() {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Top
            ) {

                var grades by remember { mutableStateOf("") }
                var x by remember { mutableStateOf(1) }
                var goodGrades by remember { mutableStateOf(0) }
                var badGrades by remember { mutableStateOf(0) }
                var left by remember { mutableStateOf(10) }
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
                        text = "Project 35",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }


                OutlinedTextField(
                    value = grades,
                    onValueChange = { grades = it },
                    label = {
                        Text("Number pieces ")
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
                            if (grades.toFloatOrNull() != null ) {
                                if (x != 10) {
                                    left --
                                    outcome = "$left grade/s left"
                                    if (grades.toFloat() >= 7.00){
                                        goodGrades++
                                    }else{
                                        badGrades++
                                    }
                                    x++
                                } else {
                                    if (grades.toFloat() >= 7.00){
                                        goodGrades++
                                    }else{
                                        badGrades++
                                    }
                                    outcome = "Number of students with grades greater than or equal to 7: $goodGrades. \n Number of students with grades below 7:$badGrades "
                                    x = 1
                                    left = 10
                                    goodGrades = 0
                                    badGrades = 0
                                }
                            } else {
                                outcome = "Introduce grades"
                            }
                            grades = ""

                        },
                        modifier = Modifier.padding(10.dp)
                    ) {
                        Text(text = "Check")
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
                modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Top
            ) {
                var grades by remember { mutableStateOf("") }
                var x by remember { mutableStateOf(1) }
                var goodGrades by remember { mutableStateOf(0) }
                var badGrades by remember { mutableStateOf(0) }
                var left by remember { mutableStateOf(10) }
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
                        text = "Project 35",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }


                OutlinedTextField(
                    value = grades,
                    onValueChange = { grades = it },
                    label = {
                        Text("Grades ")
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
                            if (grades.toFloatOrNull() != null ) {
                                if (x != 10) {
                                    left --
                                    outcome = "$left grade/s left"
                                    if (grades.toFloat() >= 7.00){
                                        goodGrades++
                                    }else{
                                        badGrades++
                                    }
                                    x++
                                } else {
                                    if (grades.toFloat() >= 7.00){
                                        goodGrades++
                                    }else{
                                        badGrades++
                                    }
                                    outcome = "Number of students with grades greater than or equal to 7: $goodGrades. \nNumber of students with grades below 7: $badGrades "
                                    x = 1
                                    left = 10
                                    goodGrades = 0
                                    badGrades = 0
                                }
                            } else {
                                outcome = "Introduce grades"
                            }
                            grades = ""

                        },
                        modifier = Modifier.padding(10.dp)
                    ) {
                        Text(text = "Check")
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
