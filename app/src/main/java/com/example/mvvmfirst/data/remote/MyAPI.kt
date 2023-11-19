package com.example.mvvmfirst.data.remote

import retrofit2.http.GET

interface MyAPI {
    @GET(value = "test")
    suspend fun doNetworkCall()

}