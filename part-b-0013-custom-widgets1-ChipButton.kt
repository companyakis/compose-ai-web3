package org.example.design

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Chip(buttonText: String) {

    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = colorPink,
            contentColor = colorBlue2
        )
    ) {
        Text(text = buttonText)
    }

}
