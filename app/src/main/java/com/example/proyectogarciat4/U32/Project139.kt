package com.example.proyectogarciat4.U32

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
import com.example.proyectogarciat4.U28.DiceRandom
import com.example.proyectogarciat4.U29.DiceDataClass
import com.example.proyectogarciat4.U31.Bigger
import com.example.proyectogarciat4.ui.theme.Blue20
import kotlin.random.Random


@Composable
fun Project139() {
    val configuration = LocalConfiguration.current
    var dice by remember { mutableStateOf(DiceAsterisk((1..6).random())) }
    var dieValue by remember { mutableStateOf(7) } //enter value 7
    val dieRandom = remember { Dice(dieValue) }
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
                        text = "Project 139",
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
                            dieRandom.throwTheDice()
                            val diceAsterisk = dieRandom.toString()
                            outcome +="${diceAsterisk}/"
                        },
                        modifier = Modifier.padding(10.dp),


                        ) {
                        Text(text = "Throw")
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
                        text = "Project 139",
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
                            dieRandom.throwTheDice()
                            dieValue = dieRandom.value
                            val diceA = dieValue.toString()
                            outcome +="${diceA}/"
                        },
                        modifier = Modifier.padding(10.dp),


                        ) {
                        Text(text = "Throw")
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

open class Dice(initialValue: Int) {
    var value: Int = if (initialValue in 1..6) initialValue else 1
        set(value) {
            field = if (value in 1..6) value else 1
        }

    fun throwTheDice() {
        value = Random.nextInt(1, 7)
    }
}

class DiceAsterisk(initialValue: Int) : Dice(initialValue) {
    override fun toString(): String {
        return "*".repeat(value)
    }
}