package com.geekbrains.framework.square

import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEndSingle

interface SquareView: MvpView {
    @AddToEndSingle
    fun setResult(result: String)
}