package com.nima.githubbrowser.githubapi

import dagger.Binds
import dagger.Module

@Module
interface GitHubApiModule {
    @Binds
    fun bindGithubApi(mockGitHubApi: MockGitHubApi) : GitHubApi
}