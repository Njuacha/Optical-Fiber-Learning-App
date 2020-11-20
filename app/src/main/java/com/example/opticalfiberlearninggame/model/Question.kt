package com.example.opticalfiberlearninggame.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Question (
    @PrimaryKey(autoGenerate = true) val qid: Int,
    val question: String?
)

