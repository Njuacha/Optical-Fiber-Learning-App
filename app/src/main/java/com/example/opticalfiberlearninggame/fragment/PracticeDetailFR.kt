package com.example.opticalfiberlearninggame.fragment

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.widget.AppCompatImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.opticalfiberlearninggame.R
import com.example.opticalfiberlearninggame.activity.MainActivity.Companion.TOPIC_ID
import com.example.opticalfiberlearninggame.model.QuestionWithAnswers
import com.example.opticalfiberlearninggame.view_model.PracticeDetailFragmentVM

class PracticeDetailFR : Fragment() {

    private var questionNoTv: TextView? = null
    private var questionTv: TextView? = null
    private var answerAtv: TextView? = null
    private var answerBtv: TextView? = null
    private var answerCtv: TextView? = null
    private var answerDtv: TextView? = null
    private var answerAch: CheckBox? = null
    private var answerBch: CheckBox? = null
    private var answerCch: CheckBox? = null
    private var answerDch: CheckBox? = null

    private var progressBar: ProgressBar? = null

    private var isAnswerACorrectAns = false
    private var isAnswerBCorrectAns = false
    private var isAnswerCCorrectAns = false
    private var isAnswerDCorrectAns = false
    private var currentQuestionIndex = 0
    private var numberOfQuestions = 0
    private var numCorrectAnswersGiven = 0
    private var failedPreviousQuestion = false;
    private val currentQuestionIndexExtra = "current question index"
    private val numCorrectAnswersGivenExtra = "number of correct answers given"
    private val failedPrevQuestionExtra = "failed previous question or not"


    companion object {
        const val USER_SCORE = "user score"
        const val TOTAL_SCORE = "total score"
        const val USER_MESSAGE = "user message"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.practice_detail_fragment, container, false)
        Log.d("topicId", arguments?.getInt("topicId", 0).toString())

        questionNoTv = view.findViewById(R.id.question_no)
        questionTv = view.findViewById(R.id.question)
        answerAtv = view.findViewById(R.id.answer_a_value)
        answerBtv = view.findViewById(R.id.answer_b_value)
        answerCtv = view.findViewById(R.id.answer_c_value)
        answerDtv = view.findViewById(R.id.answer_d_value)
        answerAch = view.findViewById(R.id.answer_a_checkbox)
        answerBch = view.findViewById(R.id.answer_b_checkbox)
        answerCch = view.findViewById(R.id.answer_c_checkbox)
        answerDch = view.findViewById(R.id.answer_d_checkbox)
        progressBar = view.findViewById(R.id.progressBar)

        if (savedInstanceState != null) {
            currentQuestionIndex = savedInstanceState.getInt(currentQuestionIndexExtra)
            numCorrectAnswersGiven = savedInstanceState.getInt(numCorrectAnswersGivenExtra)
            failedPreviousQuestion = savedInstanceState.getBoolean(failedPrevQuestionExtra)
        }

        setUpViewModel(view)

