package com.example.learnandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learnandroid.ui.theme.LearnAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnAndroidTheme {

                MainApp()

                }
            }
        }
    }


@Composable
fun MainApp() {

    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        //horizontalAlignment = Alignment.Start
        //horizontalAlignment = Alignment.End
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Box(Modifier.size(140.dp).background(Color.Yellow))
        Box(Modifier.size(100.dp).background(Color.Green))
        Box(Modifier.size(80.dp).background(Color.Blue))
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnAndroidTheme {
        MainApp()
    }
}
