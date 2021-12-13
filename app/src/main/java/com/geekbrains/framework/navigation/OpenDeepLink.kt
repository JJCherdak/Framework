package com.geekbrains.framework.navigation

import com.github.terrakok.cicerone.Command
import com.github.terrakok.cicerone.Forward
import com.geekbrains.framework.mvpuser.UserScreen


class OpenDeepLink(private val deepLinkUserId: String) : CustomRouter.Command, Command {

    override fun execute(navigator: CustomNavigator) {
        navigator.applyCommand(Forward(UserScreen(deepLinkUserId)))
    }
}