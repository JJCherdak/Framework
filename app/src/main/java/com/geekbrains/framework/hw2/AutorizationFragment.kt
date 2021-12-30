package com.geekbrains.framework.hw2

import android.os.Bundle
import android.view.View
import com.geekbrains.framework.App
import com.geekbrains.framework.R
import com.geekbrains.framework.databinding.FragmentAutorizationBinding
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter

class AutorizationFragment
    : MvpAppCompatFragment(R.layout.fragment_autorization), AutorizationView {

    private val presenter by moxyPresenter { AutorizationPresenter(App.router) }

    private lateinit var binding: FragmentAutorizationBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAutorizationBinding.bind(view)
    }

    companion object {
        fun newInstance(): AutorizationFragment = AutorizationFragment()
    }

    override fun showEmptyPasswordError() {
        TODO("Not yet implemented")
    }

    override fun showEmptyLoginError() {
        TODO("Not yet implemented")
    }
}