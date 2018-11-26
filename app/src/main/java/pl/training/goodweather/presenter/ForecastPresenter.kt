package pl.training.goodweather.presenter

import pl.training.goodweather.view.ForecastView

class ForecastPresenter : MvpPresenter<ForecastView> {
    private var view : ForecastView? = null

    override fun attachView(view: ForecastView) {
        this.view = view
        view.showMessage("refreshing weather")
    }

    override fun detachView() {
        this.view = null
    }


}