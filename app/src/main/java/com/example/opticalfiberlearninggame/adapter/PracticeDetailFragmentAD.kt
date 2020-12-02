package com.example.opticalfiberlearninggame.adapter

import android.opengl.Visibility
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.opticalfiberlearninggame.R
import com.example.opticalfiberlearninggame.model.QuestionWithAnswers
import kotlinx.android.synthetic.main.question_and_answers_item.view.*

class PracticeDetailFragmentAD() : RecyclerView.Adapter<PracticeDetailFragmentAD.ViewHolder>(){

    var isCorrectionTime = false

    var questionAndAnswersList: List<QuestionWithAnswers> = ArrayList()
        set(value) {
            field = value
            notifyDataSetChanged()

            // initialize corrections with false so that if user does not answer a question it is marked as fail as well
            for (i in questionAndAnswersList.indices) {
                corrections[i] = false
            }
        }

    val corrections = mutableMapOf<Int, Boolean>()

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
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
        val imgMarking: AppCompatImageView = view.findViewById(R.id.img_marking)

        init {
            val onCheckedChangeListener =
                CompoundButton.OnCheckedChangeListener() { _: CompoundButton, b: Boolean ->

                    val answers = questionAndAnswersList.get(adapterPosition).answers

                    val isAnswerAasExpected = answers.get(0).isCorrectAnswer == checkBoxA.isChecked
                    val isAnswerBasExpected = answers.get(1).isCorrectAnswer == checkBoxB.isChecked
                    val isAnswerCasExpected = answers.get(2).isCorrectAnswer == checkBoxC.isChecked
                    val isAnswerDasExpected = answers.get(3).isCorrectAnswer == checkBoxD.isChecked


                    corrections[adapterPosition] = isAnswerAasExpected && isAnswerBasExpected && isAnswerCasExpected && isAnswerDasExpected

                }

            checkBoxA.setOnCheckedChangeListener(onCheckedChangeListener)
            checkBoxB.setOnCheckedChangeListener(onCheckedChangeListener)
            checkBoxC.setOnCheckedChangeListener(onCheckedChangeListener)
            checkBoxD.setOnCheckedChangeListener(onCheckedChangeListener)
        }


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.question_and_answers_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        if (position%2 == 0) holder.itemView.background = null
        holder.questionNumberTv.text = (position+1).toString()
        val questionAndAnswers = questionAndAnswersList.get(position)
        holder.questionTv.text = questionAndAnswers.question.question
        holder.answerATv.text = questionAndAnswers.answers.get(0).answer
        holder.answerBTv.text = questionAndAnswers.answers.get(1).answer
        holder.answerCTv.text = questionAndAnswers.answers.get(2).answer
        holder.answerDTv.text = questionAndAnswers.answers.get(3).answer

        if (isCorrectionTime) {
            holder.itemView.layoutParams.height = WRAP_CONTENT
            if (corrections[position]!!) {
                holder.imgMarking.setImageResource(R.drawable.check_outline)
            }

            holder.imgMarking.visibility = View.VISIBLE

        }
    }

    override fun getItemCount() = questionAndAnswersList.size

    fun showCorrectAnswers() {

        isCorrectionTime = true
        notifyDataSetChanged()

    }

}