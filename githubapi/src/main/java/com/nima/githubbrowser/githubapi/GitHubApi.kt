package com.nima.githubbrowser.githubapi

import com.nima.githubbrowser.githubapi.model.RepoApiMode
import com.nima.githubbrowser.githubapi.model.UserApiModel

interface GitHubApi {
    fun getTopRepositories() : List<RepoApiMode>
}
class MockGitHubApi() : GitHubApi{
    override fun getTopRepositories(): List<RepoApiMode> {
        return listOf(
            RepoApiMode(
                id = 1L,
                name = "Mock" ,
                description = "Mock Repo Description" ,
                owner = UserApiModel(id = 1L , login = "nima") ,
                stargazersCount = 1 ,
                forkCount = 1 ,
                contributorsUrl = "asad" ,
                createData = "1/1/2021" ,
                updateDate = "1/1/2021"
            )
        )
    }

}