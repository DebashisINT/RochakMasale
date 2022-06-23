package com.rochakmasalefsm.features.viewAllOrder.interf

import com.rochakmasalefsm.app.domain.NewOrderGenderEntity
import com.rochakmasalefsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}