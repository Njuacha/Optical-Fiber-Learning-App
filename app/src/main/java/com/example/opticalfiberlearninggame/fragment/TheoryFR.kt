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
import com.example.opticalfiberlearninggame.adapter.TheoryFragmentAD
import com.example.opticalfiberlearninggame.view_model.TopicVM
import java.lang.ClassCastException

class TheoryFR : Fragment() {

    var theoryFragmentListener: TheoryFragmentListener? = null

    override fun onAttach(context: Context) {
        theoryFragmentListener = context as? TheoryFragmentListener

        if (theoryFragmentListener == null) {
            throw ClassCastException("$context must implement TheoryFragmentListener")
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
        var adapter = TheoryFragmentAD(theoryFragmentListener)
        var rvTheory : RecyclerView = view.findViewById(R.id.rv_topic_list)
        rvTheory.adapter = adapter

        val viewModel : TopicVM by activityViewModels()

        viewModel.topics.observe(viewLifecycleOwner) {topics ->
            adapter.topics = topics
        }
    }

    interface TheoryFragmentListener {
        fun onTheoryItemClicked(tid : Int)
    }
}