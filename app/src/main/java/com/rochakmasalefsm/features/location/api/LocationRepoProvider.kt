package com.rochakmasalefsm.features.location.api

import com.rochakmasalefsm.features.location.shopdurationapi.ShopDurationApi
import com.rochakmasalefsm.features.location.shopdurationapi.ShopDurationRepository

/**
 * Created by Saikat on 17-Aug-20.
 */
object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}