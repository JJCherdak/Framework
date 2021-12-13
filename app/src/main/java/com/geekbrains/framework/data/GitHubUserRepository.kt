package com.geekbrains.framework.data

interface GitHubUserRepository {

    fun getUsers(): List<GitHubUser>

    fun getUserByLogin(userId: String): GitHubUser?

}