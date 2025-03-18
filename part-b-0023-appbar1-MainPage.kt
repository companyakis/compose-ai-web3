package org.example.workstructure

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainPage() {

    Scaffold(topBar = { TopAppBar(title = { Text(text = "Main Page") }) }) {

    }



}
