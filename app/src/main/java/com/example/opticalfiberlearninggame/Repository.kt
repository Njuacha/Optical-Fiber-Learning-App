package com.example.opticalfiberlearninggame

import android.content.Context
import androidx.lifecycle.LiveData
import com.example.opticalfiberlearninggame.model.*

class Repository {

    companion object {
        fun insertAnswer(context: Context, answer: Answer) {
            AppDatabase.getDatabase(context).answerDao().insert(answer)
        }

        fun insertQuestion(context: Context, question: Question) {
            AppDatabase.getDatabase(context).questionDao().insert(question)
        }

        fun getQuestionsWithAnswers(context: Context) : LiveData<List<QuestionWithAnswers>> {
            return AppDatabase.getDatabase(context).questionDao().getQuestionsWithAnswers()
        }

        fun getTopics(context: Context) : LiveData<List<Topic>> {
            return AppDatabase.getDatabase(context).topicDao().getTopics()
        }
    }
}