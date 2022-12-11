package com.example.brainmore

class SequenceChecker {

    fun checkSequence(correctSequence: Sequence, inputSequence: Sequence): Boolean {
        var correct = true
        val correctSequenceCount = correctSequence.count()
        val inputSequenceCount = inputSequence.count()

        if(inputSequenceCount > correctSequenceCount) {

            return false
        }

        for (index in 0..inputSequenceCount-1) {

            if(correctSequence[index] != inputSequence[index]) {

                correct = false
                break
            }
        }

        return correct
    }

}