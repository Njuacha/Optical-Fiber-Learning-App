package com.example.opticalfiberlearninggame.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.fragment.app.commit
import androidx.viewpager.widget.ViewPager
import com.example.opticalfiberlearninggame.R
import com.example.opticalfiberlearninggame.adapter.SectionsPagerAD
import com.example.opticalfiberlearninggame.fragment.PracticeFR
import com.example.opticalfiberlearninggame.fragment.TheoryFR
import com.example.opticalfiberlearninggame.view_model.TopicVM
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity(), PracticeFR.PracticeFragmentListener, TheoryFR.TheoryFragmentListener {

    private var tabletMode: Boolean = false

    companion object {
        const val DETAIL_MODE = "mode"
        const val TOPIC_ID = "tid"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var detailsContainer: View? = findViewById(R.id.detail_container)

        if (detailsContainer != null) {
            tabletMode = true
        }

        // create view model so that it starts loading topics from database before fragments  are created
        val viewModel: TopicVM by viewModels()

        val sectionsPagerAdapter = SectionsPagerAD(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)

        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))
        tabs.addOnTabSelectedListener(TabLayout.ViewPagerOnTabSelectedListener(viewPager))

        if (savedInstanceState == null && tabletMode) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add(R.id.detail_container, TheoryFR())
            }
        }


    }


    override fun onTheoryItemClicked(topicId: Int) {
        if (tabletMode) {

        } else {
            startActivity(Intent(this , DetailActivity::class.java).apply {
                putExtra(DETAIL_MODE, 1)
                putExtra(TOPIC_ID, topicId)
            } )
        }
    }

    override fun onPracticeItemClicked(topicId: Int) {
        if (tabletMode) {

        } else {
            startActivity(Intent(this , DetailActivity::class.java).apply {
                putExtra(DETAIL_MODE, 2)
                putExtra(TOPIC_ID, topicId)
            } )
        }
    }


}
