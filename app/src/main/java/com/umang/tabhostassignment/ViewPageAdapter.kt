package com.umang.tabhostassignment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPageAdapter(fm: FragmentActivity, var tabs: Int) : FragmentStateAdapter(fm) {
    override fun getItemCount(): Int {
        return tabs
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> LoginFragment()
            1 -> RegisterFragment()
            2 -> QueryFragment()
            else -> createFragment(position)
        }
    }

}
