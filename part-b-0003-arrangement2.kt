package org.example.design


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
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

        Row(
            modifier = Modifier.fillMaxWidth(),
            //horizontalArrangement = Arrangement.Center
            //horizontalArrangement = Arrangement.Start
            //horizontalArrangement = Arrangement.End
            //horizontalArrangement = Arrangement.SpaceAround
            //horizontalArrangement = Arrangement.SpaceEvenly
            horizontalArrangement = Arrangement.SpaceBetween

        ) {

            Box(modifier = Modifier.size(110.dp).background(Color.Blue))
            Box(modifier = Modifier.size(85.dp).background(Color.Green))
            Box(modifier = Modifier.size(70.dp).background(Color.Red))
        }


    }
}
