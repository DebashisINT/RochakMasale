package com.rochakmasalefsm.features.dashboard.presentation.api.dayStartEnd

import com.rochakmasalefsm.features.stockCompetetorStock.api.AddCompStockApi
import com.rochakmasalefsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}