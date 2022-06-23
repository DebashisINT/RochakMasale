package com.rochakmasalefsm.features.nearbyuserlist.api

import com.rochakmasalefsm.app.Pref
import com.rochakmasalefsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.rochakmasalefsm.features.newcollection.model.NewCollectionListResponseModel
import com.rochakmasalefsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}