package com.example.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

@Composable
fun ProfileAvatar(painter: Painter, modifier: Modifier = Modifier) {
    Image(
        modifier = modifier.size(48.dp),
        painter = painter,
        contentDescription = "Jerry profile picture"
    )
}