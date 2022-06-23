package com.rochakmasalefsm.features.weather.api

import com.rochakmasalefsm.features.task.api.TaskApi
import com.rochakmasalefsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}