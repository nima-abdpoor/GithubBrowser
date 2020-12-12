package com.nima.githubbrowser.githubapi.model

data class RepoApiModel(
    val id : Long ,
    val name : String ,
    val description  :String,
    val owner  :UserApiModel,
    val stargazersCount  :Int,
    val forkCount  :Int,
    val contributorsUrl  :String,
    val createData  :String,
    val updateDate  :String,
)