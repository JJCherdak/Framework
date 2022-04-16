package com.geekbrains.framework.presenter

import com.geekbrains.framework.R
import com.geekbrains.framework.model.CountersModel
import com.geekbrains.framework.view.MainView


class MainPresenter(private val view: MainView){
    private val model = CountersModel()


    fun counterClick(type: Int) {
        when (type) {
            R.id.btn_counter1 -> {
                val nextValue = model.next(0)
                view.setButtonText(0, nextValue.toString())
            }
            R.id.btn_counter2 -> {
                val nextValue = model.next(1)
                view.setButtonText(1, nextValue.toString())
            }
            R.id.btn_counter3 -> {
                val nextValue = model.next(2)
                view.setButtonText(2, nextValue.toString())
            }
        }
    }
}