package com.nima.githubbrowser.application

import android.content.Context
import com.nima.githubbrowser.appdeps.ApplicationDeps
import com.nima.githubbrowser.githubapi.GitHubApiModule
import com.nima.githubbrowser.repository.AppRepository
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [GitHubApiModule::class])
interface ApplicationComponent : ApplicationDeps {


    @Component.Factory
    interface Factory{
        fun create(@BindsInstance context : Context) : ApplicationComponent
    }
}