package com.example.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.IbmPlex


@Composable
fun BackgroundAccountContent() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.tom_account_image),
            contentDescription = "tom account image",
            modifier = Modifier.size(64.dp),
        )
        SpacerVertical(4.dp)
        Text(
            text = "Tom",
            fontSize = 18.sp,
            fontFamily = IbmPlex,
            fontWeight = FontWeight.Medium,
            color = Color.White
        )
        Text(
            text = "specializes in failure!",
            fontSize = 12.sp,
            fontFamily = IbmPlex,
            fontWeight = FontWeight.Normal,
            color = Color.White.copy(alpha = .8f)
        )
        SpacerVertical(4.dp)
        Button(
            onClick = {},
            modifier = Modifier
                .width(97.dp)
                .height(25.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White.copy(alpha = .12f)),
            shape = RoundedCornerShape(40.dp),
            contentPadding = PaddingValues(0.dp)
        ) {
            Text(
                text = "Edit foolishness",
                color = Color.White,
                fontSize = 10.sp,
                fontWeight = FontWeight.Medium
            )
        }

    }
}