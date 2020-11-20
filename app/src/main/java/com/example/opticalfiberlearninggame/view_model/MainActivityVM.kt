package com.example.opticalfiberlearninggame.view_model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.opticalfiberlearninggame.Repository
import com.example.opticalfiberlearninggame.model.QuestionWithAnswers

class MainActivityVM(application: Application) : AndroidViewModel(application) {

    val questionWithAnswers: LiveData<List<QuestionWithAnswers>> = Repository.getQuestionsWithAnswers(application.applicationContext)

}