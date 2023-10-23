package com.example.proyectogarciat4.U10

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

/**Reads the data of a checking account and reports the balance and the sum of the credit balances**/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project46() {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Top
            ) {

                var accountNum by remember { mutableStateOf("") }
                var balance by remember { mutableStateOf("") }
                val listBalance by remember { mutableStateOf(mutableListOf<Pair<Int, Float>>()) }
                var total by remember { mutableStateOf("") }
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
                        text = "Project 46",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }


                OutlinedTextField(
                    value = accountNum,
                    onValueChange = { accountNum = it },
                    label = {
                        Text("Number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                    )

                OutlinedTextField(
                    value = balance,
                    onValueChange = { balance = it },
                    label = {
                        Text("Balance")
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
                            if (balance.toFloatOrNull() != null && accountNum.toIntOrNull() != null) {
                                for (b in listBalance){
                                    if (accountNum.toInt() == b.first) {
                                        total = b.second.toString()
                                    }
                                    total += balance.toFloat()
                                    listBalance.add(Pair(accountNum.toInt(), total.toFloat()))
                                    outcome = if (total.toFloat() < 0.0) {
                                        "Debt Balance"
                                    } else if (total.toFloat() > 0.0) {
                                        "Credit balance"
                                    } else {
                                        "Zero balance"
                                    }
                                }
                                balance = ""
                            } else {
                                outcome = "Introduce correct parameters"
                            }
                            accountNum = ""
                            balance = ""
                        },
                        modifier = Modifier.padding(10.dp),

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
                var accountNum by remember { mutableStateOf("") }
                var balance by remember { mutableStateOf("") }
                val listBalance by remember { mutableStateOf(mutableListOf<Pair<Int, Float>>()) }
                var total by remember { mutableStateOf("") }
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
                        text = "Project 46",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }


                OutlinedTextField(
                    value = accountNum,
                    onValueChange = { accountNum = it },
                    label = {
                        Text("Number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,

                    )

                OutlinedTextField(
                    value = balance,
                    onValueChange = { balance = it },
                    label = {
                        Text("Balance")
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
                            if (balance.toFloatOrNull() != null && accountNum.toIntOrNull() != null) {
                                for (b in listBalance){
                                    if (accountNum.toInt() == b.first) {
                                        total = b.second.toString()
                                    }
                                    total += balance.toFloat()
                                    listBalance.add(Pair(accountNum.toInt(), total.toFloat()))
                                    outcome = if (total.toFloat() < 0.0) {
                                        "Debt Balance"
                                    } else if (total.toFloat() > 0.0) {
                                        "Credit balance"
                                    } else {
                                        "Zero balance"
                                    }
                                }
                                balance = ""
                            } else {
                                outcome = "Introduce correct parameters"
                            }
                            accountNum = ""
                            balance = ""
                        },
                        modifier = Modifier.padding(10.dp),

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