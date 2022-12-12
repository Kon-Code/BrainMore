package com.example.brainmore
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.core.widgets.Optimizer.enabled
import com.example.brainmore.ui.theme.themecolor
import com.ramcosta.composedestinations.annotation.Destination
import kotlinx.coroutines.delay
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread
import kotlin.concurrent.timer


@Destination
@Composable
fun Fasthandgamescreen(
    ) {
    var currentTime by remember {
        mutableStateOf(0)
    }
    var iscounting by remember {
        mutableStateOf(0)
    }
    var isgreen by remember {
        mutableStateOf(false)
    }
    var lockbutton by remember {
        mutableStateOf(true)
    }
    var doubleclick by remember {
        mutableStateOf(false)
    }
    Surface(color = themecolor) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
                .clickable(enabled = if (!isgreen) {
                    lockbutton
                } else {
                    !lockbutton
                } ){
                    isgreen = !isgreen
                    iscounting++
                    currentTime=0
                    doubleclick=false
                }

        ) {
            Spacer(modifier = Modifier.height(100.dp))

            Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top)) {

            if (currentTime <=0 && iscounting<=0)
                Text(text = "kliknij gdziekolwiek",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color=Color.White)
            else if(currentTime<=0 && iscounting==1)
            Text( text="przygotuj sie...",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color=Color.White)
            else if(currentTime>0 && isgreen)
                Text(text = "teraz!",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color=Color.White)
            else
                Text(text = "świetnie spróbuj jeszcze raz!",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color=Color.White)
            }

                LaunchedEffect(key1 = currentTime, key2 = isgreen) {
                    while (isgreen) {
                        if (isgreen && currentTime <= 0)
                            delay(5000L)
                        else
                            delay(10L)
                        currentTime++

                    }
                }

            Spacer(modifier = Modifier.height(30.dp))

            Box(
                contentAlignment = Alignment.TopCenter,
                modifier = Modifier
                    .width(263.dp)
                    .height(66.dp)
            )
            {

                Text(
                    text = (currentTime).toString(),
                    fontSize = 44.sp,
                    fontWeight = FontWeight.Bold,
                    color=Color.White
                )
            }

            Box(
                modifier = Modifier
                    .width(207.dp)
                    .clickable(
                        enabled = if (currentTime <=0 && iscounting<=0) {
                            !lockbutton
                        }
                            else if(currentTime<=0 && isgreen)
                                !lockbutton
                            else if(doubleclick)
                        {  !lockbutton}
                            else
                                lockbutton
                    ) {
                        isgreen = !isgreen
                        iscounting=0
                        doubleclick=!doubleclick
                    }
                    .height(197.dp)
                    .clip(RoundedCornerShape(100.dp))
                    .background(
                        if ( currentTime <= 0) {
                            Color.Red
                        } else {
                            Color.Green
                        }
                    )

            )
             {

            }
            Spacer(modifier = Modifier.height(100.dp))
        }
    }
}





