package com.geekbrains.framework


import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geekbrains.framework.App.Navigation.navigatorHolder
import com.geekbrains.framework.App.Navigation.router
import com.geekbrains.framework.hw2.AutorizationScreen
import com.geekbrains.framework.mvpusers.UsersScreen
import com.geekbrains.framework.navigation.CustomNavigator

class MainActivity : AppCompatActivity() {
    private val navigator = CustomNavigator(activity = this, R.id.content)

    override fun onResumeFragments() {
        super.onResumeFragments()
        navigatorHolder.setNavigator(navigator)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            router.navigateTo(AutorizationScreen)
        }
    }

    override fun onPause() {
        navigatorHolder.removeNavigator()
        super.onPause()
    }
}

// Выбрал вариант задание про Switchmap.
// и так? как я понял, switchmap в отличие от flatmap подписывается на последний Observable
// при этом отписываясь от всех остальных. Т.е он отписывается от предыдущего, когла новый
// источник начинает испускать события. Это удобно, допустим при поисковых запросах, когда предыдущий
//запрос уже не актуален, и можно делать отписку этого источника