package com.example.tomandjerry.screens

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.R
import com.example.tomandjerry.composable.NotificationAlarmIcon
import com.example.tomandjerry.composable.NotificationBadge
import com.example.tomandjerry.composable.ProfileAvatar
import com.example.tomandjerry.composable.SpacerHorizontal
import com.example.tomandjerry.composable.TextSubTitle
import com.example.tomandjerry.composable.TextTitle
import com.example.tomandjerry.ui.theme.SecondaryColor

@Composable
fun JerryStoreScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 16.dp, top = 24.dp, bottom = 12.dp, end = 16.dp)
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
                NotificationAlarmIcon(
                    modifier = Modifier.align(Alignment.Center),
                    painter = painterResource(R.drawable.notification_icon),
                    contentDescription = "notification icon"
                )
            }
        }

        
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun JerryStoreScreenPreview() {
    JerryStoreScreen()
}