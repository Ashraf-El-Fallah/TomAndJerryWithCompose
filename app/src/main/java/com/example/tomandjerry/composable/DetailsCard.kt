package com.example.tomandjerry.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.CardTemp
import com.example.tomandjerry.ui.theme.IbmPlex
import com.example.tomandjerry.ui.theme.LightBlue
import com.example.tomandjerry.ui.theme.SkyBlue

@Composable
fun CardDetails(painter: Int, value: String, type: String) {
    Card(
        colors = CardDefaults.cardColors(containerColor = LightBlue),
        modifier = Modifier
            .height(109.dp)
            .width(104.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Icon(
                painter = painterResource(painter),
                contentDescription = "temperature icon",
                tint = Color(0xFF035587)
            )
            Text(
                text = value,
                color = Color.Black.copy(alpha = .6f),
                fontSize = 14.sp,
                fontWeight = FontWeight.W500
            )
            Text(
                text = type,
                color = Color.Black.copy(alpha = .37f),
                fontSize = 12.sp,
                fontFamily = IbmPlex,
                fontWeight = FontWeight.W500,
            )

        }
    }
}