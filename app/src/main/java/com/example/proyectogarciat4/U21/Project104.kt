package com.example.proyectogarciat4.U21



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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectogarciat4.ui.theme.Blue20


/**We introduce 4 numbers into each array and add the values that have the same index**/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project104() {
    val configuration = LocalConfiguration.current
    var x by remember { mutableStateOf(1) }
    var varVector1 by remember { mutableStateOf("") }
    var varVector2 by remember { mutableStateOf("") }
    val vector1  by remember { mutableStateOf(IntArray(4)) }
    val vector2  by remember { mutableStateOf(IntArray(4)) }
    var outcome by remember { mutableStateOf("Enter 4 numbers:") }
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
                        text = "Project 104",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }






                OutlinedTextField(
                    value = varVector1,
                    onValueChange = { varVector1 = it },
                    label = {
                        Text("Number one")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,


                    )


                OutlinedTextField(
                    value = varVector2,
                    onValueChange = { varVector2 = it },
                    label = {
                        Text("Number two")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,


                    )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {
                            if (varVector1.toIntOrNull() != null && varVector2.toIntOrNull() != null ) {
                                if (x <= 4) {
                                    vector1[x -1] = varVector1.toInt()
                                    vector2[x -1] = varVector2.toInt()
                                    x++
                                }
                                if(x > 4){
                                    val sumArray = sumArrays(vector1, vector2)
                                    outcome = "Results:"
                                    for(e in sumArray.indices){
                                        outcome += "${sumArray[e]},"
                                    }
                                    vector1.fill(0)
                                    vector2.fill(0)
                                }


                                varVector1 = ""
                                varVector2 = ""
                            } else {
                                outcome = "Introduce numbers please"
                            }
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
                        text = "Project 104",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }




                OutlinedTextField(
                    value = varVector1,
                    onValueChange = { varVector1 = it },
                    label = {
                        Text("Number one")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,


                    )




                OutlinedTextField(
                    value = varVector2,
                    onValueChange = { varVector2 = it },
                    label = {
                        Text("Number two")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    singleLine = true,


                    )


                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {
                            if (varVector1.toIntOrNull() != null && varVector2.toIntOrNull() != null ) {
                                if (x <= 4) {
                                    vector1[x -1] = varVector1.toInt()
                                    vector2[x -1] = varVector2.toInt()
                                    x++
                                }
                                if(x > 4){
                                    x = 1
                                    val sumArray = sumArrays(vector1, vector2)
                                    outcome = "Results:"
                                    for(e in sumArray.indices){
                                        outcome += "${sumArray[e]},"
                                    }
                                    vector1.fill(0)
                                    vector2.fill(0)
                                }


                                varVector1 = ""
                                varVector2 = ""
                            } else {
                                outcome = "Introduce numbers please"
                            }
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


fun sumArrays(numArray1: IntArray , numArray2: IntArray) : IntArray{
    val sumArray = IntArray(4)
    for(i in sumArray.indices){
        sumArray[i] = numArray1[i] + numArray2[i]
    }
    return sumArray
}

