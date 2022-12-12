package com.example.brainmore.Games.simonsays



import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.brainmore.sequenceService.SequenceGenerator
import com.ramcosta.composedestinations.annotation.Destination
import kotlinx.coroutines.delay



@Destination
@Composable
fun FirstgameScreen(sequenceGenerator: SequenceGenerator) {



    var enabled by remember {
        mutableStateOf(false)
    }

    var isgamestart by remember {
        mutableStateOf(0)
    }
    var isnext by remember {
        mutableStateOf(false)
    }
    var isinCorrect by remember {
        mutableStateOf(false)
    }
    var currentcolor by remember{
        mutableStateOf(0)
    }




    var sequencelenght = sequenceGenerator.getsequenceLenght()
    var sequence: ArrayList<Color> = ArrayList(sequencelenght)

    LaunchedEffect(key1 = isnext, key2 = isinCorrect) {
        while (isgamestart == 1) {
            if (isnext) {
                delay(1000L)
                sequencelenght+= sequenceGenerator.sequenceincrement(1)
                sequenceGenerator.getcolor(sequencelenght,sequence)

            } else if (isinCorrect) {
                isgamestart = 0
                sequenceGenerator.resetSequence()
            }
        }
    }

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
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Spacer(modifier = Modifier.height(100.dp))
            if (isgamestart == 0) {
                Button(
                    onClick = {
                        enabled = !enabled
                        isgamestart++
                        currentcolor++

                        sequenceGenerator.getcolor(currentcolor,sequence)

                    },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
                ) {

                    Text(
                        text = "Rozpocznij",
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            } else {
                Box(
                    modifier = Modifier
                        .size(160.dp)
                        .background(sequence[currentcolor])
                        .clip(
                            RoundedCornerShape(
                                topStart = 30.dp,
                                topEnd = 30.dp,
                                bottomStart = 30.dp,
                                bottomEnd = 30.dp
                            )
                        )
                )

            }
            Spacer(modifier = Modifier.height(400.dp))
        }



        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
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
                    Button(
                        onClick = {
                            if (sequence[currentcolor] == Color.Green) {
                                isnext = !isnext
                            } else {
                                isinCorrect = !isinCorrect
                            }
                        }, modifier = Modifier
                            .size(size = 160.dp),
                        shape = RoundedCornerShape(30.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green)
                    ) {}

                    Button(
                        onClick = {
                            if (sequence[currentcolor] == Color.Yellow) {
                                isnext = !isnext
                            } else {
                                isinCorrect = !isinCorrect
                            }
                        }, modifier = Modifier
                            .size(size = 160.dp),
                        shape = RoundedCornerShape(30.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow)
                    ) {}

                }
                Column(
                    modifier = Modifier
                        .height(366.dp)
                        .width(160.dp),
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.SpaceBetween,
                ) {

                    Button(
                        onClick = {
                            if (sequence[currentcolor] == Color.Red) {
                                isnext = !isnext
                            } else {
                                isinCorrect = !isinCorrect
                            }
                        }, modifier = Modifier
                            .size(size = 160.dp),
                        shape = RoundedCornerShape(30.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red)
                    ) {}

                    Button(
                        onClick = {
                            if (sequence[currentcolor] == Color.Red) {
                                isnext = !isnext
                            } else {
                                isinCorrect = !isinCorrect
                            }
                        }, modifier = Modifier
                            .size(size = 160.dp),
                        shape = RoundedCornerShape(30.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue)
                    ) {}

                }
            }

        }
    }
}













 




