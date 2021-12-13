package com.geekbrains.framework.hw2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.github.terrakok.cicerone.androidx.FragmentScreen

object AutorizationScreen : FragmentScreen {

    override fun createFragment(factory: FragmentFactory): Fragment =
        AutorizationFragment.newInstance()

}