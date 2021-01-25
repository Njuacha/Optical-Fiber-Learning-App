package com.example.opticalfiberlearninggame.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.RecyclerView
import com.example.opticalfiberlearninggame.R
import com.example.opticalfiberlearninggame.adapter.PracticeFragmentAD
import com.example.opticalfiberlearninggame.view_model.TopicVM
import java.lang.ClassCastException

class PracticeFR : Fragment()  {

    var practiceFragmentListener: PracticeFragmentListener? = null

    override fun onAttach(context: Context) {

        practiceFragmentListener = context as? PracticeFragmentListener

        if (practiceFragmentListener == null) {
            throw ClassCastException("$context must implement PracticeFragmentListener")
        }
        super.onAttach(context)
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.topic_list, container, false)

        setUpViewModel(view)

        return view
    }

    private fun setUpViewModel(view: View) {
        var adapter = PracticeFragmentAD(practiceFragmentListener)
        var rvPractice : RecyclerView = view.findViewById(R.id.rv_topic_list)
        rvPractice.adapter = adapter

        val viewModel : TopicVM by activityViewModels()

        viewModel.topics.observe(viewLifecycleOwner) {topics ->
            adapter.topics = topics
        }
    }

    interface PracticeFragmentListener {
        fun onPracticeItemClicked(topicId : Int, topicTitle : String)
    }
}