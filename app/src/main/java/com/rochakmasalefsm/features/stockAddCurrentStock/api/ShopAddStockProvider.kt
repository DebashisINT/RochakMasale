package com.rochakmasalefsm.features.stockAddCurrentStock.api

import com.rochakmasalefsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.rochakmasalefsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}