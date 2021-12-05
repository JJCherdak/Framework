package com.geekbrains.framework


import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.geekbrains.framework.R.layout.activity_main

class MainActivity : AppCompatActivity(activity_main), MainView {

    private val presenter = MainPresenter(this)

    private val btn_counter1: Button by lazy { findViewById(R.id.btn_counter1) }
    private val btn_counter2: Button by lazy { findViewById(R.id.btn_counter2) }
    private val btn_counter3: Button by lazy { findViewById(R.id.btn_counter3) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val listener = View.OnClickListener { view ->
            val type = when (view.id) {
                R.id.btn_counter1 -> ButtonType.FIRST
                R.id.btn_counter2 -> ButtonType.SECOND
                R.id.btn_counter3 -> ButtonType.THIRD
                else -> throw IllegalStateException("Такой кнопки нет")
            }
            presenter?.counterClick(type)
        }

        btn_counter1.setOnClickListener(listener)
        btn_counter2.setOnClickListener(listener)
        btn_counter3.setOnClickListener(listener)
    }

    //Подсказка к ПЗ: поделить на 3 отдельные функции и избавиться от index
    override fun setButtonText(type: ButtonType, text: String) {
        when(type){
            ButtonType.FIRST-> btn_counter1.text = text
            ButtonType.SECOND -> btn_counter2.text = text
            ButtonType.THIRD -> btn_counter3.text = text
        }
    }

}