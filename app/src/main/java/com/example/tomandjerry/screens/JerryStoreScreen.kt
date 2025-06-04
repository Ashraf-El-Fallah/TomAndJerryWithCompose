package com.example.tomandjerry.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.composable.DefaultIcon
import com.example.tomandjerry.composable.NotificationBadge
import com.example.tomandjerry.composable.ProfileAvatar
import com.example.tomandjerry.composable.SpacerHorizontal
import com.example.tomandjerry.composable.SpacerVertical
import com.example.tomandjerry.composable.TextSubTitle
import com.example.tomandjerry.composable.TextTitle
import com.example.tomandjerry.ui.theme.AliceBlue
import com.example.tomandjerry.ui.theme.BeauBlue
import com.example.tomandjerry.ui.theme.DarkBlue
import com.example.tomandjerry.ui.theme.Gray
import com.example.tomandjerry.ui.theme.IbmPlex
import com.example.tomandjerry.ui.theme.PrimaryColor
import com.example.tomandjerry.ui.theme.SecondaryColor
import com.example.tomandjerry.ui.theme.SkyBlue

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun JerryStoreScreen(modifier: Modifier = Modifier) {
    Scaffold(containerColor = AliceBlue) {
        Column(
            modifier = modifier
                .background(color = AliceBlue)
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(start = 16.dp, bottom = 12.dp, end = 16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    ProfileAvatar(painter = painterResource(R.drawable.profile_image))
                    SpacerHorizontal(8.dp)
                    Column(
                        modifier = Modifier.padding(vertical = 4.5.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        TextTitle(title = stringResource(R.string.hi_jerry))
                        TextSubTitle(subTitle = stringResource(R.string.which_tom_do_you_want_to_buy))
                    }
                }
                BadgedBox(
                    modifier = Modifier
                        .size(40.dp),
                    badge = {
                        NotificationBadge(modifier = Modifier.align(Alignment.TopCenter))
                    }
                ) {
                    DefaultIcon(
                        modifier = Modifier.align(Alignment.Center),
                        painter = painterResource(R.drawable.notification_icon),
                        contentDescription = "notification icon"
                    )
                }
            }
            SpacerVertical(12.dp)
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Card(
                    modifier = Modifier
                        .weight(1f)
                        .clip(RoundedCornerShape(12.dp)),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    )
                ) {
                    Row(
                        modifier = Modifier.padding(12.dp),
                        horizontalArrangement = Arrangement.SpaceAround,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.search_icon),
                            contentDescription = "Search Icon",
                            tint = Gray
                        )
                        SpacerHorizontal(5.dp)
                        TextSubTitle(
                            subTitle = "Search about tom ...",
                            fontSize = 14.sp
                        )
                    }
                }
                SpacerHorizontal(8.dp)
                IconButton(
                    onClick = {},
                    modifier = Modifier
                        .size(48.dp)
                        .background(
                            color = DarkBlue,
                            shape = RoundedCornerShape(12.dp)
                        )
                ) {
                    Icon(
                        painter = painterResource(R.drawable.filter_icon),
                        contentDescription = "Filter Icon",
                        modifier = Modifier.size(24.dp),
                        tint = Color.White
                    )
                }
            }
            SpacerVertical(24.dp)
            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(92.dp),
                    shape = RoundedCornerShape(16.dp),
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.horizontalGradient(
                                    listOf(DarkBlue, SkyBlue)
                                )
                            )
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(12.dp)
                        ) {
                            Text(
                                text = stringResource(R.string.buy_1_tom_and_get_2_for_free),
                                fontSize = 14.sp,
                                color = Color.White,
                                fontFamily = IbmPlex,
                                fontWeight = FontWeight.SemiBold,
                            )
                            SpacerVertical(8.dp)
                            Text(
                                text = stringResource(R.string.adopt_tom_free_fail_free_guarantee),
                                fontSize = 12.sp,
                                color = Color.White.copy(alpha = 0.8f),
                                fontFamily = IbmPlex,
                                fontWeight = FontWeight.Normal,
                            )
                        }
                    }
                }
                Image(
                    modifier = Modifier
                        .width(115.dp)
                        .height(108.dp)
                        .align(Alignment.CenterEnd)
                        .offset(y = (-16).dp),
                    contentDescription = "tom picture",
                    painter = painterResource(R.drawable.tom_picture)
                )
            }
            SpacerVertical(24.dp)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stringResource(R.string.cheap_tom_section),
                    color = PrimaryColor,
                    fontFamily = IbmPlex,
                    fontWeight = FontWeight.W600,
                    fontSize = 20.sp
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "View all",
                        color = DarkBlue,
                        fontWeight = FontWeight.W500,
                        fontSize = 12.sp
                    )
                    SpacerHorizontal(4.dp)
                    Icon(
                        painter = painterResource(R.drawable.arrow_icon),
                        contentDescription = "arrow icon",
                        modifier = Modifier.size(12.dp),
                        tint = DarkBlue
                    )
                }
            }
            SpacerVertical(32.dp)

            Column(
                verticalArrangement = Arrangement.spacedBy(28.dp)
            ) {
                tomCards.chunked(2).forEach { rowItems ->
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        rowItems.forEach { card ->
                            Box(
                                modifier = Modifier.weight(1f)
                            ) {
                                Card(
                                    modifier = Modifier
                                        .clip(shape = RoundedCornerShape(16.dp))
                                        .fillMaxWidth()
                                        .height(260.dp),
                                    colors = CardDefaults.cardColors(containerColor = Color.White),
                                ) {
                                    Column(
                                        modifier = Modifier.padding(
                                            top = 92.dp,
                                            bottom = 8.dp,
                                            start = 8.dp,
                                            end = 8.dp
                                        ),
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center,
                                    ) {
                                        Text(
                                            text = card.title,
                                            color = PrimaryColor,
                                            fontFamily = IbmPlex,
                                            fontWeight = FontWeight.W600,
                                            fontSize = 18.sp
                                        )
                                        Text(
                                            text = card.description,
                                            fontSize = 12.sp,
                                            color = SecondaryColor,
                                            fontFamily = IbmPlex,
                                            fontWeight = FontWeight.W400,
                                            textAlign = TextAlign.Center
                                        )
                                        Spacer(modifier = Modifier.weight(1f))
                                        Row {
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
                                                        text = card.price,
                                                        fontSize = 12.sp,
                                                        fontWeight = FontWeight.W500
                                                    )
                                                }
                                            }
                                            SpacerHorizontal(8.dp)
                                            Icon(
                                                tint = DarkBlue,
                                                painter = painterResource(R.drawable.add_to_cart_icon),
                                                contentDescription = "add to cart icon"
                                            )
                                        }
                                    }
                                }
                                Image(
                                    painter = painterResource(card.imageRes),
                                    modifier = Modifier
                                        .size(100.dp)
                                        .align(Alignment.TopCenter)
                                        .offset(y = (-16).dp),
                                    contentDescription = "tom_card_image",
                                )
                            }
                        }
                        if (rowItems.size == 1) {
                            Spacer(modifier = Modifier.weight(1f))
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun JerryStoreScreenPreview() {
    JerryStoreScreen(
        modifier = Modifier
            .padding(
                start = 16.dp,
                top = 32.dp,
                end = 16.dp,
                bottom = 12.dp
            )
    )
}