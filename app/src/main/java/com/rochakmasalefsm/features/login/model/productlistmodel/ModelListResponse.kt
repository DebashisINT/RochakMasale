package com.rochakmasalefsm.features.login.model.productlistmodel

import com.rochakmasalefsm.app.domain.ModelEntity
import com.rochakmasalefsm.app.domain.ProductListEntity
import com.rochakmasalefsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}