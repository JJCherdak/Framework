package com.geekbrains.framework

import com.geekbrains.framework.model.CountersModel
import com.geekbrains.framework.presenter.MainPresenter
import com.geekbrains.framework.view.MainView
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import org.mockito.MockitoAnnotations

class CountersModelTest {
    private val model: CountersModel = mock(CountersModel::class.java)
    private val index = 0

    @Test
    fun nextTest() {
        `when`(model.next(index)).thenReturn(0)
        assertEquals(index, model.next(0))
    }
}