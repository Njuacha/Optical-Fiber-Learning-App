package com.example.opticalfiberlearninggame.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.opticalfiberlearninggame.R
import com.example.opticalfiberlearninggame.fragment.PracticeFR
import com.example.opticalfiberlearninggame.fragment.TheoryFR

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */

class SectionsPagerAD(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        when(position) {
            0 -> return TheoryFR()
            else -> return PracticeFR()
        }
    }


    override fun getCount(): Int {
        // Show 2 total pages.
        return 2
    }
}