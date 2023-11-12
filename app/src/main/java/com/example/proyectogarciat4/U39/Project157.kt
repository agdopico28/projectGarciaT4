package com.example.proyectogarciat4.U39

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

/**Roll the dice and get 5 random numbers.
 * The program shows on the screen the number of counters for each number.*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project157() {
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
                        text = "Project 157",
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
                            val arrayDice: Array<Dice157> =
                                arrayOf(Dice157(),Dice157(),Dice157(), Dice157(), Dice157())
                            for (dice in arrayDice) {
                                dice.throwDice()
                                outcome += dice.printValue()
                            }
                            var cant1 = 0
                            var cant2 = 0
                            var cant3 = 0
                            var cant4 = 0
                            var cant5 = 0
                            var cant6 = 0
                            arrayDice.forEach {
                                when (it.value) {
                                    1 -> cant1++
                                    2 -> cant2++
                                    3 -> cant3++
                                    4 -> cant4++
                                    5 -> cant5++
                                    6 -> cant6++
                                }
                            }
                            outcome += "Amount of 1: $cant1\n" +
                                    "Amount of 2: $cant2\n" +
                                    "Amount of 3: $cant3\n" +
                                    "Amount of 4: $cant4\n" +
                                    "Amount of 5: $cant5\n" +
                                    "Amount of 6: $cant6\n"
                        },
                        modifier = Modifier.padding(10.dp),


                        ) {
                        Text(text = "Calculate")
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
                        text = "Project 157",
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
                            val arrayDice: Array<Dice157> =
                                arrayOf(Dice157(),Dice157(),Dice157(), Dice157(), Dice157())
                            for (dice in arrayDice) {
                                dice.throwDice()
                                outcome += dice.printValue()
                            }
                            var cant1 = 0
                            var cant2 = 0
                            var cant3 = 0
                            var cant4 = 0
                            var cant5 = 0
                            var cant6 = 0
                            arrayDice.forEach {
                                when (it.value) {
                                    1 -> cant1++
                                    2 -> cant2++
                                    3 -> cant3++
                                    4 -> cant4++
                                    5 -> cant5++
                                    6 -> cant6++
                                }
                            }
                            outcome += "Amount of 1: $cant1\n" +
                                    "Amount of 2: $cant2\n" +
                                    "Amount of 3: $cant3\n" +
                                    "Amount of 4: $cant4\n" +
                                    "Amount of 5: $cant5\n" +
                                    "Amount of 6: $cant6\n"
                        },
                        modifier = Modifier.padding(10.dp),


                        ) {
                        Text(text = "Calculate")
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

private class Dice157(var value : Int = 1) {


    fun throwDice() {
        value = ((Math.random() * 6) + 1).toInt()
    }

    fun printValue(): String {
        return "$value\n"
    }
}