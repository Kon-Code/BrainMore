package com.example.brainmore


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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.brainmore.ui.theme.Screen

import com.example.brainmore.ui.theme.themecolor

import com.example.destinations.ScoardBoardScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator




@Destination
@Composable
fun MathgameScreen(navigator: NavController, scoreService:ScoreSerivces) {


    val questiona: ArrayList<String> = ArrayList()
    val questionb: ArrayList<String> = ArrayList()
    val symbol: ArrayList<String> = ArrayList()
    val answers: ArrayList<String> = ArrayList()
    val randomans: ArrayList<String> = ArrayList()
    val score = scoreService.getscore()

    questionsgenerator(
        answers = answers,
        questiona = questiona,
        questionb = questionb,
        symbol = symbol
    )

    var isCorrect by remember {
        mutableStateOf(0)
    }
    var nextquestion by remember {
        mutableStateOf(0)
    }
    var currentstate by remember {
        mutableStateOf(0)
    }
    var isincorrect by remember {
        mutableStateOf(false)
    }

    tworandomans(randomans,answers[nextquestion])


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


                    }
                    Spacer(modifier = Modifier.height(100.dp))
                    Row(
                        modifier = Modifier
                            .height(110.dp)
                            .width(280.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        when (currentstate) {
                            0 -> Button(onClick = {currentstate++

                            },  modifier = Modifier
                                .size(size = 300.dp),
                                shape=  RoundedCornerShape(50.dp) ,
                                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green))
                            {
                                Text(text = "Rozpocznij",
                                    fontSize = 40.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                            }
                            6 -> {
                                    scoreService.addtoscoe(isCorrect)
                                navigator.navigate(Screen.ScoardBoardScreen.route)
                            }
                            else -> {
                                Text(
                                    text = questiona[nextquestion],
                                    fontSize = 96.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,

                                    )
                                Text(
                                    text = symbol[nextquestion],
                                    fontSize = 96.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Text(
                                    text = questionb[nextquestion],
                                    fontSize = 96.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                            }
                        }
                    }

                        Spacer(modifier = Modifier.height(150.dp))
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
                                tworandomans(randomans, answers[nextquestion])

                                if (answers[nextquestion]==randomans[0]) {
                                    isCorrect+=1
                                    nextquestion+=1
                                    currentstate+=1
                                }
                                else{
                                    isincorrect=!isincorrect
                                    nextquestion+=1
                                    currentstate+=1
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
                                tworandomans(randomans, answers[nextquestion])
                                if (answers[nextquestion]==randomans[1]) {
                                    isCorrect+=1
                                    nextquestion+=1
                                    currentstate+=1
                                }
                                else{
                                    isincorrect=!isincorrect
                                    nextquestion+=1
                                    currentstate+=1
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
                                tworandomans(randomans, answers[nextquestion])
                                if (answers[nextquestion]==randomans[2]) {
                                    isCorrect+=1
                                    nextquestion+=1
                                    currentstate+=1
                                }
                                else{
                                    isincorrect=!isincorrect
                                    nextquestion+=1
                                    currentstate+=1
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

