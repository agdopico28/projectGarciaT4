package com.example.proyectogarciat4.U12

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

/**Enter 3 values 5 times and accumulate the largest of each list*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project64() {
    val configuration = LocalConfiguration.current
    var first by remember { mutableStateOf("") }
    var second by remember { mutableStateOf("") }
    var third by remember { mutableStateOf("") }
    var addition by remember { mutableStateOf(0.0) }
    var outcome by remember { mutableStateOf("") }
    var x by remember { mutableStateOf(1) }
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
                        text = "Project 56",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }



                OutlinedTextField(
                    value = first,
                    onValueChange = { first = it },
                    label = {
                        Text("First")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                    )


                OutlinedTextField(
                    value = second,
                    onValueChange = { second = it },
                    label = {
                        Text("Second")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                    )
                OutlinedTextField(
                    value = third,
                    onValueChange = { third = it },
                    label = {
                        Text("Third")
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
                            when {
                                first.toFloatOrNull() != null
                                        && second.toFloatOrNull() != null
                                        && third.toFloatOrNull() != null -> {
                                    when {
                                        x < 5 -> {
                                            left--
                                            outcome = "$left number/s left"
                                            x++
                                            addition += when {
                                                first.toFloat() > second.toFloat() -> {
                                                    when {
                                                        first.toFloat() > third.toFloat() -> {
                                                            first.toFloat()
                                                        }

                                                        else -> {
                                                            third.toFloat()
                                                        }
                                                    }
                                                }

                                                else -> {
                                                    when {
                                                        second.toFloat() > third.toFloat() -> {
                                                            second.toFloat()
                                                        }

                                                        else -> {
                                                            third.toFloat()
                                                        }
                                                    }
                                                }
                                            }
                                        }

                                        else -> {
                                            addition += when {
                                                first.toFloat() > second.toFloat() -> {
                                                    when {
                                                        first.toFloat() > third.toFloat() -> {
                                                            first.toFloat()
                                                        }

                                                        else -> {
                                                            third.toFloat()
                                                        }
                                                    }
                                                }

                                                else -> {
                                                    when {
                                                        second.toFloat() > third.toFloat() -> {
                                                            second.toFloat()
                                                        }

                                                        else -> {
                                                            third.toFloat()
                                                        }
                                                    }
                                                }
                                            }
                                            outcome =
                                                "The cumulative value of the largest of each\nlist of 3 values is: $addition"
                                            x = 1
                                            left = 5
                                            addition = 0.00
                                        }
                                    }
                                }

                                else -> {
                                    outcome = "Introduce all the numbers please"
                                }
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
                    value = first,
                    onValueChange = { first = it },
                    label = {
                        Text("First")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                    )


                OutlinedTextField(
                    value = second,
                    onValueChange = { second = it },
                    label = {
                        Text("Second")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                    )
                OutlinedTextField(
                    value = third,
                    onValueChange = { third = it },
                    label = {
                        Text("Third")
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
                            when {
                                first.toFloatOrNull() != null
                                        && second.toFloatOrNull() != null
                                        && third.toFloatOrNull() != null -> {
                                    when {
                                        x < 5 -> {
                                            left--
                                            outcome = "$left number/s left"
                                            x++
                                            addition += when {
                                                first.toFloat() > second.toFloat() -> {
                                                    when {
                                                        first.toFloat() > third.toFloat() -> {
                                                            first.toFloat()
                                                        }

                                                        else -> {
                                                            third.toFloat()
                                                        }
                                                    }
                                                }

                                                else -> {
                                                    when {
                                                        second.toFloat() > third.toFloat() -> {
                                                            second.toFloat()
                                                        }

                                                        else -> {
                                                            third.toFloat()
                                                        }
                                                    }
                                                }
                                            }
                                        }

                                        else -> {
                                            addition += when {
                                                first.toFloat() > second.toFloat() -> {
                                                    when {
                                                        first.toFloat() > third.toFloat() -> {
                                                            first.toFloat()
                                                        }

                                                        else -> {
                                                            third.toFloat()
                                                        }
                                                    }
                                                }

                                                else -> {
                                                    when {
                                                        second.toFloat() > third.toFloat() -> {
                                                            second.toFloat()
                                                        }

                                                        else -> {
                                                            third.toFloat()
                                                        }
                                                    }
                                                }
                                            }
                                            outcome =
                                                "The cumulative value of the largest of each\nlist of 3 values is: $addition"
                                            x = 1
                                            left = 5
                                            addition = 0.00
                                        }
                                    }
                                }

                                else -> {
                                    outcome = "Introduce all the numbers please"
                                }
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