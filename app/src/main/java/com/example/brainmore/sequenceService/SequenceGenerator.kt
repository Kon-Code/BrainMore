package com.example.brainmore

import kotlin.random.Random


typealias Sequence = ArrayList<Int>

class SequenceGenerator {

    private val buttonCount: Int
    private var sequenceStartCount: Int
    private var sequence : Sequence
    private val random: Random
    private val sequenceIncrementer = 1


    constructor(firstgameBoard:FirstgameBoard , sequenceStartCount: Int = 0) {

        buttonCount = firstgameBoard.buttons.count()
        this.sequenceStartCount = sequenceStartCount

        random = Random
        sequence = Sequence()

        createSequence(sequenceStartCount)

    }
        fun getCurrentSequence(): Sequence {

            return sequence
        }

        fun getNewSequence(): Sequence {

            addToSequence()

            return sequence
        }

        fun resetSequence() {

            sequence.clear()
            createSequence(1)
        }

        private fun createSequence(sequenceCount: Int) {

            for (i in 1..sequenceCount) {

                addToSequence()
            }
        }

    private fun addToSequence() {

        val nextInt = random.nextInt(buttonCount)
        sequence.add(nextInt)
        sequenceStartCount += sequenceIncrementer
    }
}


