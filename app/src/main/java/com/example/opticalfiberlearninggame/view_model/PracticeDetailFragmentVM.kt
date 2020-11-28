package com.example.opticalfiberlearninggame.view_model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.opticalfiberlearninggame.Repository
import com.example.opticalfiberlearninggame.model.QuestionWithAnswers

class PracticeDetailFragmentVM(application: Application) : AndroidViewModel(application) {

    val questionWithAnswers = Repository.getQuestionsWithAnswers(application.applicationContext)

}