package org.example.design


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App() {
    MaterialTheme {

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly

        ) {

            Box(
                Modifier.size(220.dp).background(Color.Blue)
            ) {
                Text("txt 1", modifier = Modifier.align(Alignment.BottomCenter), color = Color.LightGray, fontSize = 25.sp)

                Text("txt2 ", modifier = Modifier.align(Alignment.TopStart), color = Color.White, fontSize = 30.sp)

                Text("txt 3", modifier = Modifier.align(Alignment.Center), color = Color.Yellow, fontSize = 28.sp)
            }

        }
        
    }
}
