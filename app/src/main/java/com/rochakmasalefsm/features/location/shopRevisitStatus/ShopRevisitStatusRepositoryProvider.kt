package com.rochakmasalefsm.features.location.shopRevisitStatus

import com.rochakmasalefsm.features.location.shopdurationapi.ShopDurationApi
import com.rochakmasalefsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}