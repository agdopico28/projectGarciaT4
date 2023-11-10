package com.example.proyectogarciat4.U29

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

/**We create a data class DiceDataClass and every time
 * we press the button the program shows the (*)random value calculated in this*/
@Composable
fun Project130() {
    val configuration = LocalConfiguration.current

    var dice by remember { mutableStateOf(DiceDataClass((1..6).random())) }
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
                        text = "Project 130",
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
                            dice = dice.copy(value = (1..6).random())
                            outcome += "$dice/ "
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
                        text = "Project 130",
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
                            dice = dice.copy(value = (1..6).random())
                            outcome += "$dice/ "
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




//The  DiceDataClass data class (random numbers from 1 to 6 inclusive)
data class DiceDataClass(var value: Int) {
    override fun toString(): String {
        value = value.coerceIn(1..6)
        return "*".repeat(value)
    }
}