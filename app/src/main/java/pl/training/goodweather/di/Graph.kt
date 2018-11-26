package pl.training.goodweather.di

import dagger.Component
import pl.training.goodweather.view.ForecastActivity
import pl.training.goodweather.view.ForecastView
import javax.inject.Singleton

@Component(modules = [(ModelModule::class), (PresenterModule::class)])
@Singleton
interface Graph {
    fun inject(forecastActivity: ForecastActivity)
}