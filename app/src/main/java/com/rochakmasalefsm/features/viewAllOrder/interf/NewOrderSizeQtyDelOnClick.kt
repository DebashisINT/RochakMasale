package com.rochakmasalefsm.features.viewAllOrder.interf

import com.rochakmasalefsm.app.domain.NewOrderGenderEntity
import com.rochakmasalefsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}