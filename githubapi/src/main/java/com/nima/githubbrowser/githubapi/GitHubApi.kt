package com.nima.githubbrowser.githubapi

import com.nima.githubbrowser.githubapi.model.RepoApiModel
import com.nima.githubbrowser.githubapi.model.UserApiModel
import javax.inject.Inject
import javax.inject.Singleton

interface GitHubApi {
    fun getTopRepositories() : List<RepoApiModel>
}
@Singleton
class MockGitHubApi @Inject constructor(): GitHubApi{
    override fun getTopRepositories(): List<RepoApiModel> {
        return listOf(
            RepoApiModel(
                id = 1L,
                name = "Mock" ,
                description = "Mock Repo Description" ,
                owner = UserApiModel(id = 1L , login = "nima") ,
                stargazersCount = 1 ,
                forkCount = 1 ,
                contributorsUrl = "experience" ,
                createData = "1/1/2021" ,
                updateDate = "1/1/2021"
            )
        )
    }

}