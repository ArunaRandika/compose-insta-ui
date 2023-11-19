package com.example.mvvmfirst.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.example.mvvmfirst.domain.repository.MyRepository
import javax.inject.Inject

class ContactsViewModel @Inject constructor(
    private val repository: MyRepository
) : ViewModel() {

     suspend fun call(){
        repository.doNetworkCall()
    }


}