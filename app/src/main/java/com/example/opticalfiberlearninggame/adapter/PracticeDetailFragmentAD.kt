package com.example.opticalfiberlearninggame.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.opticalfiberlearninggame.R
import com.example.opticalfiberlearninggame.model.QuestionWithAnswers

class PracticeDetailFragmentAD() : RecyclerView.Adapter<PracticeDetailFragmentAD.ViewHolder>(){

    var questionAndAnswersList: List<QuestionWithAnswers> = ArrayList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val questionNumberTv : TextView = view.findViewById(R.id.question_no)
        val questionTv : TextView = view.findViewById(R.id.question)
        val answerATv : TextView = view.findViewById(R.id.answer_a_value)
        val checkBoxA: CheckBox = view.findViewById(R.id.answer_a_checkbox)
        val answerBTv : TextView = view.findViewById(R.id.answer_b_value)
        val checkBoxB: CheckBox = view.findViewById(R.id.answer_b_checkbox)
        val answerCTv : TextView = view.findViewById(R.id.answer_c_value)
        val checkBoxC: CheckBox = view.findViewById(R.id.answer_c_checkbox)
        val answerDTv : TextView = view.findViewById(R.id.answer_d_value)
        val checkBoxD: CheckBox = view.findViewById(R.id.answer_d_checkbox)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.question_and_answers_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.questionNumberTv.text = (position+1).toString()
        val questionAndAnswers = questionAndAnswersList.get(position)
        holder.questionTv.text = questionAndAnswers.question.question
        holder.answerATv.text = questionAndAnswers.answers.get(0).answer
        holder.answerBTv.text = questionAndAnswers.answers.get(1).answer
        holder.answerCTv.text = questionAndAnswers.answers.get(2).answer
        holder.answerDTv.text = questionAndAnswers.answers.get(3).answer
    }

    override fun getItemCount() = questionAndAnswersList.size

}