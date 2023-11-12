package com.example.proyectogarciat4.U34

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

/**We implement Figure143 and two classes Square and Rectangle.
 * The program asks for three numbers and with the first it calculates the perimeter and area of the square and with the other two the same of the rectangle.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project143() {
    val configuration = LocalConfiguration.current
    var sideSquare by remember { mutableStateOf("") }
    var lengthRectangle by remember { mutableStateOf("") }
    var widthRectangle by remember { mutableStateOf("") }
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
                        text = "Project 143",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                OutlinedTextField(
                    value = sideSquare,
                    onValueChange = { sideSquare = it },
                    label = {
                        Text("Side of Square")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                OutlinedTextField(
                    value = lengthRectangle,
                    onValueChange = { lengthRectangle = it },
                    label = {
                        Text("Length of Rectangle")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                OutlinedTextField(
                    value = widthRectangle,
                    onValueChange = { widthRectangle = it },
                    label = {
                        Text("Width of Rectangle")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )


                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {
                            val square = Square(sideSquare.toInt())
                            val rectangle = Rectangle(lengthRectangle.toInt(), widthRectangle.toInt())

                            square.resultTitle()
                            outcome += "Perimeter of the square: ${square.calculatePerimeter()}\n"
                            outcome += "Area of the square: ${square.calculateArea()}\n"

                            rectangle.resultTitle()
                            outcome +="Perimeter of the rectangle: ${rectangle.calculatePerimeter()}\n"
                            outcome +="Area of the rectangle: ${rectangle.calculateArea()}\n"
                        },
                        modifier = Modifier.padding(10.dp),


                        ) {
                        Text(text = "Print")
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
                        text = "Project 143",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                OutlinedTextField(
                    value = sideSquare,
                    onValueChange = { sideSquare = it },
                    label = {
                        Text("Side of Square")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                OutlinedTextField(
                    value = lengthRectangle,
                    onValueChange = { lengthRectangle = it },
                    label = {
                        Text("Length of Rectangle")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                OutlinedTextField(
                    value = widthRectangle,
                    onValueChange = { widthRectangle = it },
                    label = {
                        Text("Width of Rectangle")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )


                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {
                            val square = Square(sideSquare.toInt())
                            val rectangle = Rectangle(lengthRectangle.toInt(), widthRectangle.toInt())

                            square.resultTitle()
                            outcome += "Perimeter of the square: ${square.calculatePerimeter()} \n"
                            outcome += "Area of the square: ${square.calculateArea()}\n"

                            rectangle.resultTitle()
                            outcome +="Perimeter of the rectangle: ${rectangle.calculatePerimeter()}\n"
                            outcome +="Area of the rectangle: ${rectangle.calculateArea()}\n"
                        },
                        modifier = Modifier.padding(10.dp),


                        ) {
                        Text(text = "Print")
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

// Interface definition
interface Figure143 {
    fun calculateArea(): Int
    fun calculatePerimeter(): Int
    fun resultTitle() {
        println("Figure Details")
    }
}

// Implementing classes
class Square(val side: Int) : Figure143 {
    override fun calculateArea(): Int {
        return side * side
    }

    override fun calculatePerimeter(): Int {
        return side * 4
    }
}

// Implementing classes
class Rectangle(val length: Int, val width: Int) : Figure143 {
    override fun calculateArea(): Int {
        return length * width
    }

    override fun calculatePerimeter(): Int {
        return (length * 2) + (width * 2)
    }
}