package com.rochakmasalefsm.features.location.api

import com.rochakmasalefsm.app.NetworkConstant
import com.rochakmasalefsm.base.BaseResponse
import com.rochakmasalefsm.features.location.model.AppInfoInputModel
import com.rochakmasalefsm.features.location.model.AppInfoResponseModel
import com.rochakmasalefsm.features.location.model.MeetingDurationInputParams
import com.rochakmasalefsm.features.location.model.ShopDurationRequest
import com.rochakmasalefsm.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * Created by Saikat on 17-Aug-20.
 */
interface LocationApi {

    @POST("AppInfo/DeviceInformatio")
    fun submitAppInfo(@Body appInfo: AppInfoInputModel?): Observable<BaseResponse>

    @FormUrlEncoded
    @POST("AppInfo/GetDeviceInformation")
    fun getAppInfo(@Field("session_token") session_token: String, @Field("user_id") user_id: String): Observable<AppInfoResponseModel>

    /**
     * Companion object to create the ShopDurationApi
     */
    companion object Factory {
        fun create(): LocationApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOutNoRetry())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.BASE_URL)
                    .build()

            return retrofit.create(LocationApi::class.java)
        }
    }
}