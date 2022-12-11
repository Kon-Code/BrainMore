package com.example.brainmore.ui.theme


    sealed class Screen(val route: String) {
        object MainScreen: Screen("main_screen")
        object DetailScreen: Screen("Detail_screen")
        object FirstgameScreen: Screen("Firstgame_screen")
        object Fasthandgamescreen: Screen("Fasthandgame_screen")
        object  ScoardBoardScreen: Screen("ScoarBoard_screen")
        object  MathgameScreen: Screen("Mathgame_screen")
    }