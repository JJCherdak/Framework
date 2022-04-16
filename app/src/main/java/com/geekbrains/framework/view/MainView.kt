package com.geekbrains.framework.view

import com.geekbrains.framework.presenter.MainPresenter


interface MainView {
    fun setButtonText(index: Int, text: String)
}