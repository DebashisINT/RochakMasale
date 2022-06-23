package com.rochakmasalefsm.features.viewAllOrder.interf

import com.rochakmasalefsm.app.domain.NewOrderGenderEntity
import com.rochakmasalefsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}