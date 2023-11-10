package com.example.proyectogarciat4.U27

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
import com.example.proyectogarciat4.U26.Club
import com.example.proyectogarciat4.ui.theme.Blue20
import kotlin.random.Random

/**The RandomArray class calculates 5 numbers (0 to 10) randomly and outputs the highest and lowest value obtained.
 * Displays the values of the array and the greatest and least on the screen*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project124() {
    val configuration = LocalConfiguration.current

    var arrayString by remember { mutableStateOf("") }
    var maxElement by remember { mutableStateOf("") }
    var minElement by remember { mutableStateOf("") }
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
                        text = "Project 124",
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
                            val newRandomArray = RandomArray()
                            arrayString = newRandomArray.arrayToString()
                            maxElement = "Max Element: ${newRandomArray.getMaxElement()}"
                            minElement = "Min Element: ${newRandomArray.getMinElement()}"
                            outcome += "Numbers: $arrayString \n $maxElement \n $minElement"
                            outcome += ""
                        },
                        modifier = Modifier.padding(10.dp),


                        ) {
                        Text(text = "Show")
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
                        text = "Project 124",
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
                            val newRandomArray = RandomArray()
                            arrayString = newRandomArray.arrayToString()
                            maxElement = "Max Element: ${newRandomArray.getMaxElement()}"
                            minElement = "Min Element: ${newRandomArray.getMinElement()}"
                            outcome += "Numbers: $arrayString \n $maxElement \n $minElement"
                            outcome += ""
                        },
                        modifier = Modifier.padding(10.dp),


                        ) {
                        Text(text = "Show")
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




//The RandomArray class (random numbers from 0 to 10 inclusive)
class RandomArray {
    private val numbers = IntArray(5)

    init {
        fillArrayWithRandomNumbers()
    }

    private fun fillArrayWithRandomNumbers() {
        for (i in numbers.indices) {
            numbers[i] = Random.nextInt(0, 11)
        }
    }

    fun arrayToString(): String {
        return numbers.contentToString()
    }
    fun getMaxElement(): Int {
        return  numbers.maxOrNull() ?: 0
    }
    fun getMinElement(): Int {
        return  numbers.minOrNull() ?: 0
    }
}