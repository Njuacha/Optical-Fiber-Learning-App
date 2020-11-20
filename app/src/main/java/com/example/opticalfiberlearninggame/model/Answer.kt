package com.example.opticalfiberlearninggame.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Answer (
     @PrimaryKey(autoGenerate = true) val aid: Int,
     val qid: Int,
     val isCorrectAnswer: Boolean,
     val answer: String?
)
