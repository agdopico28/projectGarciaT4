package com.example.proyectogarciat4.U41

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

/**We generate two arrays of random numbers and operate on them with the Vector class.
 * Print the result of the operations on the screen when you press the button*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project162() {
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
                        text = "Project 162",
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
                            val vec1 = Vector162()
                            val vec2 = Vector162()
                            vec1.charge()
                            vec2.charge()
                            outcome += "${vec1.print()}\n" +
                                    "${vec2.print()}\n"
                            val vecAdd = vec1 + vec2
                            outcome += "Addition component by component of the two vectors: ${vecAdd.print()}\n"
                            val vecSubs = vec1 - vec2
                            outcome += "Subtraction component by component of the two vectors: ${vecSubs.print()}\n"
                            val vecProd = vec1 * vec2
                            outcome += "Addition component by component of the two vectors: ${vecProd.print()}\n"
                            val vecDiv = vec1 / vec2
                            outcome += "Addition component by component of the two vectors: ${vecDiv.print()}\n"
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
                        text = "Project 162",
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
                            val vec1 = Vector162()
                            val vec2 = Vector162()
                            vec1.charge()
                            vec2.charge()
                            outcome += "${vec1.print()}\n" +
                                    "${vec2.print()}\n"
                            val vecAdd = vec1 + vec2
                            outcome += "Addition component by component of the two vectors: ${vecAdd.print()}\n"
                            val vecSubs = vec1 - vec2
                            outcome += "Subtraction component by component of the two vectors: ${vecSubs.print()}\n"
                            val vecProd = vec1 * vec2
                            outcome += "Addition component by component of the two vectors: ${vecProd.print()}\n"
                            val vecDiv = vec1 / vec2
                            outcome += "Addition component by component of the two vectors: ${vecDiv.print()}\n"

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

class Vector162 {
    val array = IntArray(5)
    fun charge() {
        for(i in array.indices)
            array[i] = (Math.random() * 11 + 1).toInt()
    }
    fun print(): String {
        var aux = ""
        for(elem in array) {
            aux += "$elem "
        }
        return aux
    }
    operator fun plus(vector2: Vector162): Vector162 {
        var addition = Vector162()
        for(i in array.indices)
            addition.array[i] = array[i] + vector2.array[i]
        return addition
    }
    operator fun minus(vector2: Vector162): Vector162 {
        var subs = Vector162()
        for(i in array.indices)
            subs.array[i] = array[i] - vector2.array[i]
        return subs
    }
    operator fun times(vector2: Vector162): Vector162 {
        var product = Vector162()
        for(i in array.indices)
            product.array[i] = array[i] * vector2.array[i]
        return product
    }
    operator fun div(vector2: Vector162): Vector162 {
        var division = Vector162()
        for(i in array.indices)
            division.array[i] = array[i] / vector2.array[i]
        return division
    }
}