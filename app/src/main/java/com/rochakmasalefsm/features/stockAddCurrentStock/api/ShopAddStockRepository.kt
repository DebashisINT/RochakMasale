package com.rochakmasalefsm.features.stockAddCurrentStock.api

import com.rochakmasalefsm.base.BaseResponse
import com.rochakmasalefsm.features.location.model.ShopRevisitStatusRequest
import com.rochakmasalefsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.rochakmasalefsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.rochakmasalefsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.rochakmasalefsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}