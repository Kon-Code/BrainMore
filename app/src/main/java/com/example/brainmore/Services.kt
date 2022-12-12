package com.example.brainmore

import android.content.Context
import com.example.brainmore.scoreservi.Score
import com.example.brainmore.sequenceService.ColorSequence
import com.example.brainmore.sequenceService.SequenceGenerator

class Services(context:Context) {
    val scoreServices:ScoreSerivces
    val sequenceGenerator: SequenceGenerator



    init {

        scoreServices=ScoreSerivces(context, Score(context))
        sequenceGenerator = SequenceGenerator(context,ColorSequence(context))
    }
}