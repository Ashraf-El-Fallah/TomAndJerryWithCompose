package com.example.tomandjerry.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R

@Composable
fun TomSettingSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
//            .padding(top = 24.dp)
            .padding(horizontal = 22.dp, vertical = 23.dp),
        horizontalAlignment = Start,
    ) {
        Text(
            text = "Tom settings",
            fontSize = 20.sp,
            color = Color.Black.copy(alpha = .87f),
            fontWeight = FontWeight.Bold
        )
        TomAccountComponent(
            painter = R.drawable.settings_icon_1,
            text = "Change sleeping place"
        )
        TomAccountComponent(
            painter = R.drawable.settings_icon_2,
            text = "Meow settings"
        )
        TomAccountComponent(
            painter = R.drawable.settings_icon_3,
            text = "Password to open the fridge"
        )
    }
}