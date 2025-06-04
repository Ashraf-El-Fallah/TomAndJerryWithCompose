package com.example.tomandjerry.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Badge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.DarkBlue
import com.example.tomandjerry.ui.theme.IbmPlex

@Composable
fun NotificationBadge(
    modifier: Modifier = Modifier,
    containerColor: Color = DarkBlue,
    contentColor: Color = Color.White
) {
    Badge(
        containerColor = containerColor,
        contentColor = contentColor,
        modifier = modifier
            .size(16.dp)
    ) {
        Text(
            "3",
            fontSize = 10.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.W500,
            fontFamily = IbmPlex
        )
    }
}