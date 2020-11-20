package com.example.opticalfiberlearninggame.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.example.opticalfiberlearninggame.R
import com.example.opticalfiberlearninggame.adapter.MainActivityAdapter
import com.example.opticalfiberlearninggame.view_model.MainActivityVM

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpViewModel()
    }

    private fun setUpViewModel() {
        val viewModel by viewModels<MainActivityVM>()

        val recyclerView = findViewById<RecyclerView>(R.id.rv_questions)
        val adapter = MainActivityAdapter()
        recyclerView.adapter = adapter

        viewModel.questionWithAnswers.observe(this ) { questionAndAnswers ->
            adapter.questionAndAnswersList = questionAndAnswers
        }




    }
}
