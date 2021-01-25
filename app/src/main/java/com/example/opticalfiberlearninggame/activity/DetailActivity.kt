package com.example.opticalfiberlearninggame.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.opticalfiberlearninggame.R
import com.example.opticalfiberlearninggame.activity.MainActivity.Companion.DETAIL_MODE
import com.example.opticalfiberlearninggame.activity.MainActivity.Companion.TOPIC_ID
import com.example.opticalfiberlearninggame.activity.MainActivity.Companion.TOPIC_TITLE
import com.example.opticalfiberlearninggame.fragment.PracticeDetailFR
import com.example.opticalfiberlearninggame.fragment.TheoryDetailFR

class DetailActivity : AppCompatActivity() {

    private var mDetailMode = 1
    private var mTopicId = 1
    private var mTopicTitle = ""
    private val THEORY_MODE = 1
    private val PRACTICE_MODE = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        if (intent == null) return

        mDetailMode = intent.getIntExtra(DETAIL_MODE, 1)
        mTopicId = intent.getIntExtra(TOPIC_ID, 1)
        mTopicTitle = intent.getStringExtra(TOPIC_TITLE)

        val bundle = Bundle()
        lateinit var frag : Fragment
        bundle.putInt(TOPIC_ID, mTopicId)
        bundle.putString(TOPIC_TITLE, mTopicTitle)

        when (mDetailMode) {
            THEORY_MODE -> {
                frag = TheoryDetailFR()
                title = getString(R.string.tab_text_1).plus("-").plus(mTopicTitle)
            }
            PRACTICE_MODE -> {
                frag = PracticeDetailFR()
                title = getString(R.string.tab_text_2).plus("-").plus(mTopicTitle)
            }
        }

        frag.arguments = bundle

        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add(R.id.practice_detail_container, frag)
            }
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        when(mDetailMode) {
            THEORY_MODE -> menuInflater.inflate(R.menu.detail_practice, menu)
            PRACTICE_MODE -> menuInflater.inflate(R.menu.detail_theory, menu)
        }

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId) {
            R.id.practice_menu_icon -> {
                intent.putExtra(DETAIL_MODE, PRACTICE_MODE)
                intent.putExtra(TOPIC_ID, mTopicId)
                intent.putExtra(TOPIC_TITLE, mTopicTitle)
                finish()
                startActivity(intent)
            }
            R.id.theory_menu_icon -> {
                intent.putExtra(DETAIL_MODE, THEORY_MODE)
                intent.putExtra(TOPIC_ID, mTopicId)
                intent.putExtra(TOPIC_TITLE, mTopicTitle)
                finish()
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

}
