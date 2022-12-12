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
import androidx.compose.ui.graphics.PaintingStyle.Companion.Stroke
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.brainmore.ui.theme.Screen
import com.example.destinations.DetailScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import kotlin.system.exitProcess

@Destination(start =true )
@Composable
fun MainScreen(
    navigator: NavHostController
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "BrainMore",
            textAlign = TextAlign.Center,
            fontSize = 52.sp,
            textDecoration = TextDecoration.None,
            letterSpacing = 0.10000000149011612.sp,
            lineHeight = 20.sp,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier

                .width(361.dp)

                //.height(151.dp)

                .alpha(1f),
            color = Color(red = 0.987500011920929f, green = 0.987500011920929f, blue = 0.987500011920929f, alpha = 0.30000001192092896f),
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal,
        )
        Spacer(modifier = Modifier.height(100.dp))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
            modifier = Modifier
                .width(344.dp)
                .height(60.dp)
                .clickable {
                    navigator.navigate(Screen.DetailScreen.route)

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
                        red = 0.3333333432674408f,
                        green = 0.25882354378700256f,
                        blue = 0.9019607901573181f,
                        alpha = 1f
                    )
                )
                .padding(start = 0.dp, top = 0.dp, end = 0.dp, bottom = 0.dp)
                .alpha(0.800000011920929f),


            ) {

            Text(
                text = "Trening ",
                textAlign = TextAlign.Center,
                fontSize = 30.sp,
                modifier = Modifier
                    .width(200.dp)
                    .height(40.dp)
                    .alpha(1f),
                color = Color(red = 1f, green = 1f, blue = 1f, alpha = 1f),
                )

        }
        Spacer(modifier = Modifier.height(60.dp))
   }

}







