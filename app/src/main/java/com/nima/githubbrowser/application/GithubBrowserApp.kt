package com.nima.githubbrowser.application

import android.app.Application
import com.nima.githubbrowser.appdeps.ApplicationDeps
import com.nima.githubbrowser.appdeps.HasApplicationDeps

class GithubBrowserApp : Application() , HasApplicationDeps {
    private val appComponent by lazy {
        DaggerApplicationComponent.factory().create(this)
    }

    override fun getApplicationDeps(): ApplicationDeps {
        return appComponent
    }
}