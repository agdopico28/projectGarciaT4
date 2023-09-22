package com.example.proyectogarciat4

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.proyectogarciat4.ui.theme.Blue20

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project8() {
    Column(modifier = Modifier.padding(20.dp)) {
        Text(
            text = "Project5", textAlign = TextAlign.Center, color = Blue20,
            fontWeight = FontWeight.Bold
        )
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {

        var num1 by remember { mutableStateOf("") }
        var num2 by remember { mutableStateOf("") }
        var outcome by remember { mutableStateOf("Inconclusive") }

        OutlinedTextField(
            value = num1,
            onValueChange = { num1 = it },
            label = {
                Text("First number")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = num2,
            onValueChange = { num2 = it },
            label = {
                Text("Second number")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )
        Row(
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = {
                    var catena = ""
                    if (num2.toIntOrNull() != null && num1.toIntOrNull() != null) {
                        var result = 0
                        result = num1.toInt() + num2.toInt()
                        catena += "Adittion: $result"
                    } else {
                        catena += "Some field is empty"
                    }
                    outcome = catena

                },
                modifier = Modifier.padding(10.dp)
            ) {
                Text(text = "Add")
            }

            Button(
                onClick = {
                    var catena = ""
                    if (num2.toIntOrNull() != null && num1.toIntOrNull() != null) {
                        var result = 0
                        result = num1.toInt() * num2.toInt()
                        catena += "Multiply: $result"
                    } else {
                        catena += "Some field is empty"
                    }
                    outcome = catena

                },
                modifier = Modifier.padding(10.dp)
            ) {
                Text(text = "Multiply")
            }
        }

        Text(
            text = outcome,
            modifier = Modifier.padding(20.dp)
        )

    }
}

