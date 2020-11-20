package com.example.opticalfiberlearninggame.model

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface QuestionDao {

    @Insert
    fun insert(question: Question)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertQuestions(questions: List<Question>)

    @Transaction
    @Query("Select * From Question")
    fun getQuestionsWithAnswers(): LiveData<List<QuestionWithAnswers>>

    @Query("Delete from Question")
    fun deleteAll()

}