package com.example.mobiiworldtask.models


import com.google.gson.annotations.SerializedName

data class Owner(
    @SerializedName("text")
    var text: String,
    @SerializedName("url")
    var url: String
)