package com.heinminlatt.fragmentexample

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.heinminlatt.fragmentexample.fragments.FragmentOne
import com.heinminlatt.fragmentexample.fragments.FragmentTwo

class TabPagerAdapter2 (fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
       when {
           position == 0 -> return FragmentOne()
           else -> return FragmentTwo()
       }
    }
}