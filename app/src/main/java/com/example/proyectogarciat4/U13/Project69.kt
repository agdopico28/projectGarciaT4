package com.example.proyectogarciat4.U13

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

/**Enter the number of children each family has and return how many families have 0, 1, 2 or more children*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project69(){
    val configuration = LocalConfiguration.current
    var numberKids by remember { mutableStateOf("") }
    var outcome by remember { mutableStateOf("") }
    var x by remember { mutableStateOf(1) }
    var left by remember { mutableStateOf(10) }
    var ceroKid by remember { mutableStateOf(0) }
    var oneKid by remember { mutableStateOf(0) }
    var twoKids by remember { mutableStateOf(0) }
    var moreKids by remember { mutableStateOf(0) }
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()),
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
                        text = "Project 69",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }



                OutlinedTextField(
                    value = numberKids,
                    onValueChange = { numberKids = it },
                    label = {
                        Text("Number children")
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
                            if (numberKids.toIntOrNull() != null) {
                                if (x < 10){
                                    left--
                                    outcome = "$left number/s left"
                                    if (numberKids.toInt() == 0) {
                                        ceroKid++
                                    }else if (numberKids.toInt() == 1) {
                                        oneKid++
                                    }else if (numberKids.toInt() == 2) {
                                        twoKids++
                                    }else{
                                        moreKids++
                                    }
                                    x++
                                } else {
                                    if (numberKids.toInt() == 0) {
                                        ceroKid++
                                    }else if (numberKids.toInt() == 1) {
                                        oneKid++
                                    }else if (numberKids.toInt() == 2) {
                                        twoKids++
                                    }else{
                                        moreKids++
                                    }
                                    outcome = "Cero children: $ceroKid\n" +
                                            "One children: $oneKid\n" +
                                            "Two children: $twoKids\n" +
                                            "More children: $moreKids"
                                    ceroKid = 0
                                    oneKid = 0
                                    twoKids = 0
                                    moreKids = 0
                                    x = 1
                                    left = 10
                                }
                            } else {
                                outcome = "Introduce a number"
                            }
                            numberKids = ""
                        },
                        modifier = Modifier.padding(10.dp),

                        ) {
                        Text(text = "Calculate")
                    }
                }
                Text(
                    text = outcome,
                    modifier = Modifier.padding(bottom = 20.dp),
                )
            }
        }

        else -> {
            Column(
                modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()),
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
                        text = "Project 69",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }



                OutlinedTextField(
                    value = numberKids,
                    onValueChange = { numberKids = it },
                    label = {
                        Text("Number children")
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
                            if (numberKids.toIntOrNull() != null) {
                                if (x < 10){
                                    left--
                                    outcome = "$left number/s left"
                                    if (numberKids.toInt() == 0) {
                                        ceroKid++
                                    }else if (numberKids.toInt() == 1) {
                                        oneKid++
                                    }else if (numberKids.toInt() == 2) {
                                        twoKids++
                                    }else{
                                        moreKids++
                                    }
                                    x++
                                } else {
                                    if (numberKids.toInt() == 0) {
                                        ceroKid++
                                    }else if (numberKids.toInt() == 1) {
                                        oneKid++
                                    }else if (numberKids.toInt() == 2) {
                                        twoKids++
                                    }else{
                                        moreKids++
                                    }
                                    outcome = "Cero children: $ceroKid\n" +
                                            "One children: $oneKid\n" +
                                            "Two children: $twoKids\n" +
                                            "More children: $moreKids"
                                    ceroKid = 0
                                    oneKid = 0
                                    twoKids = 0
                                    moreKids = 0
                                    x = 1
                                    left = 10
                                }
                            } else {
                                outcome = "Introduce a number"
                            }
                            numberKids = ""
                        },
                        modifier = Modifier.padding(10.dp),

                        ) {
                        Text(text = "Calculate")
                    }
                }
                Text(
                    text = outcome,
                    modifier = Modifier.padding(bottom = 20.dp),
                )
            }
        }
    }
}