package com.geekbrains.framework.mvpusers
import moxy.MvpView
import moxy.viewstate.strategy.alias.SingleState
import com.geekbrains.framework.data.GitHubUser

interface UsersView : MvpView {

    @SingleState
    fun showUsers(users: List<GitHubUser>)

}