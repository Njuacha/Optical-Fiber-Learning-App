package com.example.opticalfiberlearninggame.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import com.example.opticalfiberlearninggame.R
import com.example.opticalfiberlearninggame.activity.MainActivity.Companion.CONTENT_PATH
import com.example.opticalfiberlearninggame.activity.MainActivity.Companion.TOPIC_ID
import kotlinx.android.synthetic.main.theory_detail.*
import java.lang.ClassCastException
import kotlin.concurrent.thread

class TheoryDetailFR: Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.theory_detail, container, false)
        setUpViewModel(view)
        return view
    }


    private fun setUpViewModel(view: View) {
        var webView: WebView = view.findViewById(R.id.html_content)
        val contentPath = ("file:///android_asset/topic_".plus(requireArguments().getInt(TOPIC_ID))).plus(".html")
        webView.loadUrl(contentPath)
    }

}