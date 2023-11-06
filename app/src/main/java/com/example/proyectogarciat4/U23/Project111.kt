package com.example.proyectogarciat4.U23

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
import java.lang.System.load
import java.lang.System.out

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project111() {
    val configuration = LocalConfiguration.current
    val studentList = remember {
        mutableStateListOf<Student>()
    }
    var nameS by remember { mutableStateOf("") }
    var markS by remember { mutableStateOf("") }
    var x by remember { mutableStateOf(1) }
    var outcome by remember { mutableStateOf("Enter numbers") }
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
                        text = "Project 111",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }




                OutlinedTextField(
                    value = nameS,
                    onValueChange = { nameS = it },
                    label = {
                        Text("Name")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true
                )
                OutlinedTextField(
                    value = markS,
                    onValueChange = { markS = it },
                    label = {
                        Text("Mark")
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
                            if (nameS != null && markS.toIntOrNull() != null) {
                                outcome = ""
                                if(x <= 2){
                                    val newStudent = Student()
                                    newStudent.initialize(nameS,markS.toInt())
                                    studentList.add(newStudent)
                                    x++
                                }

                                if(x > 2){
                                    for(e in studentList){
                                        outcome += "${e.printStudent()}\n"
                                        outcome += "${e.showState()}\n"
                                    }
                                    studentList.clear()
                                    x = 1
                                }

                                markS = ""
                                nameS = ""
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
                        text = "Project 111",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }




                OutlinedTextField(
                    value = nameS,
                    onValueChange = { nameS = it },
                    label = {
                        Text("Name")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true
                )
                OutlinedTextField(
                    value = markS,
                    onValueChange = { markS = it },
                    label = {
                        Text("Mark")
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
                            if (nameS != null && markS.toIntOrNull() != null) {
                                outcome = ""
                                if(x <= 2){
                                    val newStudent = Student()
                                    newStudent.initialize(nameS,markS.toInt())
                                    studentList.add(newStudent)
                                    x++
                                }

                                if(x > 2){
                                    for(e in studentList){
                                        outcome += "${e.printStudent()}\n"
                                        outcome += "${e.showState()}\n"
                                    }
                                    studentList.clear()
                                    x = 1
                                }

                                markS = ""
                                nameS = ""
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


class Student{
    var name: String = ""
    var mark: Int = 0

    fun initialize(name: String, mark: Int){
        this.name= name
        this.mark = mark
    }

    fun printStudent():String{
        val text = "$name has a mark of: $mark"
        return text
    }

    fun showState(): String{
        var text = ""
        if(mark >=4){
            text= "$name is in REGULAR state"
        }else{
            text= "$name is isn't REGULAR state"
        }
        return text
    }
}