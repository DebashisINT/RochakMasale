package com.rochakmasalefsm.features.dashboard.presentation.api.dayStartEnd

import com.rochakmasalefsm.app.Pref
import com.rochakmasalefsm.base.BaseResponse
import com.rochakmasalefsm.features.dashboard.presentation.model.DaystartDayendRequest
import com.rochakmasalefsm.features.dashboard.presentation.model.StatusDayStartEnd
import com.rochakmasalefsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.rochakmasalefsm.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }


}