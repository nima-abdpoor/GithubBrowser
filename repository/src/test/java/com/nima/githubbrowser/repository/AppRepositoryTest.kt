package com.nima.githubbrowser.repository

import com.nima.githubbrowser.githubapi.GitHubApi
import com.nima.githubbrowser.githubapi.model.RepoApiModel
import com.nima.githubbrowser.githubapi.model.UserApiModel
import org.junit.Before
import org.junit.Test

private val fakeRepoModel = RepoApiModel(
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

class AppRepositoryTest {
    private lateinit var appRepository: AppRepository
    private val fakeGitHubApi = FakeGitHubApi()
    @Before
    fun setup(){
        appRepository = AppRepository(fakeGitHubApi)
    }
    @Test
    fun successfulQuery(){
        val topRepos = appRepository.getTopRepos()
        assert((topRepos.size) == 1)
        assert(topRepos[0] == fakeRepoModel)

    }
}



private class FakeGitHubApi : GitHubApi{
    override fun getTopRepositories(): List<RepoApiModel> {
        return listOf(fakeRepoModel)
    }
}