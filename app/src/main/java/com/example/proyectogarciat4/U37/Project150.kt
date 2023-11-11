package com.example.proyectogarciat4.U37

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectogarciat4.ui.theme.Blue20
import kotlin.random.Random

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project150() {
    val configuration = LocalConfiguration.current
    var resultMultiplesOf2 by remember { mutableStateOf("") }
    var resultMultiplesOf3Or5 by remember { mutableStateOf("") }
    var resultGreaterThanOrEqualTo50 by remember { mutableStateOf("") }
    var resultBetween1And10 by remember { mutableStateOf("") }
    var resultBetween20And30 by remember { mutableStateOf("") }
    var resultBetween90And95 by remember { mutableStateOf("") }

    val randomIntArray = IntArray(10) { Random.nextInt(0, 100) }
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
                        text = "Project 150",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Text(
                    text = "Random Array: ${randomIntArray.joinToString()}",
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(10.dp),
                )

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.padding(10.dp).verticalScroll(rememberScrollState())
                ) {
                    TitleExample(text = "Multiples of 2:")
                    Text(
                        text = resultMultiplesOf2,
                        maxLines = 1
                    )
                    Spacer(modifier = Modifier.padding(3.dp))
                    TitleExample(text = "Multiples of 3 or 5:")
                    Text(
                        text = resultMultiplesOf3Or5,
                        maxLines = 1

                    )
                    Spacer(modifier = Modifier.padding(3.dp))
                    TitleExample(text = "Greater than or equal to 50:")
                    Text(
                        text = resultGreaterThanOrEqualTo50,
                        maxLines = 1

                    )
                    Spacer(modifier = Modifier.padding(3.dp))
                    TitleExample(text = "Between 1 and 10:")
                    Text(
                        text = resultBetween1And10,
                        maxLines = 1

                    )
                    Spacer(modifier = Modifier.padding(3.dp))
                    TitleExample(text = "Between 20 and 30:")
                    Text(
                        text = resultBetween20And30,
                        maxLines = 1

                    )
                    Spacer(modifier = Modifier.padding(3.dp))
                    TitleExample(text = "Between 90 and 95:")
                    Text(
                        text = resultBetween90And95,
                        maxLines = 1

                    )
                }



                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {
                            val multiplesOf2 = filterArray(randomIntArray) { it % 2 == 0 }
                            resultMultiplesOf2 = multiplesOf2.joinToString()

                            val multiplesOf3Or5 =
                                filterArray(randomIntArray) { it % 3 == 0 || it % 5 == 0 }
                            resultMultiplesOf3Or5 = multiplesOf3Or5.joinToString()

                            val greaterThanOrEqualTo50 = filterArray(randomIntArray) { it >= 50 }
                            resultGreaterThanOrEqualTo50 = greaterThanOrEqualTo50.joinToString()

                            val between1And10 = filterArray(randomIntArray) { it in 1..10 }
                            resultBetween1And10 = between1And10.joinToString()

                            val between20And30 = filterArray(randomIntArray) { it in 20..30 }
                            resultBetween20And30 = between20And30.joinToString()

                            val between90And95 = filterArray(randomIntArray) { it in 90..95 }
                            resultBetween90And95 = between90And95.joinToString()
                        },
                        modifier = Modifier.padding(10.dp),


                        ) {
                        Text(text = "Calculate")
                    }
                }
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
                        text = "Project 150",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Text(
                    text = "Random Array: ${randomIntArray.joinToString()}",
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(10.dp),
                )

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.padding(10.dp).verticalScroll(rememberScrollState())
                ) {
                    TitleExample(text = "Multiples of 2:")
                    Text(
                        text = resultMultiplesOf2,
                        maxLines = 1
                    )
                    Spacer(modifier = Modifier.padding(3.dp))
                    TitleExample(text = "Multiples of 3 or 5:")
                    Text(
                        text = resultMultiplesOf3Or5,
                        maxLines = 1

                    )
                    Spacer(modifier = Modifier.padding(3.dp))
                    TitleExample(text = "Greater than or equal to 50:")
                    Text(
                        text = resultGreaterThanOrEqualTo50,
                        maxLines = 1

                    )
                    Spacer(modifier = Modifier.padding(3.dp))
                    TitleExample(text = "Between 1 and 10:")
                    Text(
                        text = resultBetween1And10,
                        maxLines = 1

                    )
                    Spacer(modifier = Modifier.padding(3.dp))
                    TitleExample(text = "Between 20 and 30:")
                    Text(
                        text = resultBetween20And30,
                        maxLines = 1

                    )
                    Spacer(modifier = Modifier.padding(3.dp))
                    TitleExample(text = "Between 90 and 95:")
                    Text(
                        text = resultBetween90And95,
                        maxLines = 1

                    )
                }



                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {
                            val multiplesOf2 = filterArray(randomIntArray) { it % 2 == 0 }
                            resultMultiplesOf2 = multiplesOf2.joinToString()

                            val multiplesOf3Or5 =
                                filterArray(randomIntArray) { it % 3 == 0 || it % 5 == 0 }
                            resultMultiplesOf3Or5 = multiplesOf3Or5.joinToString()

                            val greaterThanOrEqualTo50 = filterArray(randomIntArray) { it >= 50 }
                            resultGreaterThanOrEqualTo50 = greaterThanOrEqualTo50.joinToString()

                            val between1And10 = filterArray(randomIntArray) { it in 1..10 }
                            resultBetween1And10 = between1And10.joinToString()

                            val between20And30 = filterArray(randomIntArray) { it in 20..30 }
                            resultBetween20And30 = between20And30.joinToString()

                            val between90And95 = filterArray(randomIntArray) { it in 90..95 }
                            resultBetween90And95 = between90And95.joinToString()
                        },
                        modifier = Modifier.padding(10.dp),


                        ) {
                        Text(text = "Calculate")
                    }
                }

            }
        }
    }
}

@Composable
private fun TitleExample(text: String) {
    Text(text = text, style = MaterialTheme.typography.titleMedium)
}

private fun filterArray(array: IntArray, condition: (Int) -> Boolean): List<Int> {
    return array.filter { condition(it) }
}