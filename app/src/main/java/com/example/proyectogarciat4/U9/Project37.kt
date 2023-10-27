package com.example.proyectogarciat4.U9

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
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

/**The number of employees and their salaries are entered by keyboard.
 * Calculate which one charges between 100 and 300 and how many charge more than 300**/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project37() {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top
            ) {

                var salary by remember { mutableStateOf("") }
                var numberEmployees by remember { mutableStateOf("") }
                var outcome by remember { mutableStateOf("") }
                var x by remember { mutableStateOf(1) }
                var highSalary by remember { mutableStateOf(0) }
                var lowSalary by remember { mutableStateOf(0) }
                var totalWages by remember { mutableStateOf(0.0)  }

                Row(
                    Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                )
                {
                    Text(
                        text = "Project 37",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }


                OutlinedTextField(
                    value = numberEmployees,
                    onValueChange = { numberEmployees = it },
                    label = {
                        Text("Number of employees")
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
                    value = salary,
                    onValueChange = { salary = it },
                    label = {
                        Text("Salary")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true,

                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Number
                    ),
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {
                            if (salary.toFloatOrNull() != null && numberEmployees.toIntOrNull() != null && salary.toFloat() >= 100.0 && salary.toFloat() <= 500.0) {
                                if (x < numberEmployees.toInt()) {
                                    val left = numberEmployees.toInt() - x
                                    outcome = "$left salary/s left"
                                    if(salary.toFloat() <= 300) {
                                        lowSalary++
                                    } else {
                                        highSalary++
                                    }
                                    totalWages += salary.toFloat()
                                    x++
                                } else {
                                    if(salary.toFloat() <= 300) {
                                        lowSalary++
                                    } else {
                                        highSalary++
                                    }
                                    totalWages += salary.toFloat()
                                    outcome = "Number of employees with salaries between 100 and 300: $lowSalary\n" +
                                            "Number of employees with salaries greater than 300:$highSalary\n" +
                                            "Total expenditure of the company on salaries: $totalWages"
                                    x = 1
                                    highSalary = 0
                                    lowSalary = 0
                                    totalWages = 0.0
                                }
                                salary = ""
                            } else {
                                outcome = "Introduce correct parameters"
                                salary = ""
                                numberEmployees = ""
                            }
                        },
                        modifier = Modifier.padding(10.dp),

                    ) {
                        Text(text = "Enter")
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

                var salary by remember { mutableStateOf("") }
                var numberEmployees by remember { mutableStateOf("") }
                var outcome by remember { mutableStateOf("") }
                var x by remember { mutableStateOf(1) }
                var highSalary by remember { mutableStateOf(0) }
                var lowSalary by remember { mutableStateOf(0) }
                var totalWages by remember { mutableStateOf(0.0)  }

                Row(
                    Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                )
                {
                    Text(
                        text = "Project 37",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }


                OutlinedTextField(
                    value = numberEmployees,
                    onValueChange = { numberEmployees = it },
                    label = {
                        Text("Number of employees")
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
                    value = salary,
                    onValueChange = { salary = it },
                    label = {
                        Text("Salary")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true,

                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Number
                    ),
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {
                            if (salary.toFloatOrNull() != null && numberEmployees.toIntOrNull() != null && salary.toFloat() >= 100.0 && salary.toFloat() <= 500.0) {
                                if (x < numberEmployees.toInt()) {
                                    val left = numberEmployees.toInt() - x
                                    outcome = "$left salary/s left"
                                    if(salary.toFloat() <= 300) {
                                        lowSalary++
                                    } else {
                                        highSalary++
                                    }
                                    totalWages += salary.toFloat()
                                    x++
                                } else {
                                    if(salary.toFloat() <= 300) {
                                        lowSalary++
                                    } else {
                                        highSalary++
                                    }
                                    totalWages += salary.toFloat()
                                    outcome = "Number of employees with salaries between 100 and 300: $lowSalary\n" +
                                            "Number of employees with salaries greater than 300:$highSalary\n" +
                                            "Total expenditure of the company on salaries: $totalWages"
                                    x = 1
                                    highSalary = 0
                                    lowSalary = 0
                                    totalWages = 0.0
                                }
                                salary = ""
                            } else {
                                outcome = "Introduce correct parameters"
                                salary = ""
                                numberEmployees = ""
                            }
                        },
                        modifier = Modifier.padding(10.dp),

                        ) {
                        Text(text = "Enter")
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
