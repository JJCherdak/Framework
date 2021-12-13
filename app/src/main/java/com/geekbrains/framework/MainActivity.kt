package com.geekbrains.framework


import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geekbrains.framework.App.Navigation.navigatorHolder
import com.geekbrains.framework.App.Navigation.router
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
            router.navigateTo(UsersScreen)
        }
    }

    override fun onPause() {
        navigatorHolder.removeNavigator()
        super.onPause()
    }
}