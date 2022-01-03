package com.geekbrains.framework

import com.geekbrains.framework.square.SquareScreen
import com.github.terrakok.cicerone.Router
import moxy.MvpPresenter

class MainPresenter(
    private val router: Router
) : MvpPresenter<MainView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        router.replaceScreen(SquareScreen)
    }

}