package com.rochakmasalefsm.features.newcollection.model

import com.rochakmasalefsm.app.domain.CollectionDetailsEntity
import com.rochakmasalefsm.base.BaseResponse
import com.rochakmasalefsm.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}