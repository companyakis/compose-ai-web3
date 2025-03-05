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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

    Row(
        modifier = Modifier.fillMaxWidth(),
        //horizontalArrangement = Arrangement.Start
        //horizontalArrangement = Arrangement.End
        //horizontalArrangement = Arrangement.Center
        //horizontalArrangement = Arrangement.SpaceEvenly
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Box(Modifier.size(130.dp).background(Color.Yellow))
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
