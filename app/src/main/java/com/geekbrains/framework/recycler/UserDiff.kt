package com.geekbrains.framework.recycler

import androidx.recyclerview.widget.DiffUtil
import com.geekbrains.framework.data.GitHubUser

class UserDiff : DiffUtil.ItemCallback<GitHubUser>() {

    override fun areItemsTheSame(oldItem: GitHubUser, newItem: GitHubUser): Boolean {
        return oldItem.login == newItem.login
    }

    override fun areContentsTheSame(oldItem: GitHubUser, newItem: GitHubUser): Boolean {
        return oldItem == newItem
    }
}