package com.geekbrains.framework.recycler

import androidx.recyclerview.widget.RecyclerView
import com.geekbrains.framework.data.GitHubUser
import com.geekbrains.framework.databinding.ViewUserBinding

class UserViewHolder(private val viewBinding: ViewUserBinding): RecyclerView.ViewHolder(viewBinding.root) {

    fun bind(user: GitHubUser, onUserClickListener: UsersAdapter.OnUserClickListener?) {
        viewBinding.userLogin.text = user.login
        viewBinding.root.setOnClickListener {
            onUserClickListener?.onUserPicked(user)
        }
    }
}