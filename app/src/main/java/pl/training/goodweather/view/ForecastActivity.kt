package pl.training.goodweather.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.toast
import pl.training.goodweather.ForecastApplication
import pl.training.goodweather.R
import pl.training.goodweather.presenter.ForecastPresenter
import pl.training.goodweather.presenter.MvpPresenter
import javax.inject.Inject

class ForecastActivity : AppCompatActivity(), ForecastView {

    @Inject
    lateinit var presnter : ForecastPresenter

    override fun showMessage(message: String) {
        toast(message)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forecast_view)
        ForecastApplication.graph.inject(this)
        presnter.attachView(this)
    }

    override fun onDestroy() {
        presnter.detachView()
        super.onDestroy()
    }
}
