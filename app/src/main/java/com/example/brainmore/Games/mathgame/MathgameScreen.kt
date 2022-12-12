package com.example.brainmore


import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.brainmore.ui.theme.Screen
import com.example.brainmore.ui.theme.themecolor
import com.ramcosta.composedestinations.annotation.Destination
import kotlinx.coroutines.delay


@SuppressLint("UnrememberedMutableState")
@Destination
@Composable
fun MathgameScreen(navigator: NavController, scoreService:ScoreSerivces) {


    val questiona: ArrayList<String> = ArrayList()
    val questionb: ArrayList<String> = ArrayList()
    val symbol: ArrayList<String> = ArrayList()
    val answers: ArrayList<String> = ArrayList()
    val randomans: ArrayList<String> = ArrayList()
    var goodans: ArrayList<Boolean> = ArrayList()

    questionsgenerator(
        answers = answers,
        questiona = questiona,
        questionb = questionb,
        symbol = symbol
    )

    var isstart by remember {
        mutableStateOf(false)
    }
    var isCorrect by remember {
        mutableStateOf(0)
    }
    var nextquestion by remember {
        mutableStateOf(0)
    }
    var currentstate by remember {
        mutableStateOf(0)
    }
    var correct by remember {
        mutableStateOf(false)
    }





    tworandomans(randomans, answers[nextquestion])


    Surface(color = themecolor) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(450.dp)
                    .background(
                        Color(
                            red = 0.22499999403953552f,
                            green = 0.2109375f,
                            blue = 0.2109375f,
                            alpha = 1f
                        )
                    )
            )

            {
                Text(
                    text = isCorrect.toString(),
                    fontSize = 40.sp,
                )
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        modifier = Modifier
                            .width(354.dp)
                            .height(70.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                       for(i in 0..5){
                           CircleB(backcolor = Color.Gray)}


                        }
                        Spacer(modifier = Modifier.height(100.dp))
                        Row(
                            modifier = Modifier
                                .height(110.dp)
                                .width(300.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            if (currentstate == 0) {
                                Button(
                                    onClick = {
                                        currentstate++
                                        isstart = !isstart

                                    }, modifier = Modifier
                                        .size(size = 300.dp),
                                    shape = RoundedCornerShape(50.dp),
                                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green)
                                )
                                {
                                    Text(
                                        text = "Rozpocznij",
                                        fontSize = 40.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.White
                                    )
                                }
                            } else if (currentstate == 6) {
                                scoreService.addtoscoe(isCorrect)
                                navigator.navigate(Screen.ScoardBoardScreen.route)
                                currentstate = 0
                                nextquestion = 0
                                questionsgenerator(
                                    answers = answers,
                                    questiona = questiona,
                                    questionb = questionb,
                                    symbol = symbol
                                )
                            } else {
                                Text(
                                    text = questiona[nextquestion],
                                    fontSize = 90.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,

                                    )
                                Text(
                                    text = symbol[nextquestion],
                                    fontSize = 90.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Text(
                                    text = questionb[nextquestion],
                                    fontSize = 90.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(200.dp))
                    }
                }

                Box(
                    modifier = Modifier
                        .width(334.dp)
                        .height(58.dp)
                        .clip(
                            RoundedCornerShape(
                                topStart = 10.dp,
                                topEnd = 10.dp,
                                bottomStart = 10.dp,
                                bottomEnd = 10.dp
                            )
                        )
                        .background(
                            Color(
                                red = 0.4965815246105194f,
                                green = 0.20338541269302368f,
                                blue = 0.6875f,
                                alpha = 1f
                            )
                        )
                        .clickable {
                            randomans.clear()
                            tworandomans(randomans, answers[nextquestion])

                            if (answers[nextquestion] == randomans[0]) {
                                isCorrect += 1
                                nextquestion += 1
                                currentstate += 1
                                correct = !correct
                                goodans.add(correct)
                            } else {
                                nextquestion += 1
                                currentstate += 1
                            }
                        },
                    contentAlignment = Alignment.Center

                ) {
                    Text(
                        text = randomans[0],
                        fontSize = 37.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,

                        )
                }

                Box(
                    modifier = Modifier
                        .width(334.dp)
                        .height(58.dp)
                        .clip(
                            RoundedCornerShape(
                                topStart = 10.dp,
                                topEnd = 10.dp,
                                bottomStart = 10.dp,
                                bottomEnd = 10.dp
                            )
                        )
                        .background(
                            Color(
                                red = 0.45070838928222656f,
                                green = 0.14791667461395264f,
                                blue = 0.5f,
                                alpha = 1f
                            )
                        )
                        .clickable {
                            randomans.clear()
                            tworandomans(randomans, answers[nextquestion])
                            if (answers[nextquestion] == randomans[1]) {
                                isCorrect += 1
                                nextquestion += 1
                                currentstate += 1
                                correct = !correct
                                goodans.add(correct)
                            } else {
                                nextquestion += 1
                                currentstate += 1
                            }
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = randomans[1],
                        fontSize = 37.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }

                Box(
                    modifier = Modifier
                        .width(334.dp)
                        .height(58.dp)
                        .clip(
                            RoundedCornerShape(
                                topStart = 10.dp,
                                topEnd = 10.dp,
                                bottomStart = 10.dp,
                                bottomEnd = 10.dp
                            )
                        )
                        .background(
                            Color(
                                red = 0.22949275374412537f,
                                green = 0.04067707061767578f,
                                blue = 0.2958333194255829f,
                                alpha = 1f
                            )
                        )
                        .clickable {
                            randomans.clear()
                            tworandomans(randomans, answers[nextquestion])
                            if (answers[nextquestion] == randomans[2]) {
                                isCorrect += 1
                                nextquestion += 1
                                currentstate += 1
                                correct = !correct
                                goodans.add(correct)
                            } else {
                                nextquestion += 1
                                currentstate += 1
                            }
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = randomans[2],
                        fontSize = 37.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White

                    )
                }

                Spacer(modifier = Modifier.height(10.dp))

            }
        }
    }





@Composable
fun CircleB(backcolor:Color) {
    Box(
        modifier = Modifier
            .size(40.dp)
            .clip(
                RoundedCornerShape(100.dp)
            )
            .background(backcolor)

    )
}

