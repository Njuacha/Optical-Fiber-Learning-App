package com.example.opticalfiberlearninggame.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.RecyclerView
import com.example.opticalfiberlearninggame.R
import com.example.opticalfiberlearninggame.adapter.PracticeDetailFragmentAD
import com.example.opticalfiberlearninggame.view_model.PracticeDetailFragmentVM

class PracticeDetailFR : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.mcq_questions, container, false)
        Log.d("topicId", arguments?.getInt("topicId", 0).toString())
        setUpViewModel(view)
        return view
    }

    private fun setUpViewModel(view: View) {

        val viewModel: PracticeDetailFragmentVM by activityViewModels()

        val recyclerView = view.findViewById<RecyclerView>(R.id.rv_questions)
        val adapter = PracticeDetailFragmentAD()
        recyclerView.adapter = adapter

        viewModel.questionWithAnswers.observe(viewLifecycleOwner ) { questionAndAnswers ->
            adapter.questionAndAnswersList = questionAndAnswers
        }

    }
}
