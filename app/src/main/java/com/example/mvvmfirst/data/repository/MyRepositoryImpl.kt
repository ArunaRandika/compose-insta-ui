package com.example.mvvmfirst.data.repository

import com.example.mvvmfirst.data.remote.MyAPI
import com.example.mvvmfirst.domain.repository.MyRepository

class MyRepositoryImpl(
    private val myAPI: MyAPI
) : MyRepository {
    override suspend fun doNetworkCall() {
        myAPI.doNetworkCall()
    }
}