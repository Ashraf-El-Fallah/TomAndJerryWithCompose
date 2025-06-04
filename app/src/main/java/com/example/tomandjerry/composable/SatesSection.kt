package com.example.tomandjerry.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.R

@Composable
fun SatesSection() {
    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        CardState(
            R.drawable.stat_icon,
            title = "2M 12K",
            subTitle = "No. of quarrels",
            color = Color(0xFFD0E5F0)
        )
        CardState(
            R.drawable.state_icon_run,
            title = "+500 h",
            subTitle = "Chase time",
            color = Color(0xFFDEEECD)
        )
    }
    SpacerVertical(8.dp)
    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        CardState(
            R.drawable.stat_icon_smile,
            title = "2M 12K",
            subTitle = "Hunting times",
            color = Color(0xFFF2D9E7)
        )
        CardState(
            R.drawable.stat_icon_heart,
            title = "3M 7K",
            subTitle = "Heartbroken",
            color = Color(0xFFFAEDCF)
        )
    }
}