package com.example.brainmore

import android.content.Context
import com.example.brainmore.scoreservi.Score


class ScoreSerivces(private  val context: Context, private val score: Score) {


    fun addtoscoe(n: Int) {
        score.currentscore = +n
    }

    fun getcurrentscore(): Int {
        return score.currentscore
    }

}