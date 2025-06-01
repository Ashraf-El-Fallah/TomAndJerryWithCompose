package com.example.tomandjerry.composable

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.PrimaryColor

@Composable
fun TextTitle(title: String, fontSize: TextUnit = 14.sp, fontColor: Color = PrimaryColor) {
    Text(
        fontSize = fontSize,
        color = fontColor,
        text = title,
    )
}