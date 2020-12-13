package com.nima.githubbrowser.appdeps

import android.content.Context
import com.nima.githubbrowser.repository.AppRepository
import java.lang.IllegalArgumentException

interface ApplicationDeps {

    fun appRepository()  :AppRepository
}

fun Context.applicationDeps() : ApplicationDeps{
    return (applicationContext as? HasApplicationDeps)?.getApplicationDeps()
        ?:throw IllegalArgumentException("Application must implement HasApplicationDeps")
}