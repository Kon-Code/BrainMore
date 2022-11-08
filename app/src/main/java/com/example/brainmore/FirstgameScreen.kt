package com.example.brainmore

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.destinations.FirstgameScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun FirstgameScreen(
   ) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .clip(
                RoundedCornerShape(
                    topStart = 30.dp,
                    topEnd = 30.dp,
                    bottomStart = 30.dp,
                    bottomEnd = 30.dp
                )
            )
            .background(
                Color(
                    red = 0.6549019813537598f,
                    green = 0.48627451062202454f,
                    blue = 0.7647058963775635f,
                    alpha = 1f
                )
            )
            .padding(start = 0.dp, top = 0.dp, end = 0.dp, bottom = 0.dp)

            .alpha(1f)
    )
    {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
            modifier = Modifier
                .fillMaxSize()
        ) {

            Text(
                textAlign = TextAlign.Center,
                lineHeight = 20.sp,
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Color.White,
                            fontSize = 32.sp
                        )
                    ) { append("Powtarzaj sekwencje") }
                    withStyle(
                        style = SpanStyle(
                            color = Color.White,
                            fontSize = 32.sp
                        )
                    ) { append(" ") }
                })
        }
        Row(
            modifier = Modifier
                .height(323.dp)
                .width(360.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Column(
                modifier = Modifier
                    .height(366.dp)
                    .width(160.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.SpaceBetween,
            )
            {

                Box(
                    modifier = Modifier
                        .size(size = 160.dp)
                        .background(color = Color.Blue)
                        .clickable { }

                )
                Box(
                    modifier = Modifier
                        .size(size = 160.dp)
                        .background(color = Color.Red)
                        .clickable { }
                )

            }
            Column(
                modifier = Modifier
                    .height(366.dp)
                    .width(160.dp),
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.SpaceBetween,
            ) {

                Box(
                    modifier = Modifier
                        .size(size = 160.dp)
                        .background(color = Color.Green)
                        .clickable { }


                )

                Box(
                    modifier = Modifier
                        .size(size = 160.dp)
                        .background(color = Color.Yellow)
                        .clickable { })
            }
        }
    }
}




