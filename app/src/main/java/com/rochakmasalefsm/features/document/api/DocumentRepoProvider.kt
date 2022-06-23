package com.rochakmasalefsm.features.document.api

import com.rochakmasalefsm.features.dymanicSection.api.DynamicApi
import com.rochakmasalefsm.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}