package com.geekbrains.framework.hw2

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndSingleStrategy::class)
interface AutorizationView : MvpView {
    fun showEmptyPasswordError()
    fun showEmptyLoginError()
}