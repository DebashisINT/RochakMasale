package com.rochakmasalefsm.features.viewAllOrder.interf

import com.rochakmasalefsm.app.domain.NewOrderColorEntity
import com.rochakmasalefsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}