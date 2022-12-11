package com.example.brainmore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.NavGraphs
import com.example.brainmore.ui.theme.BrainMoreTheme
import com.example.dodatek.DetailScreen
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BrainMoreTheme {
                    Figmath()
                }

                }
            }
        }


@Composable
fun Figmath() {
    val image = painterResource(id = R.drawable.tlo5)
    //val windowInfo = remeberWindow()
    // if (windowInfo.screenWidthInfo is WindowInfo.WindowType.Compact) {
    val services=Services(LocalContext.current)

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
    )
    {

        Image(
            painter = image, contentDescription = null, modifier = Modifier
                .matchParentSize(), contentScale = ContentScale.FillWidth
        )

        Navigation(services)

    }
}












