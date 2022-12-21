package com.example.brainmore.sequenceService

import android.content.Context
import androidx.compose.ui.graphics.Color
import kotlin.random.Random

class SequenceGenerator(private  val context: Context, private val sequence:ColorSequence) {

    private val sequencelenght = sequence.sequencelenght


    fun getsequenceLenght(): Int {
        return sequencelenght
    }

   fun getcolor(getcolors: ArrayList<String>){
    val fourcolors: List<String> = listOf("red","blue","green","yellow")
    val randomColor = Random.nextInt(fourcolors.size)
    getcolors.add(fourcolors[randomColor])
}

        fun colorview(operator: String):Color{

            return when(operator){
                "red"-> Color.Red
                "green"-> Color.Green
                "blue"-> Color.Blue
                "yellow"->Color.Yellow
                else -> Color.White
            }

        }

    fun sequenceincrement(sequenceadder: Int): Int {
        return sequencelenght+sequenceadder
    }

    fun resetSequence(torestet: ArrayList<String>) {
        torestet.clear()
    }




}








