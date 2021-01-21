package com.example.opticalfiberlearninggame.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.example.opticalfiberlearninggame.R
import com.example.opticalfiberlearninggame.activity.MainActivity.Companion.TOPIC_ID


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
        webView.settings.domStorageEnabled = true
        webView.settings.javaScriptEnabled = true

        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(pView: WebView, pUrl: String): Boolean {
                pView.loadUrl(pUrl)
                return false
            }
        }
    }

}