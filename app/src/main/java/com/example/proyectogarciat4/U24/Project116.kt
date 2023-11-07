package com.example.proyectogarciat4.U24

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
import androidx.compose.runtime.mutableStateListOf
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

/**We have a class called "coordinates" that has a method that extracts the quadrant of the coordinate.
 * You enter 5 coordinates per screen and it tells you which quadrant it is in.*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project116() {
    val configuration = LocalConfiguration.current
    val coordinatesList = remember {
        mutableStateListOf<Coordinates>()
    }
    var x by remember { mutableStateOf("") }
    var y by remember { mutableStateOf("") }
    var number by remember { mutableStateOf(1) }
    var outcome by remember { mutableStateOf("Enter a coordinate (x,y)") }
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
                        text = "Project 116",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }




                OutlinedTextField(
                    value = x,
                    onValueChange = { x = it },
                    label = {
                        Text("x")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true
                )
                OutlinedTextField(
                    value = y,
                    onValueChange = { y = it },
                    label = {
                        Text("Y")
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
                            if (x.toIntOrNull() != null && y.toIntOrNull() != null) {
                                outcome= ""
                                if (number <= 5) {
                                    var coordinate = Coordinates()
                                    coordinate.initialize(x.toInt(),y.toInt())
                                    coordinatesList.add(coordinate)
                                    number++
                                }
                                if(number > 5){
                                    for(e in coordinatesList){
                                        outcome += "${e.quadrant()}\n"
                                    }
                                    coordinatesList.clear()
                                    number = 1
                                }
                                x = ""
                                y = ""
                            } else {
                                outcome = "Introduce coordinate (x, y) please"
                            }
                        },
                        modifier = Modifier.padding(10.dp),


                        ) {
                        Text(text = "See quadrant")
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
                        text = "Project 116",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }




                OutlinedTextField(
                    value = x,
                    onValueChange = { x = it },
                    label = {
                        Text("x")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true
                )
                OutlinedTextField(
                    value = y,
                    onValueChange = { y = it },
                    label = {
                        Text("Y")
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
                            if (x.toIntOrNull() != null && y.toIntOrNull() != null) {
                                outcome = ""
                                if (number <= 5) {
                                    var coordinate = Coordinates()
                                    coordinate.initialize(x.toInt(),y.toInt())
                                    coordinatesList.add(coordinate)
                                    number++
                                }
                                if(number > 5){
                                    for(e in coordinatesList){
                                        outcome += "${e.quadrant()}\n"
                                    }
                                    coordinatesList.clear()
                                    number = 1
                                }
                                x = ""
                                y = ""
                            } else {
                                outcome = "Introduce coordinate (x, y) please"
                            }
                        },
                        modifier = Modifier.padding(10.dp),


                        ) {
                        Text(text = "See quadrant")
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




//The coordinates class , with initialization method
class Coordinates() {
   var x: Int = 0
   var y: Int = 0

    fun initialize(x: Int, y: Int){
        this.x= x
        this.y = y
    }
    fun quadrant(): String {
        var text = ""
        if(x> 0 && y > 0){
            text += "First quadrant ($x,$y)"
        }else if(x< 0 && y >0){
            text += "Second quadrant ($x,$y)"
        }else if(x<0 && y<0){
            text += "Third quadrant ($x,$y)"
        }else if( x>0 && y<0){
            text += "Fourth quadrant ($x,$y)"
        }else{
            text += "It is on the coordinate axis ($x,$y)"
        }
        return text
    }

}