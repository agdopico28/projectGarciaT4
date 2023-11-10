package com.example.proyectogarciat4.U28

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
import kotlin.random.Random

/**The DiceRandom class that has a function that creates a random number.
 * The program displays the numbers on the screen.*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project127() {
    val configuration = LocalConfiguration.current

    var dieValue by remember { mutableStateOf(7) } //enter value 7
    val dieRandom = remember { DiceRandom(dieValue) }
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
                        text = "Project 127",
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
                            dieRandom.throwTheDice()  // Roll the die
                            dieValue = dieRandom.value
                            outcome +="${dieValue}/"
                            outcome += ""
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
                        text = "Project 127",
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
                            dieRandom.throwTheDice()  // Roll the die
                            dieValue = dieRandom.value
                            outcome +="${dieValue}/"
                            outcome += ""
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




//The DiceRandom class (random numbers from 1 to 6 inclusive)
class DiceRandom(initialValue: Int) {
    var value: Int = if (initialValue in 1..6) initialValue else 1
        set(value) {
            field = if (value in 1..6) value else 1
        }

    fun throwTheDice() {
        value = Random.nextInt(1, 7)
    }

    fun printValue() {
        println("The dice shows: $value")
    }
}