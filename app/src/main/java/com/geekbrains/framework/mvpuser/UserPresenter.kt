package com.geekbrains.framework.mvpuser

import moxy.MvpPresenter
import com.geekbrains.framework.data.GitHubUserRepository
import com.geekbrains.framework.navigation.CustomRouter

class UserPresenter(
    private val userLogin: String,
    private val userRepository: GitHubUserRepository,
    private val router: CustomRouter
) : MvpPresenter<UserView>() {

    override fun onFirstViewAttach() {
        userRepository
            .getUserByLogin(userLogin)
            ?.let(viewState::showUser)
    }
}