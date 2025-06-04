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
fun TomFavoritesSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 22.dp, vertical = 23.dp),
        horizontalAlignment = Start,
    ) {
        Text(
            text = "His favorite foods",
            fontSize = 20.sp,
            color = Color.Black.copy(alpha = .87f),
            fontWeight = FontWeight.Bold
        )
        TomAccountComponent(
            painter = R.drawable.favorite_food_icon_1,
            text = "Mouses"
        )
        TomAccountComponent(
            painter = R.drawable.favorite_food_icon_2,
            text = "Last stolen meal"
        )
        TomAccountComponent(
            painter = R.drawable.favorite_food_icon_3,
            text = "Change sleep mood"
        )
    }
}