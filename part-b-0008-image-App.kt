package org.example.design


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import design_app.composeapp.generated.resources.Res
import design_app.composeapp.generated.resources.aiwebthree
import org.jetbrains.compose.resources.painterResource
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

            Text(text = "AI and Web3", color = colorBlue2, fontSize = 35.sp, fontFamily = GetRobotoFontFamily())
            
            Image(painter = painterResource(Res.drawable.aiwebthree), contentDescription = "ai and web3")


        }


    }
}
