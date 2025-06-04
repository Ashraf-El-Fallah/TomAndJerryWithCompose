package com.example.tomandjerry.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.CardTemp

@Composable
fun PreparationCard(numberOfStep: String, description: String) {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color.White),
        modifier = Modifier
            .fillMaxWidth()
            .clip(
                RoundedCornerShape(
                    topStart = 55.dp,
                    bottomStart = 30.dp,
                    bottomEnd = 11.dp,
                    topEnd = 10.dp
                )
            )
            .padding(top = 8.dp),
//        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Box(
                modifier = Modifier
                    .width(37.dp)
                    .height(37.dp)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFD0E5F0),
                        shape = CircleShape
                    )
                    .background(color = Color.White, shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = numberOfStep,
                    color = Color(0xFF035587),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )

            }
            SpacerHorizontal(8.dp)
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.align(Alignment.CenterVertically)
            ) {
                Text(
                    text = description,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black.copy(alpha = .6f)
                )
            }
        }
    }
}