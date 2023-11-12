package com.example.proyectogarciat4.U33

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
import java.time.chrono.HijrahEra

/**We declare an abstract class BankDitch and subclasses SavingsBank and FixedTerm.
 * The program asks you for the owner and the amount and shows it*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project141() {
    val configuration = LocalConfiguration.current
    var accountHolderSavings by remember { mutableStateOf("") }
    var amountSavings by remember { mutableStateOf("") }
    var accountHolderFixedTerm by remember { mutableStateOf("") }
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
                        text = "Project 141",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                OutlinedTextField(
                    value = accountHolderSavings,
                    onValueChange = { accountHolderSavings = it },
                    label = {
                        Text("Account Holder Savings Account")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true
                )

                OutlinedTextField(
                    value = amountSavings,
                    onValueChange = { amountSavings = it },
                    label = {
                        Text("Amount Savings Account")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )

                // Fixed Term Deposit
                OutlinedTextField(
                    value = accountHolderFixedTerm,
                    onValueChange = { accountHolderFixedTerm = it },
                    label = {
                        Text("Account Holder Fixed Term Deposit")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {
                            val savingsAccount = SavingsBank(
                                headline = accountHolderSavings,
                                amount = amountSavings.toDoubleOrNull() ?: 0.0
                            )
                            outcome = savingsAccount.print()
                        },
                        modifier = Modifier.padding(10.dp),


                        ) {
                        Text(text = "Savings Bank")
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
                        text = "Project 141",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                OutlinedTextField(
                    value = accountHolderSavings,
                    onValueChange = { accountHolderSavings = it },
                    label = {
                        Text("Account Holder Savings Account")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true
                )

                OutlinedTextField(
                    value = amountSavings,
                    onValueChange = { amountSavings = it },
                    label = {
                        Text("Amount Savings Account")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )

                // Fixed Term Deposit
                OutlinedTextField(
                    value = accountHolderFixedTerm,
                    onValueChange = { accountHolderFixedTerm = it },
                    label = {
                        Text("Account Holder Fixed Term Deposit")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {
                            val savingsAccount = SavingsBank(
                                headline = accountHolderSavings,
                                amount = amountSavings.toDoubleOrNull() ?: 0.0
                            )
                            outcome = savingsAccount.print()
                        },
                        modifier = Modifier.padding(10.dp),


                        ) {
                        Text(text = "Savings Bank")
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

abstract class  BankDitch(val headline: String , val amount : Double){
    abstract fun print(): String
}

class SavingsBank(headline: String,amount: Double): BankDitch(headline,amount){
    override fun print(): String{
        return "Savings account: " +
                "Headline: $headline.\n" +
                "Amount: $amount."
    }

}

class FixedTerm(headline: String,amount: Double, val term: Int, val interest:Double): BankDitch(headline,amount){
    override fun print(): String{
        return "Fixed term account"
    }
}
