package com.example.mobiiworldtask.models


import com.google.gson.annotations.SerializedName

data class ResponseListRepos(
    @SerializedName("stargazers_count")
    var stargazers_count: String,
    @SerializedName("name")
    var page: String
)