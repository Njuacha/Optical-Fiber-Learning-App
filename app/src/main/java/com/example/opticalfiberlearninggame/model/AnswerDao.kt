package com.example.opticalfiberlearninggame.model

import androidx.room.*

@Dao
interface AnswerDao {

    @Insert
    fun insert(answer: Answer)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAnswers(answers: List<Answer>)

    @Query("Delete from Question")
    fun deleteAll()
}