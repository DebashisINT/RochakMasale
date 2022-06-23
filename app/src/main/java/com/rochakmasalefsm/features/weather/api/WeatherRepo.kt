package com.rochakmasalefsm.features.weather.api

import com.rochakmasalefsm.base.BaseResponse
import com.rochakmasalefsm.features.task.api.TaskApi
import com.rochakmasalefsm.features.task.model.AddTaskInputModel
import com.rochakmasalefsm.features.weather.model.ForeCastAPIResponse
import com.rochakmasalefsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}