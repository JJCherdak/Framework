package com.geekbrains.framework


import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock


class MainPresenterTest {

    private val btn_counter1 = 0
    private val btn_counter2 = 1
    private val btn_counter3 = 2

    private val presenter : MainPresenter = mock(MainPresenter::class.java)

    @Test
    fun btn_counter1Test(){
        presenter.counterClick(ButtonType.FIRST)
        Assert.assertEquals(0, ButtonType.FIRST)
    }

    @Test
    fun btn_counter2Test(){
        presenter.counterClick(ButtonType.SECOND)
        Assert.assertEquals(1, ButtonType.SECOND)
    }

    @Test
    fun btn_counter3Test(){
        presenter.counterClick(ButtonType.THIRD)
        Assert.assertEquals(2, ButtonType.THIRD)
    }

}