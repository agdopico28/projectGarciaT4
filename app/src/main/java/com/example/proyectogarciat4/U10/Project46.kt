package com.example.proyectogarciat4.U10

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

/**Reads the data of a checking account and reports the balance and the sum of the credit balances**/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project46() {
    val configuration = LocalConfiguration.current
    var accountNumber by remember { mutableStateOf("") }
    var balance by remember { mutableStateOf("") }
    var totalCreditors by remember { mutableStateOf(0.0) }
    var outcome by remember { mutableStateOf("") }
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
                        text = "Project 46",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                OutlinedTextField(
                    value = accountNumber,
                    onValueChange = { accountNumber = it },
                    label = {
                        Text("Account number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                OutlinedTextField(
                    value = balance,
                    onValueChange = { balance = it },
                    label = {
                        Text("Balance")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {
                            val account = accountNumber.toIntOrNull()
                            val saldo = balance.toDoubleOrNull()
                            if (account != null && account >= 0 && saldo != null) {
                                when {
                                    saldo > 0 -> {
                                        outcome += "Credit Balance."
                                        totalCreditors += saldo
                                    }
                                    saldo < 0 -> outcome += "Debit Balance."
                                    else -> outcome += "Null Balance."
                                }
                                // Clear the input fields
                                accountNumber = ""
                                balance = ""
                            } else if (account != null && account < 0) {
                                outcome += "Total Credit Balances: $totalCreditors"
                            }
                            accountNumber = ""
                            balance = ""
                            outcome += ""
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
                    value = accountNumber,
                    onValueChange = { accountNumber = it },
                    label = {
                        Text("Account number")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                OutlinedTextField(
                    value = balance,
                    onValueChange = { balance = it },
                    label = {
                        Text("Balance")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {
                            val account = accountNumber.toIntOrNull()
                            val saldo = balance.toDoubleOrNull()
                            if (account != null && account >= 0 && saldo != null) {
                                when {
                                    saldo > 0 -> {
                                        outcome += "Credit Balance."
                                        totalCreditors += saldo
                                    }
                                    saldo < 0 -> outcome += "Debit Balance."
                                    else -> outcome += "Null Balance."
                                }
                                // Clear the input fields
                                accountNumber = ""
                                balance = ""
                            } else if (account != null && account < 0) {
                                outcome += "Total Credit Balances: $totalCreditors"
                            }
                            accountNumber = ""
                            balance = ""
                            outcome += ""
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