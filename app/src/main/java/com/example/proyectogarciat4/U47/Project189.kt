package com.example.proyectogarciat4.U47

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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project189() {
    val configuration = LocalConfiguration.current
    var outcome by remember { mutableStateOf("") }
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
                        text = "Project 189",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }


                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {
                            outcome = ""
                            val ticket: MutableSet<Int> = mutableSetOf()
                            loteryTicket(ticket)
                            outcome += "Ticket: $ticket\n"
                            val tries: MutableSet<Int> = mutableSetOf()
                            tries(tries)
                            outcome += "Try: $tries\n"
                            outcome += checkWin(ticket,tries)

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
                        text = "Project 189",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }


                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {
                            outcome = ""
                            val ticket: MutableSet<Int> = mutableSetOf()
                            loteryTicket(ticket)
                            outcome += "Ticket: $ticket\n"
                            val tries: MutableSet<Int> = mutableSetOf()
                            tries(tries)
                            outcome += "Try: $tries\n"
                            outcome += checkWin(ticket,tries)

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

fun loteryTicket(ticket: MutableSet<Int>) {
    do {
        val value = ((Math.random() * 50) + 1).toInt()
        ticket.add(value)
    } while (ticket.size!=6)
}

fun tries (tries: MutableSet<Int>){
    do {
        val value = ((Math.random() * 50) + 1).toInt()
        tries.add(value)
    } while (tries.size != 50)
}

fun checkWin(ticket: MutableSet<Int>, tries: MutableSet<Int>): String{
    var luck = 0
    var amountTries = 0
    var tries1 = 0
    for (tr in tries){
        amountTries++
        if (tr in ticket) {
            luck++
            if (luck == 6) {
                tries1 = amountTries
                break
            }
        }
    }
    return "Have done $tries1 tries until win"
}