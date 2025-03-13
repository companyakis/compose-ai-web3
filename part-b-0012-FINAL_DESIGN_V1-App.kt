package org.example.design


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
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

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorPink,
                        contentColor = colorBlue2
                    )
                ) {
                    Text(text = "Deep R.L.")
                }

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorPink,
                        contentColor = colorBlue2
                    )
                ) {
                    Text(text = "Web 3")
                }

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorPink,
                        contentColor = colorBlue2
                    )
                ) {
                    Text(text = "AI Agents")
                }
            }

            Text(text = "Build Your Future Now!", color = colorBlue2, fontSize = 24.sp, fontWeight = FontWeight.W500)

            Row(

                modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically

            ) {
                Text(text = "Need help?", color = colorBlue2, fontSize = 32.sp, fontWeight = FontWeight.W300)

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorPink,
                        contentColor = colorBlue2
                    )
                ) {
                    Text(text = "CONTACT", fontSize = 20.sp)
                }

            }


        }


    }
}
