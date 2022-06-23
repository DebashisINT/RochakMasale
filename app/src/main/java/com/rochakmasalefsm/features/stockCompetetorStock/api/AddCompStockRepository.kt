package com.rochakmasalefsm.features.stockCompetetorStock.api

import com.rochakmasalefsm.base.BaseResponse
import com.rochakmasalefsm.features.orderList.model.NewOrderListResponseModel
import com.rochakmasalefsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.rochakmasalefsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}