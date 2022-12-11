package com.example.brainmore

import android.content.Context


class ScoreSerivces(private  val context: Context, private val score:Score ) {


    fun getscore():Score{
        return  this.score
    }
    fun addtoscoe(n:Int) {
        score.currentscore=+n
    }

    fun getcurrentscore(): Int{
        return score.currentscore
    }

}