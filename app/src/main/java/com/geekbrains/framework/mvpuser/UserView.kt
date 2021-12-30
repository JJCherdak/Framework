package com.geekbrains.framework.mvpuser

import moxy.MvpView
import moxy.viewstate.strategy.alias.SingleState
import com.geekbrains.framework.data.GitHubUser

interface UserView : MvpView {

    @SingleState
    fun showUser(user: GitHubUser)

}