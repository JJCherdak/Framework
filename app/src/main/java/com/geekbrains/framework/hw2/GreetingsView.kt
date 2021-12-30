package com.geekbrains.framework.hw2

import moxy.MvpView
import moxy.viewstate.strategy.alias.SingleState

interface GreetingsView : MvpView {

    @SingleState
    fun showGreetings(login: String)
}