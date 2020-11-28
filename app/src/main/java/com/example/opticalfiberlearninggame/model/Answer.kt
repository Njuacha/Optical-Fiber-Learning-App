package com.example.opticalfiberlearninggame.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey

@Entity(foreignKeys = [ForeignKey(entity = Question::class, parentColumns = ["qid"], childColumns = ["qid"], onDelete = CASCADE)])
data class Answer (
     @PrimaryKey(autoGenerate = true) val aid: Int,
     val qid: Int,
     val isCorrectAnswer: Boolean,
     val answer: String?
)
