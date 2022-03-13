package com.geekbrains.framework

import com.geekbrains.framework.CountersModel
import com.geekbrains.framework.MainView

class MainPresenter(
    private val view: MainView,
    private val model: CountersModel = CountersModel()
) {


    fun counterClick(type: ButtonType) {
        val dataFromModel = when (type) {
            ButtonType.FIRST -> model.next(0)
            ButtonType.SECOND -> model.next(1)
            ButtonType.THIRD-> model.next(2)
        }
        view.setButtonText(type, dataFromModel.toString())
    }
}

    enum class ButtonType {
        FIRST,
        SECOND,
        THIRD

    }
