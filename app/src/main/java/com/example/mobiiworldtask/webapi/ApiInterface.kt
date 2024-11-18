package com.example.mobiiworldtask.webapi

import com.example.mobiiworldtask.models.ResponseListRepos
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("/orgs/square/repos")
    suspend fun getAllRepos(): Response<ResponseListRepos>
}