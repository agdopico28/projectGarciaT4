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
/**We press the button and the Vector class generates 5 numbers randomly between 1 and 10.
 * These numbers are shown on the screen and these numbers are also shown multiplied by 5.*/
@Composable
fun Project163() {
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
                        text = "Project 163",
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
                            val vec1 = Vector163()
                            val value = 5
                            vec1.charge()
                            outcome += "${vec1.print()}\n"

                            val vecProd = vec1 * value
                            outcome += "Addition component by component of the two vectors: ${vecProd.print()}\n"

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
                        text = "Project 163",
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
                            val vec1 = Vector163()
                            val value = 5
                            vec1.charge()
                            outcome += "${vec1.print()}\n"

                            val vecProd = vec1 * value
                            outcome += "Addition component by component of the two vectors: ${vecProd.print()}\n"

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

class Vector163 {
    val array = IntArray(5)
    fun charge() {
        for (i in array.indices)
            array[i] = (Math.random() * 11 + 1).toInt()
    }

    fun print(): String {
        var aux = ""
        for (elem in array) {
            aux += "$elem "
        }
        return aux
    }

    operator fun times(value: Int): Vector163 {
        var product = Vector163()
        for (i in array.indices)
            product.array[i] = array[i] * value
        return product
    }


}