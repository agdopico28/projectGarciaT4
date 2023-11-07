//package com.example.proyectogarciat4.U26
//
//import android.content.res.Configuration
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.rememberScrollState
//import androidx.compose.foundation.verticalScroll
//import androidx.compose.material3.Button
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.OutlinedTextField
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.platform.LocalConfiguration
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.proyectogarciat4.ui.theme.Blue20
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun Project118() {
//    val configuration = LocalConfiguration.current
//
//    var name by remember { mutableStateOf("") }
//    var antiquity by remember { mutableStateOf("") }
//    var outcome by remember { mutableStateOf("") }
//    when (configuration.orientation) {
//        Configuration.ORIENTATION_LANDSCAPE -> {
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .verticalScroll(rememberScrollState()),
//                verticalArrangement = Arrangement.Top
//            ) {
//
//                Row(
//                    Modifier
//                        .padding(top = 20.dp)
//                        .fillMaxWidth(),
//                    verticalAlignment = Alignment.CenterVertically,
//                    horizontalArrangement = Arrangement.Center
//                )
//                {
//                    Text(
//                        text = "Project 118",
//                        textAlign = TextAlign.Center,
//                        color = Blue20,
//                        fontSize = 30.sp,
//                        fontWeight = FontWeight.Bold
//                    )
//                }
//
//
//
//
//                OutlinedTextField(
//                    value = name,
//                    onValueChange = { name = it },
//                    label = {
//                        Text("ages")
//                    },
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(10.dp),
//                    singleLine = true
//                )
//
//                OutlinedTextField(
//                    value = antiquity,
//                    onValueChange = { antiquity = it },
//                    label = {
//                        Text("ages")
//                    },
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(10.dp),
//                    singleLine = true
//                )
//
//
//                Row(
//                    modifier = Modifier.fillMaxWidth(),
//                    horizontalArrangement = Arrangement.Center,
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    Button(
//                        onClick = {
//                            if (name!= null ) {
//                                val partner = Pratner().apply { constructor(name, antiquity.toInt()) }
//                                val club = Club().apply { load(partner) }
//                                val hight = club.longestPartner()
//                                outcome += "The oldest son has $hight"
//                            } else {
//                                outcome = "Introduce numbers separated by comas please"
//                            }
//                        },
//                        modifier = Modifier.padding(10.dp),
//
//
//                        ) {
//                        Text(text = "Calculate")
//                    }
//                }
//                Text(
//                    text = outcome,
//                    modifier = Modifier.padding(20.dp),
//                )
//            }
//        }
//
//
//        else -> {
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .verticalScroll(rememberScrollState()),
//                verticalArrangement = Arrangement.Top
//            ) {
//
//
//                Row(
//                    Modifier
//                        .padding(top = 20.dp)
//                        .fillMaxWidth(),
//                    verticalAlignment = Alignment.CenterVertically,
//                    horizontalArrangement = Arrangement.Center
//                )
//                {
//                    Text(
//                        text = "Project 118",
//                        textAlign = TextAlign.Center,
//                        color = Blue20,
//                        fontSize = 30.sp,
//                        fontWeight = FontWeight.Bold
//                    )
//                }
//
//
//
//
//                OutlinedTextField(
//                    value = name,
//                    onValueChange = { name = it },
//                    label = {
//                        Text("ages")
//                    },
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(10.dp),
//                    singleLine = true
//                )
//
//
//
//                Row(
//                    modifier = Modifier.fillMaxWidth(),
//                    horizontalArrangement = Arrangement.Center,
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    Button(
//                        onClick = {
//                            if (name != null ) {
//                                val kids = Kids().apply { load(name) }
//                                val hight = kids.higherAge()
//                                val average = kids.average()
//                                outcome += "The oldest son has $hight and the average age is $average"
//                            } else {
//                                outcome = "Introduce numbers separated by comas please"
//                            }
//                        },
//                        modifier = Modifier.padding(10.dp),
//
//
//                        ) {
//                        Text(text = "Calculate")
//                    }
//                }
//                Text(
//                    text = outcome,
//                    modifier = Modifier.padding(20.dp),
//                )
//            }
//        }
//    }
//}
//
//
//
//
////The Club class , with constructor method
//class Club() {
//    var partners: Array<Pratner>
//
//
//    fun load(partnerStr : Pratner){
//        var text = ""
//        val partnerEnter
//        if(partnerEnter.size == 5){
//            partners = partnerEnter
//        }else{
//            text += "Enter 3 partners separated by comas"
//        }
//    }
//
//    fun longestPartner(): Int{
//        return partners.maxOrNull() ?: 0
//    }
//
//
//}
//
//class Pratner() {
//    var name: String = ""
//    var antiquity: Int = 0
//
//    fun constructor(name: String, antiquity: Int){
//        this.name = name
//        this.antiquity = antiquity
//    }
//
//}