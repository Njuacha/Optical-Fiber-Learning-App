package com.example.opticalfiberlearninggame.view_model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.opticalfiberlearninggame.Repository

class TopicVM(application: Application): AndroidViewModel(application) {

    val topics = Repository.getTopics(application)
}