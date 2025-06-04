package com.example.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.IbmPlex

@Composable
fun TomKitchenBackground() {
    val screenWidth = LocalConfiguration.current.screenWidthDp
    val screenHeight = LocalConfiguration.current.screenHeightDp

    Box(modifier = Modifier.fillMaxWidth()) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            color = Color(0x80035484)
        ) {
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    painter = painterResource(R.drawable.tom_kitchen_background),
                    contentDescription = "tom Kitchen",
                    contentScale = ContentScale.Crop,
                )
                Column(modifier = Modifier.padding(start = 16.dp, top = 40.dp)) {
                    Row {
                        Icon(
                            painter = painterResource(R.drawable.ruler_icon),
                            contentDescription = stringResource(R.string.ruler_icon),
                            tint = Color.White,
                            modifier = Modifier.size(24.dp)
                        )
                        SpacerHorizontal(8.dp)
                        Text(
                            text = "High tension",
                            color = Color.White.copy(alpha = .87f),
                            fontWeight = FontWeight.W500,
                            fontSize = 16.sp,
                            fontFamily = IbmPlex
                        )
                    }
                    SpacerVertical(16.dp)
                    Row {
                        Icon(
                            painter = painterResource(R.drawable.chef),
                            contentDescription = "ruler icon",
                            tint = Color.White,
                            modifier = Modifier.size(24.dp)
                        )
                        SpacerHorizontal(8.dp)
                        Text(
                            text = stringResource(R.string.shocking_foods),
                            color = Color.White.copy(alpha = .87f),
                            fontWeight = FontWeight.W500,
                            fontSize = 16.sp,
                            fontFamily = IbmPlex
                        )
                    }
                }
            }
        }
        Image(
            painter = painterResource(R.drawable.dish_of_pasta),
            contentDescription = "dish of pasta",
            modifier = Modifier
                .offset(x = 180.dp, y = 60.dp)
                .height(168.dp)
                .width(188.dp)
        )
    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TomKitchenBackgroundPreview() {
    TomKitchenBackground()
}