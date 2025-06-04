package com.example.tomandjerry.screens

import AddToCartButton
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.composable.CardDetails
import com.example.tomandjerry.composable.PreparationCard
import com.example.tomandjerry.composable.SpacerHorizontal
import com.example.tomandjerry.composable.SpacerVertical
import com.example.tomandjerry.ui.theme.AliceBlue
import com.example.tomandjerry.ui.theme.BeauBlue
import com.example.tomandjerry.ui.theme.ButtonAddToCart
import com.example.tomandjerry.ui.theme.DarkBlue
import com.example.tomandjerry.ui.theme.IbmPlex

@Composable
fun TomKitChenScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
    ) {
        TomKitchenBackgroundOnly()
        Column(modifier = Modifier.fillMaxSize()) {
            SpacerVertical(165.dp)
            Card(
                shape = RoundedCornerShape(
                    topStart = 16.dp, topEnd = 16.dp
                ),
                colors = CardDefaults.cardColors(containerColor = AliceBlue),
                modifier = Modifier.fillMaxWidth(),
            ) {
                Column(Modifier.padding(horizontal = 16.dp, vertical = 16.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.Top
                    ) {
                        Column {
                            Text(
                                text = "Electric Tom pasta",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.W500,
                                fontFamily = IbmPlex,
                                color = Color.Black.copy(alpha = .87f)
                            )
                            SpacerVertical(12.dp)
                            Button(
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = BeauBlue,
                                    contentColor = DarkBlue
                                ),
                                modifier = Modifier
                                    .clip(RoundedCornerShape(8.dp))
                                    .width(106.dp)
                                    .height(30.dp),
                                contentPadding = PaddingValues(
                                    horizontal = 8.dp,
                                    vertical = 4.dp
                                ),
                                onClick = { },
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxSize(),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.Center
                                ) {
                                    Icon(
                                        modifier = Modifier.size(16.dp),
                                        painter = painterResource(R.drawable.money_bag_icon),
                                        contentDescription = "money bag icon"
                                    )
                                    SpacerHorizontal(4.dp)
                                    Text(
                                        text = "5 cheeses",
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.W500
                                    )
                                }
                            }
                        }
                        Icon(
                            painter = painterResource(R.drawable.favorite_icon),
                            contentDescription = "favorite icon",
                            modifier = Modifier
                                .padding(top = 25.dp)
                                .size(24.dp),
                            tint = DarkBlue
                        )
                    }

                    Box(Modifier.padding(top = 8.dp), contentAlignment = Alignment.Center) {
                        Text(
                            text = stringResource(R.string.pasta_cooked_with_a_charger_cable),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.W500,
                            fontFamily = IbmPlex,
                            color = Color(0xFF121212).copy(alpha = .6f)
                        )
                    }

                    Box(modifier = Modifier.padding(top = 24.dp)) {
                        Text(
                            text = stringResource(R.string.details),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.W500,
                            fontFamily = IbmPlex,
                            color = Color(0xFF1F1F1E).copy(alpha = .87f)
                        )
                        Row(
                            modifier = Modifier
                                .padding(top = 36.dp)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            CardDetails(
                                painter = R.drawable.temperature_icon,
                                value = "1000 V",
                                type = "Temperature",
                            )
                            CardDetails(
                                painter = R.drawable.timer_icon,
                                value = "3 Sparks",
                                type = "Time",
                            )
                            CardDetails(
                                painter = R.drawable.devil_icon,
                                value = "1M 12K",
                                type = "No. of deaths",
                            )
                        }
                    }

                    SpacerVertical(24.dp)
                    Column {
                        Text(
                            text = stringResource(R.string.preparation_method),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.W500,
                            color = Color(0xFF1F1F1E).copy(alpha = .87f)
                        )
                        SpacerVertical(8.dp)
                        PreparationCard(
                            numberOfStep = "1",
                            description = "Put the pasta in a toaster."
                        )
                        PreparationCard(
                            numberOfStep = "2",
                            description = "Pour battery juice over it."
                        )
                        PreparationCard(
                            numberOfStep = "3",
                            description = "Wait for the spark to ignite."
                        )
                        PreparationCard(
                            numberOfStep = "4",
                            description = "Serve with an insulating glove."
                        )
                    }
                }
                AddToCartButton()

//                Box(
//                    contentAlignment = Alignment.Center,
//                    modifier = Modifier
//                        .align(Alignment.CenterHorizontally)
//                        .padding(8.dp)
//                ) {
//                    Button(
//                        onClick = {},
//                        colors = ButtonDefaults.buttonColors(containerColor = ButtonAddToCart),
//                        modifier = Modifier
//                            .clip(RoundedCornerShape(16.dp))
//                            .width(328.dp)
//                            .height(56.dp)
//                    ) {
//                        Row(
//                            horizontalArrangement = Arrangement.Center,
//                            verticalAlignment = Alignment.CenterVertically
//                        ) {
//                            Text(
//                                text = "Add to cart",
//                                fontFamily = IbmPlex,
//                                fontSize = 16.sp,
//                                fontWeight = FontWeight.Medium,
//                            )
//                            SpacerHorizontal(8.dp)
//                            Icon(
//                                painter = painterResource(R.drawable.dot_icon),
//                                contentDescription = null,
//                                tint = Color.White.copy(alpha = .38f),
//                                modifier = Modifier.padding(10.dp)
//                            )
//                            SpacerHorizontal(8.dp)
//                            Column(verticalArrangement = Arrangement.Center) {
//                                Text(
//                                    text = "3 cheeses",
//                                    fontSize = 14.sp,
//                                    fontWeight = FontWeight.Medium,
//                                    color = Color.White.copy(alpha = 1f)
//                                )
//                                Text(
//                                    text = " 5 cheeses",
//                                    fontSize = 12.sp,
//                                    textDecoration = TextDecoration.LineThrough,
//                                    fontWeight = FontWeight.Medium,
//                                    color = Color.White.copy(alpha = .8f)
//                                )
//                            }
//                        }
//                    }
//                }
//            }
//            Box(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(86.dp)
//                    .align(Alignment.BottomCenter),
//                contentAlignment = Alignment.Center
//            )
                // {

            }
        }
        Image(
            painter = painterResource(R.drawable.dish_of_pasta),
            contentDescription = "dish of pasta",
            modifier = Modifier
                .offset(x = 165.dp, y = 20.dp)
                .height(168.dp)
                .width(188.dp)
        )
    }
}

@Composable
fun TomKitchenBackgroundOnly() {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Color(0x80035484)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(R.drawable.tom_kitchen_background),
                contentDescription = "tom Kitchen",
                contentScale = ContentScale.Crop,
            )
            Column(modifier = Modifier.padding(top = 40.dp, start = 16.dp)) {
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
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TomKitChenScreenPreview() {
    TomKitChenScreen(
        modifier = Modifier
            .padding(
                top = 32.dp,
                bottom = 15.dp
            )
    )
}