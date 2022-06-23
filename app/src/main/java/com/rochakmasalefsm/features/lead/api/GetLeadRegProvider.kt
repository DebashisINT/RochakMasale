package com.rochakmasalefsm.features.lead.api

import com.rochakmasalefsm.features.NewQuotation.api.GetQuotListRegRepository
import com.rochakmasalefsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}