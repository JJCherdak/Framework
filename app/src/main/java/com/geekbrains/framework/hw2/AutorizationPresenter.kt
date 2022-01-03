package com.geekbrains.framework.hw2

import com.geekbrains.framework.data.GitHubUser
import com.geekbrains.framework.mvpuser.UserScreen
import com.github.terrakok.cicerone.Router
import moxy.MvpPresenter
import com.geekbrains.framework.hw2.GreetingsScreen


    class AutorizationPresenter(private val router: Router) : MvpPresenter<AutorizationView>() {

        fun onGoButtonClick(login: String, password: String) {
            var validationPassed = true

            if (password.isBlank()) {
                viewState.showEmptyPasswordError()
                validationPassed = false
            }

            if (login.isBlank()) {
                viewState.showEmptyLoginError()
                validationPassed = false
            }

            if (validationPassed) router.navigateTo(GreetingsScreen(login))
        }


    }
