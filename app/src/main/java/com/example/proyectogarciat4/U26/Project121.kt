package com.example.proyectogarciat4.U26

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

/**Two classes, one Member and the other Club.
 * That of Partner with two variables (name and seniority).
 * In Club you have two methods, one to add a method and another to remove the oldest member.
 * You enter the name and seniority of the member on the screen, and it will show the oldest*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project121() {
    val configuration = LocalConfiguration.current

    val club = remember { Club() }
    var name by remember { mutableStateOf("") }
    var seniority by remember { mutableStateOf("") }

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
                        text = "Project 121",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }




                OutlinedTextField(
                    value = name,
                    onValueChange = { name = it },
                    label = {
                        Text("Name")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

                )
                OutlinedTextField(
                    value = seniority,
                    onValueChange = { seniority = it },
                    label = {
                        Text("Seniority in the club (years)")
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
                            if (name.isNotBlank() && seniority.toIntOrNull() != null) {
                                club.addMember(Partner(name, seniority.toInt()))
                                name = ""
                                seniority = ""
                                val mostSeniorMember = club.memberWithMostSeniority()
                                outcome = if (mostSeniorMember != null) {
                                    "The member with the most seniority is ${mostSeniorMember.name}, " +
                                            "with ${mostSeniorMember.seniority} years in the club."
                                } else {
                                    "No members in the club yet."
                                }
                                outcome +=""
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
                        text = "Project 121",
                        textAlign = TextAlign.Center,
                        color = Blue20,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }




                OutlinedTextField(
                    value = name,
                    onValueChange = { name = it },
                    label = {
                        Text("Name")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

                )
                OutlinedTextField(
                    value = seniority,
                    onValueChange = { seniority = it },
                    label = {
                        Text("Seniority in the club (years)")
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
                            if (name.isNotBlank() && seniority.toIntOrNull() != null) {
                                club.addMember(Partner(name, seniority.toInt()))
                                name = ""
                                seniority = ""
                                val mostSeniorMember = club.memberWithMostSeniority()
                                outcome = if (mostSeniorMember != null) {
                                    "The member with the most seniority is ${mostSeniorMember.name}, " +
                                            "with ${mostSeniorMember.seniority} years in the club."
                                } else {
                                    "No members in the club yet."
                                }
                                outcome +=""
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




//The Partner class
class Partner(val name: String, val seniority: Int)
//The Club class
class Club {
    private var members = arrayOf<Partner>()

    fun addMember(member: Partner) {
        if (members.size < 3) {
            members += member
        } else {
            println("The club already has 3 members.")
        }
    }

    fun memberWithMostSeniority(): Partner? {
        return members.maxByOrNull { it.seniority }
    }
}