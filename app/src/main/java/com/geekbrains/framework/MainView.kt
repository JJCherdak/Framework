package com.geekbrains.framework

import com.geekbrains.framework.ButtonType

interface MainView {
    fun setButtonText(index: ButtonType, text: String)
}