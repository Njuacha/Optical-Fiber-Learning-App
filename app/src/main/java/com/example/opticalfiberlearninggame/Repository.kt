package com.example.opticalfiberlearninggame

import android.content.Context
import androidx.lifecycle.LiveData
import com.example.opticalfiberlearninggame.model.Answer
import com.example.opticalfiberlearninggame.model.AppDatabase
import com.example.opticalfiberlearninggame.model.Question
import com.example.opticalfiberlearninggame.model.QuestionWithAnswers

class Repository {

    companion object {
        suspend fun insertAnswer(context: Context, answer: Answer) {
            AppDatabase.getDatabase(context).answerDao().insert(answer)
        }

        suspend fun insertQuestion(context: Context, question: Question) {
            AppDatabase.getDatabase(context).questionDao().insert(question)
        }

        fun getQuestionsWithAnswers(context: Context) : LiveData<List<QuestionWithAnswers>> {
            return AppDatabase.getDatabase(context).questionDao().getQuestionsWithAnswers();
        }
    }
}