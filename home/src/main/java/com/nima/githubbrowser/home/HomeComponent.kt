package com.nima.githubbrowser.home

import com.nima.githubbrowser.appdeps.ApplicationDeps
import com.nima.githubbrowser.appdeps.applicationDeps
import dagger.Component


@Component(modules = [HomeModule::class] , dependencies =[ApplicationDeps::class] )
interface HomeComponent {
    fun inject(homeFragment: HomeFragment)

    @Component.Factory
    interface Factory{
        fun create(applicationDeps: ApplicationDeps) : HomeComponent
    }
}
fun HomeFragment.inject(){
    DaggerHomeComponent.factory()
        .create(requireContext().applicationDeps())
        .inject(this)
}