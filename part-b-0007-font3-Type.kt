package org.example.design

import androidx.compose.runtime.Composable

import androidx.compose.ui.text.font.FontFamily
import org.jetbrains.compose.resources.Font
import design_app.composeapp.generated.resources.Res
import design_app.composeapp.generated.resources.roboto




@Composable
fun GetRobotoFontFamily() = FontFamily(Font(Res.font.roboto))