        return view
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.apply {
            putInt(numCorrectAnswersGivenExtra, numCorrectAnswersGiven)
            putInt(currentQuestionIndexExtra, currentQuestionIndex)
            putBoolean(failedPrevQuestionExtra, failedPreviousQuestion)
        }
        super.onSaveInstanceState(outState)
    }

    private fun setUpViewModel(view: View) {

        val viewModel: PracticeDetailFragmentVM by activityViewModels()

        var topicId = requireArguments().getInt(TOPIC_ID)
        viewModel.topicId = topicId

        viewModel.questionWithAnswers?.observe(viewLifecycleOwner ) { list ->
            if (list.isNotEmpty()) {
                setUpQuestion(list[currentQuestionIndex])
                numberOfQuestions = list.size
                progressBar?.max = numberOfQuestions
            } else {
                Toast.makeText(context, "Questions have not yet been implemented here !", Toast.LENGTH_LONG).show()
            }
        }

        val submitBtn = view.findViewById<Button>(R.id.btn_submit)

        submitBtn.setOnClickListener {
            when (submitBtn.text) {
                "check" -> {

                    // if this condition is true then user failed question
                    if (isAnswerACorrectAns != answerAch?.isChecked || isAnswerBCorrectAns != answerBch?.isChecked || isAnswerCCorrectAns != answerCch?.isChecked || isAnswerDCorrectAns != answerDch?.isChecked) {

                        view.findViewById<AppCompatImageView>(R.id.img_marking).setImageResource(R.drawable.close_outline)
                        failedPreviousQuestion = true

                        // show correct answer
                        val answers = viewModel.questionWithAnswers?.value?.get(currentQuestionIndex)?.answers
                        if (answers != null) {
                            if (answers[0].isCorrectAnswer) answerAtv?.setTextColor(Color.GREEN)
                            if (answers[1].isCorrectAnswer) answerBtv?.setTextColor(Color.GREEN)
                            if (answers[2].isCorrectAnswer) answerCtv?.setTextColor(Color.GREEN)
                            if (answers[3].isCorrectAnswer) answerDtv?.setTextColor(Color.GREEN)
                        }


                    } else  {
                        failedPreviousQuestion = false
                        numCorrectAnswersGiven += 1

                    }

                    view.findViewById<AppCompatImageView>(R.id.img_marking).visibility = View.VISIBLE


                    if (currentQuestionIndex == numberOfQuestions-1) {
                        // show score dialog
                        val scoreResultsDialogFR = ScoreResultsDialogFR()
                        val bundle = Bundle()
                        bundle.putString(USER_SCORE, numCorrectAnswersGiven.toString())
                        bundle.putString(TOTAL_SCORE, numberOfQuestions.toString())

                        var scoreFraction = numCorrectAnswersGiven.toDouble() / numberOfQuestions
                        var message = ""
                        if (scoreFraction < 0.5) {
                            message = getString(R.string.bad_score_msg)
                        } else if (scoreFraction == 0.5) {
                            message = getString(R.string.avg_score_msg)
                        } else {
                            message = getString(R.string.good_score_msg)
                        }

                        bundle.putString(USER_MESSAGE, message)

                        scoreResultsDialogFR.arguments = bundle
                        scoreResultsDialogFR.show(childFragmentManager, "scoreDialog")

                        submitBtn.text = getString(R.string.close)
                    } else {
                        submitBtn.text = getString(R.string.next)
                    }

                    // update progress
                    progressBar?.incrementProgressBy(1)

                }
                "next" -> {
                    if (failedPreviousQuestion) {
                        answerAtv?.setTextColor(Color.DKGRAY)
                        answerBtv?.setTextColor(Color.DKGRAY)
                        answerCtv?.setTextColor(Color.DKGRAY)
                        answerDtv?.setTextColor(Color.DKGRAY)
                        // setting back the default icon
                        view.findViewById<AppCompatImageView>(R.id.img_marking).setImageResource(R.drawable.check_outline)
                    }

                    currentQuestionIndex += 1

                    view.findViewById<AppCompatImageView>(R.id.img_marking).visibility = View.GONE
                    viewModel.questionWithAnswers?.value?.get(currentQuestionIndex)?.let(this::setUpQuestion)
                    submitBtn.text = getString(R.string.check)

                }
                else -> {
                    activity?.finish()
                }
            }
        }


    }

    private fun setUpQuestion(questionWithAnswers: QuestionWithAnswers) {
        val answers = questionWithAnswers.answers

        answerAch?.isChecked = false
        answerBch?.isChecked = false
        answerCch?.isChecked = false
        answerDch?.isChecked = false

        questionNoTv?.text = (currentQuestionIndex+1).toString()
        questionTv?.text = questionWithAnswers.question.question
        answerAtv?.text = answers[0].answer
        answerBtv?.text = answers[1].answer
        answerCtv?.text = answers[2].answer
        answerDtv?.text = answers[3].answer

        isAnswerACorrectAns = answers[0].isCorrectAnswer
        isAnswerBCorrectAns = answers[1].isCorrectAnswer
        isAnswerCCorrectAns = answers[2].isCorrectAnswer
        isAnswerDCorrectAns = answers[3].isCorrectAnswer

    }
}
