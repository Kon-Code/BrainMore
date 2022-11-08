package com.example.brainmore.ui.theme


    sealed class Screen(val route: String) {
        object MainScreen: Screen("main_screen")
        object DetailScreen: Screen("Detail_screen")
        object FirstgameScreen: Screen("Firstgame_screen")
    }