package com.rochakmasalefsm.features.viewAllOrder.interf

import com.rochakmasalefsm.app.domain.NewOrderProductEntity
import com.rochakmasalefsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}