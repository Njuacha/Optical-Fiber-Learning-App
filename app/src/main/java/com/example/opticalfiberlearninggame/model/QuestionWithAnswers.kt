package com.example.opticalfiberlearninggame.model

import androidx.room.Embedded
import androidx.room.Relation


data class QuestionWithAnswers (
    @Embedded val question: Question,
    @Relation(
        parentColumn = "qid",
        entityColumn = "qid"
    )
    val answers: List<Answer>
)
