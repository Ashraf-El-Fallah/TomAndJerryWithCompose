package com.example.tomandjerry.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.composable.BackgroundAccountContent
import com.example.tomandjerry.composable.SatesSection
import com.example.tomandjerry.composable.TomAccountBackGround
import com.example.tomandjerry.composable.TomFavoritesSection
import com.example.tomandjerry.composable.TomSettingSection
import com.example.tomandjerry.ui.theme.IbmPlex

@Composable
fun TomAccountScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        TomAccountBackGround(modifier.align(Alignment.TopCenter))
        BackgroundAccountContent()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 171.dp)
                .verticalScroll(rememberScrollState()),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                    .background(Color(0xFFEEF4F6))
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 24.dp),
                    horizontalAlignment = CenterHorizontally,
                ) {
                    SatesSection()
                    TomSettingSection()
                    HorizontalDivider(
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                    TomFavoritesSection()
                    Text(
                        modifier = Modifier.padding(24.dp),
                        text = "v.TomBeta",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        fontFamily = IbmPlex,
                        color = Color.Black.copy(alpha = .6f)
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TomAccountScreenPreview() {
    TomAccountScreen(
        modifier = Modifier
            .padding(
                top = 36.dp,
                bottom = 12.dp
            )
    )
}