package com.example.mvvmfirst.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}