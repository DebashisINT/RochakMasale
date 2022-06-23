package com.rochakmasalefsm.features.newcollectionreport

import com.rochakmasalefsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}