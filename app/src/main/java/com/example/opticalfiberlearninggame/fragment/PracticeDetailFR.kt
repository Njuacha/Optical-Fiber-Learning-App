package com.example.opticalfiberlearninggame.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.opticalfiberlearninggame.R
import com.example.opticalfiberlearninggame.adapter.PracticeDetailFragmentAD
import com.example.opticalfiberlearninggame.view_model.PracticeDetailFragmentVM
import kotlinx.android.synthetic.main.mcq_questions.*

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

        val submitBtn = view.findViewById<Button>(R.id.btn_submit)
        val resetBtn = view.findViewById<Button>(R.id.btn_reset)

        submitBtn.setOnClickListener {

            recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false )

            it.visibility = View.INVISIBLE
            recyclerView.scrollToPosition(0)
            adapter.showCorrectAnswers()
            resetBtn.visibility = View.VISIBLE


        }

        resetBtn.setOnClickListener{

            //TODO
        }


    }
}
