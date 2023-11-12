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
/**We enter text using the keyboard.
 * The program will recognize vowels, lowercase letters, non-alphabetic characters and the entire String.
 * It will show it to you on the screen.*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project151() {
    val configuration = LocalConfiguration.current
    var text by remember { mutableStateOf("") }
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
                        text = "Project 151",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                OutlinedTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = {
                        Text("Text")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Number
                    ),
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {
                            outcome = ""
                            if (!text.equals(null)) {
                                outcome += "Original String: $text\n"
                                val result1 = filter(text) {
                                    it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u' ||
                                            it == 'A' || it == 'E' || it == 'I' || it == 'O' || it == 'U'
                                }
                                outcome += "Only vowels: $result1\n"

                                val result2 = filter(text) {
                                    it in 'a'..'z'
                                }
                                outcome += "Only lowercase: $result2\n"

                                val result3 = filter(text) {
                                    it !in 'a'..'z' && it !in 'A'..'Z'
                                }
                                outcome += "Only non-alphabetic characters: $result3"
                            } else {
                                outcome = "Introduce correct parameters"
                            }
                            text = ""
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
                        text = "Project 151",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                OutlinedTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = {
                        Text("Text")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Number
                    ),
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {
                            outcome = ""
                            if (!text.equals(null)) {
                                outcome += "Original String: $text\n"
                                val result1 = filter(text) {
                                    it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u' ||
                                            it == 'A' || it == 'E' || it == 'I' || it == 'O' || it == 'U'
                                }
                                outcome += "Only vowels: $result1\n"

                                val result2 = filter(text) {
                                    it in 'a'..'z'
                                }
                                outcome += "Only lowercase: $result2\n"

                                val result3 = filter(text) {
                                    it !in 'a'..'z' && it !in 'A'..'Z'
                                }
                                outcome += "Only non-alphabetic characters: $result3"
                            } else {
                                outcome = "Introduce correct parameters"
                            }
                            text = ""
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

fun filter(chain: String, fn: (Char) -> Boolean): String {
    val ch = StringBuilder()
    for (elem in chain) {
        if (fn(elem)) {
            ch.append(elem)
        }
    }
    return ch.toString()
}