package com.nima.githubbrowser.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nima.githubbrowser.home.list.RepoItem
import com.nima.githubbrowser.repository.AppRepository
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    private val appRepository: AppRepository
) : ViewModel() {
    private val _viewState = MutableLiveData<HomeViewState>(HomeViewStateLoading)

    val viewStateUpdates : LiveData<HomeViewState> = _viewState

    init {

        val topRepos = appRepository.getTopRepos()
        _viewState.value = HomeViewStateLoaded(
            repoItems = topRepos.map { repoApiModel ->
               RepoItem(
                   name = repoApiModel.name,
                   description = repoApiModel.description,
                   starsCount = repoApiModel.stargazersCount,
                   forkCount = repoApiModel.forkCount
               )
            }
        )
    }
}