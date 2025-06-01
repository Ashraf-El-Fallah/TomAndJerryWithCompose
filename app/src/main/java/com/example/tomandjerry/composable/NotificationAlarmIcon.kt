package com.example.tomandjerry.composable

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.ui.theme.SecondaryColor

@Composable
fun NotificationAlarmIcon(
    modifier: Modifier = Modifier,
    painter: Painter,
    contentDescription: String?
) {
    Icon(
        modifier = modifier
            .size(width = 40.dp, height = 40.dp)
            .border(
                width = 1.dp,
                color = SecondaryColor,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(10.dp),
        painter = painter,
        contentDescription = contentDescription
    )
}