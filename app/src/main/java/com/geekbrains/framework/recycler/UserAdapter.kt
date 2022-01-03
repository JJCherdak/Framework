package com.geekbrains.framework.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.geekbrains.framework.data.GitHubUser
import com.geekbrains.framework.databinding.ViewUserBinding

class UsersAdapter(private val onUserClickListener: OnUserClickListener?): ListAdapter<GitHubUser, UserViewHolder>(UserDiff()) {

    interface OnUserClickListener {
        fun onUserPicked(user: GitHubUser)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val itemBinding = ViewUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return UserViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) =
        holder.bind(getItem(position), onUserClickListener)

}