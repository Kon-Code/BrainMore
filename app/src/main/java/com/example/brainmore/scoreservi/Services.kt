package com.example.brainmore

import android.content.Context

class Services(context:Context) {
    val scoreServices:ScoreSerivces



    init {

        scoreServices=ScoreSerivces(context,Score(context))
    }
}