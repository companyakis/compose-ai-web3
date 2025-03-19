package org.example.workstructure

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainPage() {

    val counter = remember { mutableStateOf(0) }


    Scaffold(topBar = { TopAppBar(title = { Text(text = "Simple Counter App", color = Color.Gray, fontSize = 30.sp) }) }) { paddingValues ->


        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Button(onClick = {
                counter.value += 1
            },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White
                )
                ) {
                Text("Counter ++", fontSize = 18.sp)
            }

            Text("Counter value: ${counter.value}", color = Color.Gray, fontSize = 30.sp)

            Button(onClick = {
                counter.value -= 1
            },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White

                )
                ) {
                Text("Counter --", fontSize = 18.sp)
            }
        }

    }



}
