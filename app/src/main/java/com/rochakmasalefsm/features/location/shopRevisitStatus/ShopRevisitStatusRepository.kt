package com.rochakmasalefsm.features.location.shopRevisitStatus

import com.rochakmasalefsm.base.BaseResponse
import com.rochakmasalefsm.features.location.model.ShopDurationRequest
import com.rochakmasalefsm.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}