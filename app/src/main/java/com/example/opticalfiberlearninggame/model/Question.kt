package com.example.opticalfiberlearninggame.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey

@Entity(foreignKeys = [ForeignKey(entity = Topic::class, parentColumns = ["tid"], childColumns = ["tid"], onDelete = CASCADE)])
data class Question (
    @PrimaryKey(autoGenerate = true) val qid: Int,
    val tid: Int,
    val question: String?,
    val pictureUrl: String?
)

