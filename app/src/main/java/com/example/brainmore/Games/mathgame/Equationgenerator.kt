package com.example.brainmore

import android.annotation.SuppressLint
import androidx.compose.runtime.*
import java.util.Collections.shuffle



fun equationgenerator(fNumber:Double ,sNumber: Double,Operator:Int): Double {

    return when(Operator)
    {
        0->  fNumber + sNumber
        1-> if(fNumber>sNumber) {fNumber - sNumber} else {sNumber-fNumber}
        2-> fNumber * sNumber
        3->  fNumber/sNumber
        else -> -1.0
    }

}


fun questionsgenerator(answers:ArrayList<String>, questiona: ArrayList<String> ,questionb: ArrayList<String>,symbol:ArrayList<String>) {


        var result :Double
    for (i in 0..5) {

        var fisrtNumb :Int= (1..20).random()
        var secondNum:Int = (1..20).random()

        var operator :Int = (0..3).random()

        questiona.add(fisrtNumb.toString())
        questionb.add(secondNum.toString())

            if (operator==3){
            result = equationgenerator(fisrtNumb.toDouble(),secondNum.toDouble(),operator)
                answers.add(String.format("%.3f", result))
            }
        else {
                result=(equationgenerator(fisrtNumb.toDouble(), secondNum.toDouble(), operator))
                answers.add(String.format("%.0f", result))

            }

        when (operator) {
            0 -> {
                symbol.add( "+")
            }
            1 -> {
                symbol.add( "-")
            }
            2 -> {
                symbol.add(" * ")
            }
            3 -> symbol.add(":")
        }


    }
}

fun tworandomans(ansrandom:ArrayList<String>, goodans:String) {

    val roneans = (0..50).random().toString()
    val rsecondans = (0..50).random().toString()

    ansrandom.add(roneans)
    ansrandom.add(rsecondans)
    ansrandom.add(goodans)
    shuffle(ansrandom)


}


