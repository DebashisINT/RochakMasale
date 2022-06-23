package com.rochakmasalefsm.features.activities.api

import com.rochakmasalefsm.features.member.api.TeamApi
import com.rochakmasalefsm.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}