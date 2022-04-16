package com.geekbrains.framework

import com.geekbrains.framework.presenter.MainPresenter
import com.geekbrains.framework.view.MainView
import com.nhaarman.mockito_kotlin.times
import com.nhaarman.mockito_kotlin.verify
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations


class  MainPresenterTest {

    private lateinit var presenter: MainPresenter
    private val btnClickOne = 0

    @Mock
    private lateinit var mainView: MainView

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        presenter = MainPresenter(mainView)
    }


    @Test
    fun button_counter1Test() {
        presenter.counterClick(btnClickOne)
        Assert.assertEquals(0, btnClickOne)
    }

}
