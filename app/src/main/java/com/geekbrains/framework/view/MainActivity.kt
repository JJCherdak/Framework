package com.geekbrains.framework.view


import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.geekbrains.framework.databinding.ActivityMainBinding
import com.geekbrains.framework.presenter.MainPresenter

class MainActivity : AppCompatActivity(), MainView {

    private val presenter = MainPresenter(this)

    private var binding: ActivityMainBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val listener = View.OnClickListener {
            presenter.counterClick(it.id)
        }

        binding!!.btnCounter1.setOnClickListener(listener)
        binding!!.btnCounter2.setOnClickListener(listener)
        binding!!.btnCounter3.setOnClickListener(listener)
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    //Подсказка к ПЗ: поделить на 3 отдельные функции и избавиться от index
    override fun setButtonText(index: Int, text: String) {
        when(index){
            0->binding!!.btnCounter1.text = text
            1->binding!!.btnCounter2.text = text
            2->binding!!.btnCounter3.text = text
        }
    }

}