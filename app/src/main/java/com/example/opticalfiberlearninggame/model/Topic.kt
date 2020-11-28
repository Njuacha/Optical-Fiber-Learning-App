package com.example.opticalfiberlearninggame.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Topic (
    @PrimaryKey(autoGenerate = true)
    val tid: Int,
    val title: String,
)