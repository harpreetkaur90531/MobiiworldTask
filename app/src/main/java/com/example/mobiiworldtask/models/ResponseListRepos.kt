package com.example.mobiiworldtask.models


import com.google.gson.annotations.SerializedName

data class ResponseListRepos(
    @SerializedName("data")
    var data: List<Repo>,
    @SerializedName("page")
    var page: Int,
    @SerializedName("per_page")
    var perPage: Int,
    @SerializedName("support")
    var support: Owner,
    @SerializedName("total")
    var total: Int,
    @SerializedName(
        "total_pages")
    var totalPages: Int
)