package com.example.proyectogarciat4.U7

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

/**The total number of questions and the number of correct questions are entered. It depends on the percentage that is calculated, it outputs one level per screen.**/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project22() {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top
            ) {

                var totalQuestions by remember { mutableStateOf("") }
                var correctAnswers by remember { mutableStateOf("") }
                var outcome by remember { mutableStateOf("") }

                Row(
                    Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                )
                {
                    Text(
                        text = "Project 22",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                OutlinedTextField(
                    value = totalQuestions,
                    onValueChange = { totalQuestions = it },
                    label = {
                        Text("Total questions")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                    )

                OutlinedTextField(
                    value = correctAnswers,
                    onValueChange = { correctAnswers = it },
                    label = {
                        Text("Correct answers")
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
                            if (totalQuestions.toFloatOrNull() != null
                                && correctAnswers.toFloatOrNull() != null
                            ) {
                                val percentage =
                                    correctAnswers.toFloat() * 100 / totalQuestions.toFloat()
                                outcome = if (percentage <= 100 && percentage >= 0) {
                                    if (percentage >= 90) {
                                        "MAX LEVEL!"
                                    } else {
                                        if (percentage >= 75) {
                                            "Medium level"
                                        } else {
                                            if (percentage >= 50) {
                                                "Regular level"
                                            } else {
                                                "Out of level"
                                            }
                                        }
                                    }
                                } else {
                                    "You have introduced wrong parameters"
                                }
                            } else {
                                outcome = "Enter the data correctly please"
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

                var totalQuestions by remember { mutableStateOf("") }
                var correctAnswers by remember { mutableStateOf("") }
                var outcome by remember { mutableStateOf("") }


                Row(
                    Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                )
                {
                    Text(
                        text = "Project 22",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                OutlinedTextField(
                    value = totalQuestions,
                    onValueChange = { totalQuestions = it },
                    label = {
                        Text("Total questions")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                    )

                OutlinedTextField(
                    value = correctAnswers,
                    onValueChange = { correctAnswers = it },
                    label = {
                        Text("Correct answers")
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
                            if (totalQuestions.toFloatOrNull() != null
                                && correctAnswers.toFloatOrNull() != null
                            ) {
                                val percentage =
                                    correctAnswers.toFloat() * 100 / totalQuestions.toFloat()
                                outcome = if (percentage <= 100 && percentage >= 0) {
                                    if (percentage >= 90) {
                                        "MAX LEVEL!"
                                    } else {
                                        if (percentage >= 75) {
                                            "Medium level"
                                        } else {
                                            if (percentage >= 50) {
                                                "Regular level"
                                            } else {
                                                "Out of level"
                                            }
                                        }
                                    }
                                } else {
                                    "You have introduced wrong parameters"
                                }
                            } else {
                                outcome = "Enter the data correctly please"
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
