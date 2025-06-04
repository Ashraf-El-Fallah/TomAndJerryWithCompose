package com.example.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R

@Composable
fun CardState(painter: Int, title: String, subTitle: String, color: Color) {
    Card(
        modifier = Modifier
            .height(58.dp)
            .width(160.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
//            containerColor = Color(0xFFD0E5F0)
            containerColor = color
        )
    ) {
        Box(modifier = Modifier.padding(vertical = 10.dp, horizontal = 8.dp)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Image(
                    painter = painterResource(painter),
                    contentDescription = "State Icon"
                )
                Column {
                    Text(
                        text = title,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0x99121212).copy(alpha = .6f),
                        fontSize = 16.sp
                    )
                    Text(
                        text = subTitle,
                        fontWeight = FontWeight.Medium,
                        color = Color(0x5E121212).copy(alpha = .37f),
                        fontSize = 12.sp
                    )
                }
            }
        }
    }
}