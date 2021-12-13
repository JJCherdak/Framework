package com.geekbrains.framework.mvpusers
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter
import com.geekbrains.framework.App.Navigation.router
import com.geekbrains.framework.R
import com.geekbrains.framework.data.GitHubUser
import com.geekbrains.framework.data.GitHubUserRepositoryFactory
import com.geekbrains.framework.databinding.ViewUsersBinding
import com.geekbrains.framework.recycler.UsersAdapter

class UsersFragment: MvpAppCompatFragment(R.layout.view_users), UsersView, UsersAdapter.OnUserClickListener {

    private val presenter: UsersPresenter by moxyPresenter {
        UsersPresenter(
            userRepository = GitHubUserRepositoryFactory.create(),
            router = router
        )
    }

    private val usersAdapter = UsersAdapter(this)
    private lateinit var viewBinging: ViewUsersBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinging = ViewUsersBinding.bind(view)
        viewBinging.usersRecycler.adapter = usersAdapter
    }

    override fun showUsers(users: List<GitHubUser>) {
        usersAdapter.submitList(users)
    }

    override fun onUserPicked(user: GitHubUser) =
        presenter.displayUser(user)

    companion object {
        fun newInstance(): Fragment = UsersFragment()
    }
}