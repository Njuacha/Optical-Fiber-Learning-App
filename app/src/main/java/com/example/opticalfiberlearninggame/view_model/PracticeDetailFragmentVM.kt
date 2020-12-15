package com.example.opticalfiberlearninggame.view_model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.opticalfiberlearninggame.Repository
import com.example.opticalfiberlearninggame.model.QuestionWithAnswers

class PracticeDetailFragmentVM(application: Application) : AndroidViewModel(application) {
    var topicId: Int = 0
    set(value) {
        field = value

        questionWithAnswers = Repository.getQuestionsWithAnswers(value, this.getApplication())
    }

    var questionWithAnswers: LiveData<List<QuestionWithAnswers>>? = null




}