package com.example.opticalfiberlearninggame

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.opticalfiberlearninggame.model.*
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException

class Repository {

    companion object {
        fun insertAnswer(context: Context, answer: Answer) {
            AppDatabase.getDatabase(context).answerDao().insert(answer)
        }

        fun insertQuestion(context: Context, question: Question) {
            AppDatabase.getDatabase(context).questionDao().insert(question)
        }

        fun getQuestionsWithAnswers(topicId: Int, context: Context) : LiveData<List<QuestionWithAnswers>> {
            return AppDatabase.getDatabase(context).questionDao().getQuestionsWithAnswers(topicId)
        }

        fun getTopics(context: Context) : LiveData<List<Topic>> {
            //return AppDatabase.getDatabase(context).topicDao().getTopics()
            var topicsListLiveData = MutableLiveData<List<Topic>>()
            val jsonString : String
            try {
                jsonString = context.assets.open("topics.json").bufferedReader().use {  it.readText() }
                val gson = Gson()
                val listTopicType = object : TypeToken<List<Topic>>() {}.type
                val topicsList : List<Topic> = gson.fromJson(jsonString, listTopicType)
                topicsListLiveData.value = topicsList
                return topicsListLiveData
            } catch (ioException : IOException) {

            }

            return topicsListLiveData
        }
    }
}