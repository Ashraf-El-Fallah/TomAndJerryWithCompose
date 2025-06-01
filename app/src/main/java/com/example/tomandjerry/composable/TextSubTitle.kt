package com.example.tomandjerry.composable

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.SecondaryColor

@Composable
fun TextSubTitle(subTitle: String, fontSize: TextUnit = 12.sp, fontColor: Color = SecondaryColor) {
    Text(
        fontSize = fontSize,
        color = fontColor,
        text = subTitle,
    )
}