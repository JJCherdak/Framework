package com.geekbrains.framework.square

import android.os.Bundle
import android.view.View
import com.geekbrains.framework.R
import com.geekbrains.framework.databinding.FragmentSquareBinding
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter

class SquareFragment : MvpAppCompatFragment(R.layout.fragment_square), SquareView {

    private val presenter by moxyPresenter { SquarePresenter() }

    private var _binding: FragmentSquareBinding? = null
    private val binding get() = _binding!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSquareBinding.bind(view)

        binding.countButton.setOnClickListener{
            presenter.onCountButtonClicked(binding.numberInputEditText.text.toString())
        }
    }

    override fun setResult(result: String) {
        binding.resultTextView.text = result}

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object{
        fun newInstance(): SquareFragment = SquareFragment()
    }


}