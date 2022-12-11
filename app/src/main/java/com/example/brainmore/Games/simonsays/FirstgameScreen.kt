package com.example.brainmore


import android.widget.Button
import androidx.compose.animation.Animatable
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.animateColor
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.*
import androidx.compose.foundation.background

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.Dimension.Companion.value
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.brainmore.ui.theme.*
import com.ramcosta.composedestinations.annotation.Destination


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
            startbutt()

        }


        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom){

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
                )
                {
                    butt(Colorofbutt = Color.Green)
                    butt(Colorofbutt = Color.Yellow)

                }
                Column(
                    modifier = Modifier
                        .height(366.dp)
                        .width(160.dp),
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.SpaceBetween,
                ) {
                    butt(Colorofbutt = Color.Red)
                    butt(Colorofbutt = Color.Blue)

                }
            }
           Spacer(modifier = Modifier.height(100.dp))

        }
    }
}



@Composable
fun butt( Colorofbutt: Color) {

    Button(onClick = { },  modifier = Modifier
        .size(size = 160.dp),
        shape=  RoundedCornerShape(30.dp) ,
        colors = ButtonDefaults.buttonColors(backgroundColor = Colorofbutt))
         {
    }

}
@Composable
fun startbutt() {


    var random = (0..3).random()
    var fourcolors = arrayOf(lightYellow, lightblue, lightRed, lightgreen)
    val addcolors = ArrayList<androidx.compose.ui.graphics.Color>()

    var enabled by remember {
        mutableStateOf(false)
    }

    Button(
        onClick = {enabled=!enabled },
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
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
                ) { append("start") }
                withStyle(
                    style = SpanStyle(
                        color = Color.White,
                        fontSize = 32.sp
                    )
                ) {
                    append(" ")
                }

            }
        )

    }


            Box(
                modifier = Modifier
                    .size(160.dp)
                    .background(Color.Red)
                    .clip(
                        RoundedCornerShape(
                            topStart = 30.dp,
                            topEnd = 30.dp,
                            bottomStart = 30.dp,
                            bottomEnd = 30.dp
                        )
                    )
            ) {

            }
}




@Composable
fun butto(typeofbutton:Button){
                val redbutton = butt(Colorofbutt = Color.Red)
                val greenbutton = butt(Colorofbutt = Color.Green)
                val bluebutton = butt(Colorofbutt = Color.Blue)
                val yellowbutton = butt(Colorofbutt = Color.Yellow)
}












 




