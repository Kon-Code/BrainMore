package com.example.brainmore.sequenceService

import android.content.Context
import androidx.compose.ui.graphics.Color

class SequenceGenerator(private  val context: Context, private val sequence:ColorSequence) {

    private val sequencelenght = sequence.sequencelenght



    fun getsequenceLenght(): Int{
        return sequencelenght
    }

    fun getcolor(sequencelenght: Int,getcolors:ArrayList<Color>) {

        val fourcolors : List<Color> =listOf(Color.Red,Color.Blue, Color.Yellow, Color.Green)
        val randomColor= fourcolors.random()
        for (i in 0..sequencelenght) {
            getcolors.add(randomColor)
        }
    }

    fun sequenceincrement(sequenceadder: Int): Int {
        return sequencelenght+sequenceadder
    }

    fun resetSequence() {
        sequence.sequencelenght=0

    }




}








