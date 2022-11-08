package com.example.dodatek

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.brainmore.FirstgameScreen
import com.example.brainmore.ui.theme.Screen
import com.example.destinations.DetailScreenDestination
import com.example.destinations.FirstgameScreenDestination
import com.example.destinations.MainScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun DetailScreen(
    navigator: DestinationsNavigator) {
    Box(

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
            .border(
                1.dp,
                Color(red = 0f, green = 0f, blue = 0f, alpha = 1f),
                RoundedCornerShape(
                    topStart = 30.dp,
                    topEnd = 30.dp,
                    bottomStart = 30.dp,
                    bottomEnd = 30.dp
                )
            )
            .padding(start = 0.dp, top = 0.dp, end = 0.dp, bottom = 0.dp)
            .alpha(1f)


    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {


            Text(
                text = "Wybierz mini grę",
                textAlign = TextAlign.Center,
                fontSize = 30.sp,
                textDecoration = TextDecoration.None,
                letterSpacing = 0.10000000149011612.sp,
                lineHeight = 20.sp,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
                    .width(231.dp)
                    .height(76.dp)
                    .alpha(1f),
                color = Color(red = 1f, green = 1f, blue = 1f, alpha = 1f),
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Normal,
            )

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
                modifier = Modifier

                    .width(339.dp)
                    .height(94.dp)
                    .clickable { navigator.navigate(FirstgameScreenDestination()) }
                    .clip(
                        RoundedCornerShape(
                            topStart = 100.dp,
                            topEnd = 100.dp,
                            bottomStart = 100.dp,
                            bottomEnd = 100.dp
                        )
                    )

                    .background(
                        Color(
                            red = 0.47979167103767395f,
                            green = 0.14291667938232422f,
                            blue = 0.8166666626930237f,
                            alpha = 1f
                        )
                    )
                    .padding(start = 0.dp, top = 0.dp, end = 0.dp, bottom = 0.dp)

                    .alpha(0.800000011920929f)


            ) {


                Text(
                    text = "Pamieć ",
                    textAlign = TextAlign.Center,
                    fontSize = 30.sp,
                    textDecoration = TextDecoration.None,
                    letterSpacing = 0.10000000149011612.sp,
                    lineHeight = 20.sp,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier

                        .width(110.dp)
                        .height(40.dp)
                        .alpha(1f),
                    color = Color(red = 1f, green = 1f, blue = 1f, alpha = 1f),
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Normal,
                )

            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
                modifier = Modifier

                    .width(339.dp)
                    .height(94.dp)
                    .clip(
                        RoundedCornerShape(
                            topStart = 100.dp,
                            topEnd = 100.dp,
                            bottomStart = 100.dp,
                            bottomEnd = 100.dp
                        )
                    )

                    .background(
                        Color(
                            red = 0.47979167103767395f,
                            green = 0.14291667938232422f,
                            blue = 0.8166666626930237f,
                            alpha = 1f
                        )
                    )


                    .padding(start = 0.dp, top = 0.dp, end = 0.dp, bottom = 0.dp)

                    .alpha(0.800000011920929f)


            ) {
                Text(
                    text = "Rozumowanie",
                    textAlign = TextAlign.Center,
                    fontSize = 30.sp,
                    textDecoration = TextDecoration.None,
                    letterSpacing = 0.10000000149011612.sp,
                    lineHeight = 20.sp,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier

                        .width(200.dp)

                        .height(40.dp)

                        .alpha(1f),
                    color = Color(red = 1f, green = 1f, blue = 1f, alpha = 1f),
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Normal,
                )

            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
                modifier = Modifier
                    .width(339.dp)
                    .height(94.dp)
                    .clip(
                        RoundedCornerShape(
                            topStart = 100.dp,
                            topEnd = 100.dp,
                            bottomStart = 100.dp,
                            bottomEnd = 100.dp
                        )
                    )
                    .background(
                        Color(
                            red = 0.47979167103767395f,
                            green = 0.14291667938232422f,
                            blue = 0.8166666626930237f,
                            alpha = 1f
                        )
                    )

                    .padding(start = 0.dp, top = 0.dp, end = 0.dp, bottom = 0.dp)

                    .alpha(0.800000011920929f)


            ) {
                Text(
                    text = "Uwaga",
                    textAlign = TextAlign.Center,
                    fontSize = 30.sp,
                    textDecoration = TextDecoration.None,
                    letterSpacing = 0.10000000149011612.sp,
                    lineHeight = 20.sp,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier

                        .width(97.dp)

                        //.height(20.dp)

                        .alpha(1f),
                    color = Color(red = 1f, green = 1f, blue = 1f, alpha = 1f),
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Normal,
                )

            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
                modifier = Modifier

                    .width(339.dp)
                    .height(94.dp)
                    .clip(
                        RoundedCornerShape(
                            topStart = 100.dp,
                            topEnd = 100.dp,
                            bottomStart = 100.dp,
                            bottomEnd = 100.dp
                        )
                    )
                    .background(
                        Color(
                            red = 0.47979167103767395f,
                            green = 0.14291667938232422f,
                            blue = 0.8166666626930237f,
                            alpha = 1f
                        )
                    )

                    .padding(start = 0.dp, top = 0.dp, end = 0.dp, bottom = 0.dp)

                    .alpha(0.800000011920929f)


            ) {
                Text(
                    text = "Refleks",
                    textAlign = TextAlign.Center,
                    fontSize = 30.sp,
                    textDecoration = TextDecoration.None,
                    letterSpacing = 0.10000000149011612.sp,
                    lineHeight = 20.sp,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier

                        .width(110.dp)

                        .height(40.dp)

                        .alpha(1f),
                    color = Color(red = 1f, green = 1f, blue = 1f, alpha = 1f),
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Normal,
                )

            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
                modifier = Modifier

                    .width(321.dp)
                    .height(47.dp)
                    .clickable {
                        navigator.navigate(
                            MainScreenDestination()
                        )
                    }
                    .clip(
                        RoundedCornerShape(
                            topStart = 100.dp,
                            topEnd = 100.dp,
                            bottomStart = 100.dp,
                            bottomEnd = 100.dp
                        )
                    )
                    .background(
                        Color(
                            red = 0.47979167103767395f,
                            green = 0.14291667938232422f,
                            blue = 0.8166666626930237f,
                            alpha = 1f
                        )
                    )

                    .padding(start = 0.dp, top = 0.dp, end = 0.dp, bottom = 0.dp)

                    .alpha(0.800000011920929f)


            ) {
                Text(
                    text = "powrót",
                    textAlign = TextAlign.Center,
                    fontSize = 30.sp,
                    textDecoration = TextDecoration.None,
                    letterSpacing = 0.10000000149011612.sp,
                    lineHeight = 20.sp,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier

                        .width(97.dp)
                        .height(40.dp)
                        .alpha(1f),
                    color = Color(red = 1f, green = 1f, blue = 1f, alpha = 1f),
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Normal,
                )

            }

            Text(" ")
        }

    }
}






