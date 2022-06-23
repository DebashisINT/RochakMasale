package com.rochakmasalefsm.features.location.api

import com.rochakmasalefsm.app.Pref
import com.rochakmasalefsm.base.BaseResponse
import com.rochakmasalefsm.features.location.model.AppInfoInputModel
import com.rochakmasalefsm.features.location.model.AppInfoResponseModel
import com.rochakmasalefsm.features.location.model.ShopDurationRequest
import com.rochakmasalefsm.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable

/**
 * Created by Saikat on 17-Aug-20.
 */
class LocationRepo(val apiService: LocationApi) {
    fun appInfo(appInfo: AppInfoInputModel?): Observable<BaseResponse> {
        return apiService.submitAppInfo(appInfo)
    }

    fun getAppInfo(): Observable<AppInfoResponseModel> {
        return apiService.getAppInfo(Pref.session_token!!, Pref.user_id!!)
    }
}