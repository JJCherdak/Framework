package com.geekbrains.framework.mvpusers

import moxy.MvpPresenter
import com.geekbrains.framework.data.GitHubUser
import com.geekbrains.framework.data.GitHubUserRepository
import com.geekbrains.framework.mvpuser.UserScreen
import com.geekbrains.framework.navigation.CustomRouter

class UsersPresenter(
    private val userRepository: GitHubUserRepository,
    private val router: CustomRouter
): MvpPresenter<UsersView>() {

    override fun onFirstViewAttach() {
        userRepository
            .getUsers()
            .let(viewState::showUsers)
    }

    fun displayUser(user: GitHubUser) =
        router.navigateTo(UserScreen(user.login))

}