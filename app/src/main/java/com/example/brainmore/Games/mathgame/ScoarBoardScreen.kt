package com.example.brainmore

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.brainmore.ui.theme.Screen
import com.example.brainmore.ui.theme.themecolor
import com.example.destinations.MathgameScreenDestination
import com.ramcosta.composedestinations.annotation.Destination


@Destination
@Composable
fun ScoardBoardScreen(navigator: NavController, scoreSerivces: ScoreSerivces) {

    val currentscore =scoreSerivces.getcurrentscore()
    androidx.compose.material.Surface(color = themecolor) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
            modifier = Modifier
                .fillMaxSize()
        )
        {
            Box(
                modifier = Modifier
                    .width(330.dp)
                    .height(540.dp)
                    .clip(
                        RoundedCornerShape(
                            topStart = 0.dp,
                            topEnd = 0.dp,
                            bottomStart = 0.dp,
                            bottomEnd = 0.dp
                        )
                    )


                    .background(
                        Color(
                            red = 0.2235294133424759f,
                            green = 0.21176470816135406f,
                            blue = 0.21176470816135406f,
                            alpha = 1f
                        )
                    ),
                contentAlignment = Alignment.TopCenter
            )


            {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Twój wynik to: ",
                        textAlign = TextAlign.Start,
                        fontSize = 36.sp,
                    )

                    Text(
                        text = "$currentscore /6",
                        fontSize = 36.sp,
                    )


                    Button(
                        onClick = { navigator.navigate(Screen.MathgameScreen.route) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(80.dp),
                        shape = RoundedCornerShape(50.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green)
                    ) {

                        Text(
                            text = "Rozpocznij od nowa",
                            fontSize = 30.sp,
                            overflow = TextOverflow.Ellipsis,
                            color = Color.White
                        )
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                }


            }
        }
    }
}


