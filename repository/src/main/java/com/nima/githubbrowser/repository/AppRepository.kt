package com.nima.githubbrowser.repository

import com.nima.githubbrowser.githubapi.GitHubApi
import com.nima.githubbrowser.githubapi.model.RepoApiModel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppRepository @Inject constructor(
    private val gitHubApi : GitHubApi
) {
    fun getTopRepos() : List<RepoApiModel>{
        return gitHubApi.getTopRepositories()
    }
}