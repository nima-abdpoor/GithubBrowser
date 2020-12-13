package com.nima.githubbrowser.home

import com.nima.githubbrowser.home.list.RepoItem

sealed class HomeViewState
object HomeViewStateLoading : HomeViewState()
data class HomeViewStateLoaded(val repoItems: List<RepoItem>) : HomeViewState()
data class HomeViewStateError(val message : String) : HomeViewState()