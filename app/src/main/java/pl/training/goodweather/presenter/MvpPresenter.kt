package pl.training.goodweather.presenter

import pl.training.goodweather.view.MvpView

interface MvpPresenter<in V : MvpView> {
    fun attachView(view : V){

    }

    fun viewWillChange(){

    }

    fun detachView()
}