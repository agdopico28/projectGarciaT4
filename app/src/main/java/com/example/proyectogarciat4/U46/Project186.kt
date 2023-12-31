package com.example.proyectogarciat4.U46

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

/**We enter a day, month and year and an activity.
 * The program checks if you already have an activity that day and prints the activity and if you don't have it, it generates it.*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project186() {
    val configuration = LocalConfiguration.current
    var day by remember { mutableStateOf("") }
    var month by remember { mutableStateOf("") }
    var year by remember { mutableStateOf("") }
    var activity by remember { mutableStateOf("") }
    var outcome by remember { mutableStateOf("") }
    val listDates by remember { mutableStateOf(mutableMapOf<Date, String>()) }
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
                        text = "Project 186",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                OutlinedTextField(
                    value = day,
                    onValueChange = { day = it },
                    label = {
                        Text("Day")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                )
                OutlinedTextField(
                    value = month,
                    onValueChange = { month = it },
                    label = {
                        Text("Month")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                )
                OutlinedTextField(
                    value = year,
                    onValueChange = { year = it },
                    label = {
                        Text("Year")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                )
                OutlinedTextField(
                    value = activity,
                    onValueChange = { activity = it },
                    label = {
                        Text("Activity")
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
                            if (day.toIntOrNull() != null && month.toIntOrNull() != null && year.toIntOrNull() != null && !activity.equals(null)) {
                                val date = Date(day.toInt(), month.toInt(), year.toInt())
                                outcome += checkDate(date, listDates)
                                listDates[date] = activity
                                outcome += printDates(listDates)

                            } else {
                                outcome = "Introduce a number"
                            }
                            day = ""
                            month = ""
                            year = ""
                            activity = ""

                        },
                        modifier = Modifier.padding(10.dp),


                        ) {
                        Text(text = "Date")
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
                        text = "Project 186",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                OutlinedTextField(
                    value = day,
                    onValueChange = { day = it },
                    label = {
                        Text("Day")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                    )
                OutlinedTextField(
                    value = month,
                    onValueChange = { month = it },
                    label = {
                        Text("Month")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                    )
                OutlinedTextField(
                    value = year,
                    onValueChange = { year = it },
                    label = {
                        Text("Year")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                    )
                OutlinedTextField(
                    value = activity,
                    onValueChange = { activity = it },
                    label = {
                        Text("Activity")
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
                            if (day.toIntOrNull() != null && month.toIntOrNull() != null && year.toIntOrNull() != null && !activity.equals(
                                    null
                                )
                            ) {
                                val date = Date(day.toInt(), month.toInt(), year.toInt())
                                outcome += checkDate(date, listDates)
                                listDates[date] = activity
                                outcome += printDates(listDates)

                            } else {
                                outcome = "Introduce a number"
                            }
                            day = ""
                            month = ""
                            year = ""
                            activity = ""

                        },
                        modifier = Modifier.padding(10.dp),


                        ) {
                        Text(text = "Date")
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

data class Date(val day: Int, val month: Int, val year: Int)

fun printDates(calendar: MutableMap<Date, String>): String{
    var aux = ""
    for ((date, activity) in calendar){
        aux += "Date: ${date.day}/${date.month}/${date.year}\n" +
                "Activity: $activity\n\n"
    }
    return aux
}

fun checkDate(date: Date,calendar: MutableMap<Date, String>): String{
    var aux = ""
    aux += if (date in calendar) {
        "Activities same day: ${calendar[date]}\n\n"
    } else {
        "No activities this day\n\n"
    }
    return aux
}