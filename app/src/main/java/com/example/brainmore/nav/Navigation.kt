package com.example.brainmore

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.brainmore.ui.theme.Screen
import com.example.dodatek.DetailScreen

@Composable
fun Navigation(services: Services) {
    val navController= rememberNavController()
    var startDestination = Screen.MainScreen.route

    NavHost(navController = navController ,startDestination= startDestination ){

        composable(route = Screen.MainScreen.route){
            MainScreen(navController, services.scoreServices )

        }
        composable(route= Screen.MathgameScreen.route){
            MathgameScreen(navController, services.scoreServices )

        }
        composable(route= Screen.ScoardBoardScreen.route) {
            ScoardBoardScreen(navController, services.scoreServices)
        }
        composable(route=Screen.DetailScreen.route){
            DetailScreen(navController, services.scoreServices )
        }

    }


}