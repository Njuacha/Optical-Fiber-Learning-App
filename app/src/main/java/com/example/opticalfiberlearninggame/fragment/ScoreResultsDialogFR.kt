package com.example.opticalfiberlearninggame.fragment

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.TextView

import androidx.fragment.app.DialogFragment
import com.example.opticalfiberlearninggame.R
import com.example.opticalfiberlearninggame.fragment.PracticeDetailFR.Companion.TOTAL_SCORE
import com.example.opticalfiberlearninggame.fragment.PracticeDetailFR.Companion.USER_MESSAGE
import com.example.opticalfiberlearninggame.fragment.PracticeDetailFR.Companion.USER_SCORE
import java.lang.IllegalStateException

class ScoreResultsDialogFR: DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)

            val inflater = requireActivity().layoutInflater;

            val view = inflater.inflate(R.layout.score_dialog, null)

            val userScore = arguments?.getString(USER_SCORE)
            val totalScore = arguments?.getString(TOTAL_SCORE)
            val userMessage = arguments?.getString(USER_MESSAGE)

            view.findViewById<TextView>(R.id.user_score).text = userScore
            view.findViewById<TextView>(R.id.total_score).text = totalScore
            view.findViewById<TextView>(R.id.user_message).text = userMessage

            builder.setTitle(getString(R.string.your_score))
                .setView(view)
                .setPositiveButton(getString(R.string.ok), null)

            builder.create()
        }?: throw IllegalStateException("Activity cannot be null")
    }
}