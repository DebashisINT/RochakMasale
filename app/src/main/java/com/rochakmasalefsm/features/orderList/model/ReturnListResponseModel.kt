package com.rochakmasalefsm.features.orderList.model

import com.rochakmasalefsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}