package com.geekbrains.framework.hw2

import moxy.MvpPresenter

class GreetingsPresenter(private val login: String) : MvpPresenter<GreetingsView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.showGreetings(login)
    }
}