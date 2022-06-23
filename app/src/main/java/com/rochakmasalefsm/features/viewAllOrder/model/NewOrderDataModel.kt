package com.rochakmasalefsm.features.viewAllOrder.model

import com.rochakmasalefsm.app.domain.NewOrderColorEntity
import com.rochakmasalefsm.app.domain.NewOrderGenderEntity
import com.rochakmasalefsm.app.domain.NewOrderProductEntity
import com.rochakmasalefsm.app.domain.NewOrderSizeEntity
import com.rochakmasalefsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

